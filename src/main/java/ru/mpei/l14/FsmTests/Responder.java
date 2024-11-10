package ru.mpei.l14.FsmTests;

import jade.core.Agent;

public class Responder extends Agent {
    @Override
    protected void setup() {
        this.addBehaviour(new RespondBehaviour());
    }
}
