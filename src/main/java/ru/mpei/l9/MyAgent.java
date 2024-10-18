package ru.mpei.l9;

import jade.core.AID;
import jade.core.Agent;

public class MyAgent extends Agent {

    @Override
    protected void setup() {
        super.setup();
        this.addBehaviour(new HelloBehaviour());
        this.addBehaviour(new ReceiveBehaviour());
        AID brother;
        if (this.getLocalName().equals("Smith")){
            brother = new AID("UncleJoe", false);
        } else {
            brother = new AID("Smith", false);
        }

        this.addBehaviour(new PeriodicMsgSpammerBehaviour(this, 3000, brother));

    }
}
