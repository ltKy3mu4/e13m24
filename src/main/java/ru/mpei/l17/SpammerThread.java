package ru.mpei.l17;

public class SpammerThread extends Thread{
    private int i =0;
    private boolean start = true;
    @Override
    public void run() {
        while (start){
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(System.currentTimeMillis() + " "+i++);
        }
    }

    public void stopMyThread(){
        start = false;
    }
}
