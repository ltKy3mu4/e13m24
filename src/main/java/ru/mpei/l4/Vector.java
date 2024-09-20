package ru.mpei.l4;

import java.util.Objects;

public class Vector{
    public Vector(double x, String name) {
        this.x = x;
        this.name = name;
    }
    protected int size = 10;
    private double x;
    private String name;
    public double[] data = new double[size];

    public void add(double x){
        this.x += x;
    }

    public String toString() {
        return "Vector:"+name+"="+x;
    }

    public boolean equals(Object o) {
        if (!o.getClass().equals(this.getClass())){
            return false;
        }
        Vector o1 = (Vector) o;
        return o1.name.equals(this.name) && o1.x == this.x;
    }

    public void setSize(int size) {
        this.size = size;
        data = new double[size];
    }

    public int hashCode() {
        return (int)x + name.hashCode();
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.print("[");
        for (int i=0; i < data.length; i++){
                System.out.print(data[i]+" ");
            System.out.println("");
        }
        System.out.println("]");
    }
}

