package ru.mpei.l19.raw;

import com.sun.jna.NativeLibrary;
import lombok.SneakyThrows;
import org.pcap4j.core.*;
import org.pcap4j.packet.*;
import org.pcap4j.packet.namednumber.EtherType;
import org.pcap4j.packet.namednumber.IpNumber;
import org.pcap4j.packet.namednumber.IpVersion;
import org.pcap4j.packet.namednumber.UdpPort;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.List;

public class PcapPacketManager {

    static {
        NativeLibrary.addSearchPath("wpcap", "C:\\Windows\\System32\\Npcap");
    }

    private PcapHandle pcapHandle;

    @SneakyThrows
    public void start(int port){

        List<PcapNetworkInterface> allDevs = Pcaps.findAllDevs();
        PcapNetworkInterface pcapNetworkInterface = allDevs.stream()
                .filter(e -> e.getName().equals("\\Device\\NPF_Loopback"))
                .findAny()
                .orElseThrow();

        pcapHandle = pcapNetworkInterface.openLive(1500, PcapNetworkInterface.PromiscuousMode.PROMISCUOUS, 50);

        Thread t = new Thread(() -> {
            try {
                pcapHandle.setFilter("ip proto \\udp && dst port "+port, BpfProgram.BpfCompileMode.NONOPTIMIZE);
                pcapHandle.loop(-1, (PacketListener) packet -> {
                    byte[] rawData = packet.getRawData();
                    System.out.println(new String(rawData, 32, rawData.length - 32));
                });
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        t.start();

    }

    public void send(String data, int port) throws SocketException {

        UdpPacket.Builder udpBuilder = new UdpPacket.Builder()
                .srcPort(UdpPort.getInstance((short) port))
                .dstPort(UdpPort.getInstance((short) port))
                .srcAddr(InetAddress.getLoopbackAddress())
                .dstAddr(InetAddress.getLoopbackAddress())
                .correctChecksumAtBuild(true)
                .correctLengthAtBuild(true)
                .payloadBuilder(new UnknownPacket.Builder().rawData(data.getBytes()));

        byte[] rawData1 = udpBuilder.build().getRawData();


        IpV4Packet.Builder ipBuilder = new IpV4Packet.Builder()
                .srcAddr((Inet4Address) InetAddress.getLoopbackAddress())
                .dstAddr((Inet4Address) InetAddress.getLoopbackAddress())
                .protocol(IpNumber.UDP)
                .version(IpVersion.IPV4)
                .ttl((byte) 128)
                .correctChecksumAtBuild(true)
                .tos(IpV4Rfc1349Tos.newInstance((byte )0))
                .correctLengthAtBuild(true)
                .payloadBuilder(udpBuilder);
        var build1 = ipBuilder.build().getRawData();


        byte[] hardwareAddress = NetworkInterface.getByInetAddress(InetAddress.getLoopbackAddress()).getHardwareAddress();
        System.out.println(hardwareAddress);
        EthernetPacket build = new EthernetPacket.Builder()
//                .dstAddr(new byte[6])
//                .srcAddr(new b)
//                .srcAddr(MacAddress.getByAddress(NetworkInterface.getByInetAddress(InetAddress.getLoopbackAddress()).getHardwareAddress()))
//                .dstAddr(MacAddress.getByAddress(HexFormat.ofDelimiter(":").parseHex("ff:ff:ff:ff:ff:ff")))
//                .srcAddr(MacAddress.getByAddress(HexFormat.ofDelimiter(":").parseHex("ff:ff:ff:ff:ff:ff")))
                .type(EtherType.IPV4)
                .pad(new byte[1])
                .payloadBuilder(ipBuilder)
                .build();
        byte[] rawData2 = build.getRawData();


        try {
            byte[] rawData = build.getRawData();
            pcapHandle.sendPacket(build);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
