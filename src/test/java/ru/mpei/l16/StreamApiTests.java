package ru.mpei.l16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.mpei.l15.XmlSerialization;
import ru.mpei.l16.cfg.RootCfg;
import ru.mpei.l16.cfg.Worker;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiTests {
    private List<Worker> employee;

    @Test
    public void test1(){
        List<Worker> result = employee.stream()
                .filter(worker -> worker.getSurname().startsWith("J") && worker.getSex().equals("Male"))
                .toList();

        Assertions.assertEquals(2, result.size());
    }

    @Test
    public void allFemalesRelatedToSameDepartment(){
        List<Worker> result = employee.stream()
                .filter(worker -> worker.getSex().equals("Female") && worker.getDepartment().equals("Yandex"))
                .toList();
        System.out.println(result);
        Assertions.assertEquals(2, result.size());
    }

    @Test
    public void allWorkersOlder30ReturnDepartment(){
        Set<String> result = employee.stream()
                .filter(worker -> worker.getAge() >= 30)
                .map(worker -> worker.getDepartment())
//                .distinct()
                .collect(Collectors.toSet());
        System.out.println(result);
        Assertions.assertEquals(4, result.size());
    }

    @Test
    public void averageAgeOfMaleWorkers(){
        double age = employee.stream()
                .filter(worker -> worker.getSex().equals("Male"))
                .mapToDouble(w -> w.getAge())
                .average()
                .orElse(0.0);
        System.out.println(age);
        Assertions.assertEquals(43.5, age);
    }

    @Test
    public void findThreeYongestWorkersReturnSAverageSlary(){
        double sum = employee.stream()
                .sorted(Comparator.comparingInt(Worker::getAge))
                .limit(3)
                .mapToDouble(w -> w.getSalary())
                .sum();
        System.out.println(sum);
        Assertions.assertEquals(490000, sum);
    }

    @Test
    public void sumSalaryByDeapartment(){
        Map<String, Double> collect = employee.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.summingDouble(e -> e.getSalary())));
        System.out.println(collect);
    }

    @BeforeEach
    public void beforeEach(){
        employee = XmlSerialization.deserialize("src/main/resources/workers.xml", RootCfg.class).get().getWorkers();
    }

}
