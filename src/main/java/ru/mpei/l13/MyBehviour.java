package ru.mpei.l13;

import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class MyBehviour extends Behaviour {
//    private MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.INFORM);
    MessageTemplate mt;

    @Override
    public void onStart() {
        System.err.println("on start method act");
        mt = MessageTemplate.or(
                MessageTemplate.MatchPerformative(ACLMessage.INFORM),
                MessageTemplate.MatchProtocol("1231312"));
    }

    private int counter = 0;
    @Override
    public void action() {
//        counter++;
//        block();

        ACLMessage msg = myAgent.receive(mt);
        System.out.println("action method act");
        if (msg != null) {
            System.out.println(msg.getContent());
//            ACLMessage answer = new ACLMessage(ACLMessage.INFORM);
//            answer.addReceiver(msg.getSender());
//            myAgent.send(answer);
            this.counter++;
        } else {
            block();
        }
    }

    @Override
    public int onEnd() {
        System.err.println("on end method act");
        return 1;
    }

    @Override
    public boolean done() {
        System.err.println("done method act");
        return this.counter == 10;
    }
}
