package ru.mpei.l12;

import ru.mpei.l12.impl.Worker;

import java.util.List;

public class StringChecker {

    private List<Worker> workers;

    public StringChecker() {
        BeanAnnotationPostProcessor p = new BeanAnnotationPostProcessor();
        this.workers = p.findAll();
    }

    public boolean check(String str){
        int sum = 0;
        for (Worker worker : workers) {
            int i = worker.doWork(str);
            sum += i;
        }
        return sum == 0;
    }
}
