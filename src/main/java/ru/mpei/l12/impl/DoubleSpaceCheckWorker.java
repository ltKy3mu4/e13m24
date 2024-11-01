package ru.mpei.l12.impl;

import ru.mpei.l12.Bean;

@Bean(name = "double space")
public class DoubleSpaceCheckWorker implements Worker {
    @Override
    public int doWork(String str) {
        int counter = 0;
        boolean spaceFound = false;
        for (char c : str.toCharArray()) {
            if (c == ' '){
                if (spaceFound){
                    counter++;
                    spaceFound = false;
                }  else {
                    spaceFound = true;
                }
            } else {
                spaceFound = false;
            }
        }
        return counter;
    }
}
