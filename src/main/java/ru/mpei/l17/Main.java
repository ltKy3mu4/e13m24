package ru.mpei.l17;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            while(true){
//                System.out.println("hello from new thread");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        t1.start();
//
//        MyThread t2 = new MyThread();
//        t2.start();
//
//        System.out.println("hello from main thread");
//        SpammerThread spammerThread = new SpammerThread();
//        spammerThread.setDaemon(true);
//        spammerThread.start();

//        Thread.sleep(100);
//        spammerThread.stopMyThread();
//        spammerThread.interrupt();

//        Job job = new Job();
//
//
//        Thread clacT1 = new Thread(() -> {
//            for (int i= 0; i < 200; i++){
//                job.calc();
//            }
//        });
//        clacT1.start();
//
//        Thread clacT2 = new Thread(() -> {
//            for (int i= 0; i < 200; i++){
//                job.calc();
//            }
//        });
//        clacT2.start();
//
//        Thread.sleep(1200);
//        System.out.println(job.getCalcCounter());

        List<String> l = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            l.add(i+"");
        }
//
//        for(String v : l){
//            l.remove(v);
//        }

        new Thread(() -> {
            while (true){
                l.add(Math.random()+"");
            }
        }).start();

        new Thread(() -> {
            while (true){
                for (String s : l) {
                    System.out.println(s);
                }
            }
        }).start();


    }
}
