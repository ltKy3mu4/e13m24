package ru.mpei.l4.abstractclass;

public class Cat extends Animal{
    public Cat() {
        this.type = AnimalType.Cat;
        this.age = 0;
    }


    @Override
    public void say() {
        System.out.println("mya mya");
    }
}
