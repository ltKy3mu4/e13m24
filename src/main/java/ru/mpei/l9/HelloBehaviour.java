package ru.mpei.l9;

import jade.core.behaviours.OneShotBehaviour;

public class HelloBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        System.out.println("hello, i was born: "+myAgent.getLocalName());
    }
}
