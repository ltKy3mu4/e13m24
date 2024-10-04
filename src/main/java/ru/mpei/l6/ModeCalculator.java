package ru.mpei.l6;

import ru.mpei.l6.exceptions.SystemNotFoundException;

public class ModeCalculator {
    private String[] nodes;

    public double calc(String[] nodes, String[] links) throws SystemNotFoundException{
        String system = null;
        for (String node : nodes) {
            if (node.equalsIgnoreCase("ees")){
                system = node;
            }
        }
        if (system == null){
            throw new SystemNotFoundException("System was not found, cannot calulcate mode");
        }
        this.nodes = nodes;

        for (String l: links){
            l.length();
        }
        return 0.0;
    }

    public void clear(){
        nodes = null;
    }

}
