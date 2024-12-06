package ru.mpei.l19.udp;

import lombok.Setter;

import java.util.function.Consumer;


public class EasyUdpDetector {
    private UdpPublisher publisher;
    private UdpSubscriber subscriber;
    private Thread senderThread ;

    @Setter
    private Consumer<String> otherAgentsDetectorConsumer = s -> System.err.println(s);
    public void start(String agentName){
        subscriber = new UdpSubscriber();
        subscriber.start(9000);
        subscriber.setConsumer(otherAgentsDetectorConsumer);
        publisher = new UdpPublisher();
        publisher.create("127.0.0.1", 9000);
        senderThread= new Thread(() -> {
            while(true) {
                publisher.send(agentName);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        senderThread.start();
    }

}
