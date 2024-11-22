package ru.mpei.l17;

public class Job {
    private int calcCounter = 0;

    private final Object o = new Object();

    public  void calc(){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        increment();
        synchronized (o){
            calcCounter++;
        }
    }

    private synchronized void increment(){
        calcCounter++;
    }

    public int getCalcCounter() {
        return calcCounter;
    }
}
