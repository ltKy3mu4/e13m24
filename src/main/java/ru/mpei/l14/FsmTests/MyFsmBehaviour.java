package ru.mpei.l14.FsmTests;

import jade.core.behaviours.FSMBehaviour;

public class MyFsmBehaviour extends FSMBehaviour {
    public MyFsmBehaviour() {
        registerFirstState(new SendBehaviour(), "sendMsg");
        registerState(new Wait(myAgent, 2_000), "wait");
        registerState(new ReeiveBehaviour(), "receive");
        registerState(new Action1(), "action1");
        registerState(new Action2(), "action2");
        registerLastState(new EndBehawiour(), "end");

        registerDefaultTransition("sendMsg", "wait");
        registerDefaultTransition("wait", "receive");
        registerTransition("receive", "action1", 1);
        registerTransition("receive", "action2", 2);
        registerDefaultTransition("action1", "end");
        registerDefaultTransition("action2", "end");
    }
}
