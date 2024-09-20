package ru.mpei.l4.abstractclass;

public class Dog extends Animal{
    public Dog() {
        this.type = AnimalType.Dog;
    }

    @Override
    public void say() {
        System.out.println("wof wof");
    }
}
