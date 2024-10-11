package ru.mpei.l8;

import java.util.*;

public class MyEasyPeasyLinkedList<T> implements List<T> {

    protected ElementWrap<T> first = null;
    protected ElementWrap<T> last = null;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        size++;
        if (this.first == null){
            this.first = new ElementWrap<>(t);
            this.last = this.first;
            return true;
        }
        ElementWrap<T> nextEl = new ElementWrap<>(t);
        this.last.setNext(nextEl);
        nextEl.setPrev(this.last);
        this.last = nextEl;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (first == null || !first.getValue().getClass().equals(o.getClass())){
            return false;
        }

        ElementWrap<T> found = findWrap(o);
        if (found == null){
            return false;
        }

        size--;

        if (found.getPrev() != null && found.getNext() != null){
            found.getPrev().setNext(found.getNext());
            found.getNext().setPrev(found.getPrev());
            return true;
        }

        //case of first element in chain
        if (found.getNext() != null){
            found.getNext().setPrev(null);
            this.first = found.getNext();
            found.setNext(null);
            return true;
        }

        //case of last element in a chain
        if (found.getPrev() != null){
            found.getPrev().setNext(null);
            this.last = found.getPrev();
            found.setPrev(null);
            return true;
        }

        return true;
    }

    private ElementWrap<T> findWrap(Object o) {
        if (first.getValue().equals(o)){
            return first;
        }
        ElementWrap<T> current = first;
        while (current.hasNext()){
            current = current.getNext();
            if (current.getValue() .equals(o)){
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (size - 1 < index) {
            throw new NoSuchElementException("index bigger than size");
        }
        ElementWrap<T> current = this.first;
        if (index == 0){
            return current.getValue();
        }
        for (int i =1; i <= index;i++){
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
