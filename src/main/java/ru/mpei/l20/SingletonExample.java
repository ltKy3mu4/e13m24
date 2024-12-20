package ru.mpei.l20;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample (){}

    public synchronized static SingletonExample getInstance(){
        if (instance == null){
            instance = new SingletonExample();
        }
        return instance;
    }

}
