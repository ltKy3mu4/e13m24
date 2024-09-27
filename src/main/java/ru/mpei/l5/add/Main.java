package ru.mpei.l5.add;

import ru.mpei.l5.abstractclasses.Iec104ProtocolHandler;
import ru.mpei.l5.abstractclasses.ProtocolHandler;
import ru.mpei.l5.abstractclasses.ProtocolType;

public class Main {
    public static void main(String[] args) {
//        double v = Double.parseDouble("false");

        ProtocolHandler ph = new Iec104ProtocolHandler();

        //1
        if (ph.getClass().equals(Iec104ProtocolHandler.class)){
            System.out.println("true");
        }

        if (ph instanceof  Iec104ProtocolHandler){
            System.out.println("true");
        }
        ProtocolType type = ph.getType();
        if (type.ordinal() == 1){
            System.out.println();
        }

    }
}
