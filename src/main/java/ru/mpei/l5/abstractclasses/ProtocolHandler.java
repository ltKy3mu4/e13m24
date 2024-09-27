package ru.mpei.l5.abstractclasses;

public abstract class ProtocolHandler {

    protected String ip;
    protected  int port;

    public abstract void send(double val, String tag);

    public abstract ProtocolType getType();

    public void print(){
        System.out.println("something");
    }
}
