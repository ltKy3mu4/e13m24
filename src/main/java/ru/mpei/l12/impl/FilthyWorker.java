package ru.mpei.l12.impl;

import ru.mpei.l12.Bean;

import java.util.List;

@Bean
public class FilthyWorker {

    public List<Worker> findAll(){
        throw new RuntimeException();
    }
}
