package ru.mpei.l13;

import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;

public class MyAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("I'm born");
        if (this.getLocalName().equals("agent1")) {
//            this.addBehaviour(new MyWakerBehvior(this, 7_000));
            this.addBehaviour(new MyTikerBehaviour(this, 1_000));
        } else {
            this.addBehaviour(new MyBehviour());
//            this.addBehaviour(new MyParallelBehaviour(ParallelBehaviour.WHEN_ANY));
        }
//        this.addBehaviour(new MyOneShotBehavior());
//        this.addBehaviour(new MyWakerBehvior(this, 1_000));
//        this.addBehaviour(new MyTikerBehaviour(this, 1_000));
//        this.addBehaviour(new MyBehviour());
//        this.doDelete();
    }
}
