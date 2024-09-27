package ru.mpei.l5.practice;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Jack", "Jilinhole", 50);
        Teacher t2 = new Teacher("Ivan", "Morozov", 30);
        Teacher[] ts = {t1,t2};

        Student[] sts = new Student[20];

        for (int i=0; i < sts.length; i++){
            sts[i] = new Student("St"+i, "surname"+i, 20 + i/5);
        }

        Subject s = new Subject(ts, sts);
        double v = s.countAverageAge();
    }
}
