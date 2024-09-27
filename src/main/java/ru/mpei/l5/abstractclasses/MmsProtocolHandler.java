package ru.mpei.l5.abstractclasses;

public class MmsProtocolHandler extends ProtocolHandler{
    private MmsConnection mmsConnection = new MmsConnection("127.0.0.1", 502);

    public void send(double value, String tag) {
//        System.out.println("sedning "+value + " for "+ tag);
//        mmsConnection.sendData();
    }

    @Override
    public ProtocolType getType() {
        return ProtocolType.MMS;
    }


    private static class MmsConnection{
        public MmsConnection (String ip, int port) {
            //...
        }

        public boolean connect(){
            return true;
        }

        public void sendData(byte[] bytes){
            //...
        }
    }
}
