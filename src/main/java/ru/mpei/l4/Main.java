package ru.mpei.l4;

import ru.mpei.l4.abstractclass.Animal;
import ru.mpei.l4.abstractclass.Cat;
import ru.mpei.l4.abstractclass.Dog;

public class Main {
    public static void main(String[] args) {
//        MathOperation mathOperation = new MathOperation();
        double sum = MathOperation.sum(2.5, 3.5);
        System.out.println(sum);

        double pi = MathOperation.pi;
//        MathOperation.pi = 5.25;
        System.out.println(MathOperation.pi);

        Vector v = new Vector(2.5, "myVector1");
        String string = v.toString();
        System.out.println(v.toString());
        Class aClass = v.getClass();
        System.out.println(aClass.toString());

        Vector v2 = new Vector(2.5, "myVector2");
        v2.setSize(15);

        double x1 =2.5;
        double x2 = 2.5;
//        System.out.println(v == v2);
        System.out.println(v.equals(v2));
        System.out.println(v.equals("Sdasdas"));



        System.out.println(v.hashCode());
        System.out.println(v2.hashCode());
//        Class<? extends Vector> aClass = v.getClass();
//        v.equals();

        Vector2D vec = new Vector2D(10, "2dVector");
        vec.data[0][0] = 2.5;
//        vec.print();
//
//        vec.setSize(2);
//        vec.print();
        printVector(vec);

        Dog dog = new Dog();
        Cat cat = new Cat();

        say(dog);
        say(cat);

    }

    public static void say(Animal a){
        a.say();
    }

    public static void printVector(Vector v){
        v.print();
    }
}
