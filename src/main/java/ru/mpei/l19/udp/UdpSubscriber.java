package ru.mpei.l19.udp;

import lombok.Setter;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.function.Consumer;

public class UdpSubscriber {

    private DatagramSocket socket;
    private Thread t;
    @Setter
    private Consumer<String> consumer;
    public void start(int port){
        t = new Thread(() -> {
            try {
                socket = new DatagramSocket(port);
            } catch (SocketException e) {
                throw new RuntimeException(e);
            }

            byte[] data = new byte[1500];

            DatagramPacket p = new DatagramPacket(data, data.length);
            while (true){
                try {
                    socket.receive(p);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (consumer!= null){
                    consumer.accept(new String(p.getData(), 0, p.getLength()));
                }
            }
        });
        t.start();
    }

    public void stop(){
        if (t!=null){
            t.interrupt();
        }
    }

}
