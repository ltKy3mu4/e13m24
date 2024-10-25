package ru.mpei.l10;

import ru.mpei.l5.practice.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, Student> storage = new HashMap<>();

        storage.put("Ivanov", new Student("Alex", "Ivanov", 24));
        Student ivanov = storage.get("Ivanov");
        Student put = storage.put("Ivanov", new Student("Anton", "Ivanov", 27));

        Student petrov = storage.remove("Petrov");

        for (String key : storage.keySet()) {
            storage.get(key);
        }

        for (Student value : storage.values()) {

        }

        Set<Map.Entry<String, Student>> entries = storage.entrySet();

        Map<CustomStudentKey, Integer> studentsStorage = new HashMap<>();

        CustomStudentKey key1 = new CustomStudentKey("Alex", "22", "Ivanov");
        CustomStudentKey key2 = new CustomStudentKey("Petr", "10", "Fedorov");
        CustomStudentKey key3 = new CustomStudentKey("Zina", "26", "Fedorova");


        studentsStorage.put(key1, 2);
        studentsStorage.put(key2, 3);
        studentsStorage.put(key3, 4);
    }

}
