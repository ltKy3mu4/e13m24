package ru.mpei.l9;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;

public class PeriodicMsgSpammerBehaviour extends TickerBehaviour {
    private AID receiver;
    public PeriodicMsgSpammerBehaviour(Agent a, long period, AID receiver) {
        super(a, period);
        this.receiver = receiver;
    }

    @Override
    protected void onTick() {
        System.out.println("sent msg");
        ACLMessage msg = new ACLMessage(ACLMessage.PROPOSE);
        msg.setContent("hello from "+myAgent.getLocalName());
        msg.addReceiver(receiver);
        myAgent.send(msg);
    }
}
