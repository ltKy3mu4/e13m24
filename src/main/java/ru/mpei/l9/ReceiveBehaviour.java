package ru.mpei.l9;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class ReceiveBehaviour extends Behaviour {
    private boolean msgReceived = false;
    @Override
    public void action() {
        System.out.println("action!");
        MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.PROPOSE);
//        MessageTemplate mt = MessageTemplate.and(
//                MessageTemplate.MatchPerformative(ACLMessage.PROPOSE),
//                MessageTemplate.MatchProtocol("weather")
//        );
        ACLMessage msg = myAgent.receive(mt);
        if (msg != null){
            System.out.println("receive msg "+msg.getContent());
            ACLMessage reply = msg.createReply();
            reply.setPerformative(ACLMessage.INFORM);
            reply.setContent("reply hello");
            myAgent.send(reply);
            msgReceived = true;
        }else {
            block();
        }
    }

    @Override
    public boolean done() {
        return msgReceived;
    }
}
