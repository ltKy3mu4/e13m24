package ru.mpei.l12.impl;

import ru.mpei.l12.Bean;

@Bean(name = "latins")
public class OnlyLatinsLetterCheckWorker implements Worker{
    @Override
    public int doWork(String str) {
        if (str.matches("^[a-zA-Z ]+$")) return 0;
        return 1;
    }
}
