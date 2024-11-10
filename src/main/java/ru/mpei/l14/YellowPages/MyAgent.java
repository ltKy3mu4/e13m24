package ru.mpei.l14.YellowPages;

import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;

public class MyAgent extends Agent {
    @Override
    protected void setup() {
//        DFAgentDescription agentDescription = new DFAgentDescription();
//        agentDescription.setName(this.getAID());
//        ServiceDescription serviceDescription = new ServiceDescription();
//        serviceDescription.setType("service1");
//        serviceDescription.setName(this.getLocalName());
//        agentDescription.addServices(serviceDescription);
//        try {
//            DFService.register(this, agentDescription);
//        } catch (FIPAException e) {
//            throw new RuntimeException(e);
//        }
        String serviceName = String.valueOf(this.getArguments()[0]);
        DfHelper.registerAgent(this, serviceName);

        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.addBehaviour(new SearchBehaviour(this, 500));

        if (this.getLocalName().equals("agent1")){
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            DfHelper.unregisterAgent(this, serviceName);
        }
    }
}
