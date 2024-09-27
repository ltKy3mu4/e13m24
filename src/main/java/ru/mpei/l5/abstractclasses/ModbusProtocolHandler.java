package ru.mpei.l5.abstractclasses;

public class ModbusProtocolHandler extends ProtocolHandler {

    public void send(double value, String tag){
        System.out.println("sedning "+value + " for "+ tag);
    }

    @Override
    public ProtocolType getType() {
        return ProtocolType.MODBUS;
    }

}
