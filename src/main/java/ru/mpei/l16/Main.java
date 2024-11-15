package ru.mpei.l16;

import ru.mpei.l15.CommonConfiguration;
import ru.mpei.l15.GroupCfg;
import ru.mpei.l15.StudentCfg;
import ru.mpei.l15.XmlSerialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        ReaderModule r = new ReaderModule();

//        Consumer<CommonConfiguration> c = new Consumer<CommonConfiguration>() {
//            @Override
//            public void accept(CommonConfiguration commonConfiguration) {
//                System.err.println(commonConfiguration);
//            }
//        };
//        Consumer<CommonConfiguration> c = date -> System.err.println(date);;
        r.setConsumer(data -> System.err.println(data));
        r.start();

        Optional<CommonConfiguration> obj = XmlSerialization.deserialize("src/main/resources/students.xml", CommonConfiguration.class);

        List<StudentCfg> students = obj.get().getStudents();

        List<StudentCfg> filtered = new ArrayList<>();
        for (StudentCfg student : students) {
            if (student.getAge() >= 30){
                if (student.getName().startsWith("J")){
                    filtered.add(student);
                }
            }
        }

        List<GroupCfg> res = students.stream()
                .filter(st -> st.getAge() >= 30 && st.getName().startsWith("J"))
                .map(e->e.getGroup())
                .toList();


    }

}
