package ru.mpei.l14.FsmTests;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class ReeiveBehaviour extends Behaviour {
    private MessageTemplate mt;
    private int resp;
    private int counter = 0;

    @Override
    public void onStart() {
        super.onStart();
        this.mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
    }

    @Override
    public void action() {
        ACLMessage msg = myAgent.receive(mt);
        if (msg != null) {
            System.out.println("receive");
            this.resp = Integer.parseInt(msg.getContent());
            counter++;
        } else {
            block();
        }
    }

    @Override
    public boolean done() {
        return this.counter == 1;
    }

    @Override
    public int onEnd() {
        return this.resp;
    }
}
