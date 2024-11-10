package ru.mpei.l14.FsmTests;

import jade.core.AID;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class SendBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(new AID("agent2", false));
        System.out.println("send message");
        myAgent.send(msg);
    }
}
