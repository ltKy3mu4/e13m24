package ru.mpei.l20;

import java.util.ArrayList;
import java.util.List;

public class AutoCounter {

    private int counter = 0;

    private List<Subscriber> subscribers = new ArrayList<>();

    public void start(){
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                increment();
            }
        }).start();
    }

    public void increment(){
        counter++;
        subscribers.forEach(s -> s.notify(counter));
    }

    public void addSubscriber(Subscriber s){
        subscribers.add(s);
    }
}
