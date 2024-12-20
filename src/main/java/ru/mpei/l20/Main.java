package ru.mpei.l20;

public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalBuilder.create()
                .setColor("green")
                .setAge(10)
                .setName("Petr")
                .build();


        AutoCounter ac = new AutoCounter();
        ac.addSubscriber(counter -> System.err.println(counter));
        ac.addSubscriber(counter -> System.out.println(counter));
        ac.start();
    }
}
