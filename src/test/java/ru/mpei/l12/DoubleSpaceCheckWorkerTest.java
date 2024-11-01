package ru.mpei.l12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mpei.l12.impl.DoubleSpaceCheckWorker;

class DoubleSpaceCheckWorkerTest {

    @Test
    public void doubleSpaceExist(){
        DoubleSpaceCheckWorker worker = new DoubleSpaceCheckWorker();
        int i = worker.doWork("Hello from  Mpei!  ");
        Assertions.assertEquals(2, i);
    }

    @Test
    public void doubleSpaceAbsent(){
        DoubleSpaceCheckWorker worker = new DoubleSpaceCheckWorker();
        int i = worker.doWork("Hello from Mpei! ");
        Assertions.assertEquals(0, i);
    }

}