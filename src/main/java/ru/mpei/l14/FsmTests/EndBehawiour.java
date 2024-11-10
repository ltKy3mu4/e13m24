package ru.mpei.l14.FsmTests;

import jade.core.behaviours.OneShotBehaviour;

public class EndBehawiour extends OneShotBehaviour {

    @Override
    public void action() {
        System.out.println("end");
    }
}
