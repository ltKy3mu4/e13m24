package ru.mpei.l14.YellowPages;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;

import java.util.List;

public class SearchBehaviour extends TickerBehaviour {
    public SearchBehaviour(Agent a, long period) {
        super(a, period);
    }

    @Override
    protected void onTick() {
        List<AID> agents = DfHelper.findAgents(myAgent, "service1");
        System.out.println(myAgent.getLocalName() + " find " + agents.size() + " agents");
    }
}
