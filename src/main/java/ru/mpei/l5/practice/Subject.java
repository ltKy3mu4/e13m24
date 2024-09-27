package ru.mpei.l5.practice;

import java.util.Date;

public class Subject {

    public Subject(Teacher[] teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
    }

    private Teacher[] teacher = new Teacher[10];
    private Student[] students = new Student[100];
    private String name;
    private Date start;

    public double countAverageAge(){
        Visitor[] vists = new Visitor[teacher.length + students.length];

        int i = this.copyVisitors(vists, students, 0);

        this.copyVisitors(vists, teacher, i);
        return calcAverageAge(vists);

//        double t = this.calcAverageAge(students);
//        double s = this.calcAverageAge(teacher);
//        return 0;
    }

    private int copyVisitors(Visitor[] dest, Visitor[] src, int lastIndex){
        if (src.length > dest.length){
            System.err.println("bad data ");
            System.exit(-1);
        }
        for (int i = 0; i < src.length; i++) {
            if (src[i] != null){
                dest[lastIndex] = src[i];
                lastIndex++;
            }
        }
        return lastIndex;
    }

    private double calcAverageAge(Visitor[] v){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null){
                sum+= v[i].getAge();
                count++;
            }
        }
        return sum / count;
    }
}
