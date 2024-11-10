package ru.mpei.l13;

import jade.core.behaviours.ParallelBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class MyParallelBehaviour extends ParallelBehaviour {
    public MyParallelBehaviour(int endCondition) {

        super(endCondition);
        this.addSubBehaviour(new MyBehviour());
        this.addSubBehaviour(new WakerBehaviour(myAgent, 5_000) {
            @Override
            protected void onWake() {
                super.onWake();
            }
        });
    }
}
