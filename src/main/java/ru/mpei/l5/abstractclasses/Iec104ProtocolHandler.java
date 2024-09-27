package ru.mpei.l5.abstractclasses;

public class Iec104ProtocolHandler extends ProtocolHandler {

    @Override
    public void send(double value, String tag){
        System.out.println("IEC104 :sedning "+value + " for "+ tag);
    }

    @Override
    public ProtocolType getType() {
        return ProtocolType.IEC104;
    }

    public void getInfo(){
        System.out.println("this is iec 104 portocol");
    }

}
