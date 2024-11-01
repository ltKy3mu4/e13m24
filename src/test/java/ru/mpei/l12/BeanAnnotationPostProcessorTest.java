package ru.mpei.l12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mpei.l12.impl.Worker;

import java.util.List;

class BeanAnnotationPostProcessorTest {

    @Test
    public void postProcessorTest1(){
        BeanAnnotationPostProcessor p =new BeanAnnotationPostProcessor();
        List<Worker> all = p.findAll();
        Assertions.assertEquals(2, all.size());
    }

}