package ru.mpei.l12;


import org.reflections.Reflections;
import ru.mpei.l12.impl.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BeanAnnotationPostProcessor {

    public List<Worker> findAll(){
        Reflections r = new Reflections(Worker.class);
        Set<Class<?>> typesAnnotatedWith = r.getTypesAnnotatedWith(Bean.class);
        List<Worker> resultList = new ArrayList<>();

        for (Class<?> aClass : typesAnnotatedWith) {
            try {
                Class<?>[] interfaces = aClass.getInterfaces();
                boolean workerInterfaceFound = false;
                for (Class<?> in : interfaces) {
                    if (in.equals(Worker.class)){
                        workerInterfaceFound = true;
                        break;
                    }
                }
                if (!workerInterfaceFound) {
                    System.err.println("class "+ aClass.getSimpleName()+" doesn't implement interface Worker");
                    continue;
                } else {
                    System.err.println("Bean "+ aClass.getAnnotation(Bean.class).name() +" will be added to collections");
                }

                Worker o = (Worker) aClass.newInstance();
                resultList.add(o);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return resultList;

    }

}
