package ru.mpei.l14.FsmTests;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class RespondBehaviour extends Behaviour {
    private MessageTemplate mt;
    @Override
    public void onStart() {
        super.onStart();
        this.mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
    }

    @Override
    public void action() {
        ACLMessage msg = myAgent.receive();
        if (msg != null) {
            ACLMessage resp = msg.createReply();
            resp.setContent("0");
            myAgent.send(resp);
        }
    }

    @Override
    public boolean done() {
        return false;
    }
}
