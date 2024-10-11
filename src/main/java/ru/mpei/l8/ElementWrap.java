package ru.mpei.l8;

public class ElementWrap <T> {
    private T value;
    private ElementWrap <T> next;
    private ElementWrap <T> prev;

    public ElementWrap(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ElementWrap<T> getNext() {
        return next;
    }

    public void setNext(ElementWrap<T> next) {
        this.next = next;
    }

    public ElementWrap<T> getPrev() {
        return prev;
    }

    public void setPrev(ElementWrap<T> prev) {
        this.prev = prev;
    }

    public boolean hasNext(){
        return next != null;
    }
}
