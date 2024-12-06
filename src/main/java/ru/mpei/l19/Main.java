package ru.mpei.l19;

import lombok.SneakyThrows;
import ru.mpei.l19.raw.PcapPacketManager;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
//        UdpSubscriber s = new UdpSubscriber();
//        s.setConsumer((msg) -> System.err.println(msg));
//        s.start(9000);
//
//        UdpPublisher p = new UdpPublisher();
//        p.create("127.0.0.1", 9000);
//        int counter = 0;
//        while (true){
//            p.send("data"+counter++);
//            Thread.sleep(1000);
//        }
//        EasyUdpDetector d1 = new EasyUdpDetector();
//        d1.start("Agent1");
//
//        EasyUdpDetector d2 = new EasyUdpDetector();
//        d2.start("Agent1");

        PcapPacketManager s = new PcapPacketManager();
        s.start(9000);

        while (true){
            s.send("hello", 9000);
            Thread.sleep(1000);
        }

//        PcapPacketSubscriber s2 = new PcapPacketSubscriber();
//        s2.start(9000);
//
//        UdpPublisher p = new UdpPublisher();
//        p.create("127.0.0.1", 9000);
//        int counter = 0;
//        while (true) {
//            p.send("data" + counter++);
//            Thread.sleep(1000);
//        }
    }
}
