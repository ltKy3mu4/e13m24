package ru.mpei.l14.FsmTests;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;

public class Wait extends WakerBehaviour {
    public Wait(Agent a, long timeout) {
        super(a, timeout);
    }

    @Override
    protected void onWake() {
        super.onWake();
        System.out.println("wait");
    }
}
