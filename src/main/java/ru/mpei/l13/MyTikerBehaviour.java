package ru.mpei.l13;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class MyTikerBehaviour extends TickerBehaviour {
    public MyTikerBehaviour(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        System.out.println("spam from ticker");
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.setProtocol("1231312");
        msg.setContent("hi");
        msg.addReceiver(new AID("agent2", false));
        myAgent.send(msg);
    }

}
