package ru.mpei.l4;

import java.util.Arrays;

public class Vector2D extends Vector {
    public double[][]data = new double[size][size];

    public Vector2D(double x, String name) {
        super(x, name);
    }

    @Override
    public void print() {
        System.out.print("[");
        for (int i=0; i < data.length; i++){
            for(int j =0; j < data[i].length; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("]");
    }

    @Override
    public void setSize(int size) {
        this.size = size;
        this.data = new double[size][size];
    }
}
