package ru.mpei.l20;

public class AnimalBuilder {

    private static Animal instance;

    public static AnimalBuilder create(){
        instance = new Animal();
        return  new AnimalBuilder();
    }

    public AnimalBuilder setColor(String color){
        instance.setColor(color);
        return this;
    }

    public AnimalBuilder setName(String name){
        instance.setName(name);
        return this;
    }

    public AnimalBuilder setAge(int age){
        instance.setAge(age);
        return this;
    }

    public Animal build(){
        return instance;
    }

}
