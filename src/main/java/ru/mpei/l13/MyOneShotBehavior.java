package ru.mpei.l13;

import jade.core.behaviours.OneShotBehaviour;

public class MyOneShotBehavior extends OneShotBehaviour {
    @Override
    public void action() {
        System.out.println("one shot behaviour act");
    }
}
