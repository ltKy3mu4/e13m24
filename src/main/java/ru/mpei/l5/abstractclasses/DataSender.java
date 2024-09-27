package ru.mpei.l5.abstractclasses;

public class DataSender {

    private ProtocolHandler protocol;

    public DataSender(ProtocolHandler protocol) {
        this.protocol = protocol;
    }

    public void send(double v){
        protocol.send(v, "tag");
    }

}
