package ru.mpei.l17;

public class MyThread extends Thread{

    @Override
    public void run() {
        while (true){
            System.err.println("hello from my thread");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
