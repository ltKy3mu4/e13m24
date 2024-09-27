package ru.mpei.l5.abstractclasses;

public class Main {

    public static void main(String[] args) {
        ProtocolHandler ph = null;
        ProtocolHandler[] protocols = {new Iec104ProtocolHandler(), new MmsProtocolHandler(), new ModbusProtocolHandler()};
//        String[] protocolNames = {"iec104", "mms", "modbus"};
//        switch (args[0]){
//            case "iec104":
//            case "МЭК 60870-5-104":
//                ph = new Iec104ProtocolHandler();
//                break;
//            case "MMS":
//                ph = new MmsProtocolHandler();
//                break;
//            case "Modbus":
//                ph = new ModbusProtocolHandler();
//                break;
//            default:
//                System.err.println("unkown protocol");
//                System.exit(-1);
//        }
//
//        for (int i = 0; i < protocolNames.length; i++) {
//            if (args[0].equals(protocolNames[i])){
//                ph = protocols[i];
//            }
//        }
//
        for (ProtocolHandler protocol : protocols) {
            if (protocol.getType().name().equalsIgnoreCase(args[0])) {
                ph = protocol;
                break;
            }
        }


        ph.print();
        DataSender ds = new DataSender(ph);
        ds.send(20.2);
    }

//    public static void send(double val, String [] args, String protocolType){
//        switch (protocolType){
//            case "iec104":
//                new Iec104ProtocolHandler().send(val, );
//        }
//
//    }

}
