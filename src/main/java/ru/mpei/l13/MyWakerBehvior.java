package ru.mpei.l13;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;

public class MyWakerBehvior extends WakerBehaviour {
    public MyWakerBehvior(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    protected void onWake() {
        super.onWake();
        System.out.println("waker beh act");

        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
//        msg.setPerformative(ACLMessage.INFORM);
        msg.setProtocol("1231312");
        msg.setContent("hi");
        msg.addReceiver(new AID("agent2", false));
        myAgent.send(msg);
    }
}
