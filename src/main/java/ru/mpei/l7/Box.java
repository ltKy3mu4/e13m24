package ru.mpei.l7;

public class Box <T> {
    private T value;

    private Box(T value) {
        this.value = value;
    }
    private Box() {
    }

    public T getValue(){
        if (value == null){
            throw new RuntimeException("Content of box is null");
        }
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public boolean isEmpty(){
        return value == null;
    }

    public static <T> Box<T> of (T val){
        return new Box<>(val);
    }

    public static <T> Box<T> ofNullable(){
        return new Box<>();
    }
}
