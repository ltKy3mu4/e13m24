package ru.mpei.l2;

import java.util.Arrays;

public class Task1_2 {

    public static void main(String[] args) {
        int[] array = {10, 4, 5, 7, 8, 1, 3};

        for (int i =0; i < array.length; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j+1] < array[j]){
                    int toChange = array[j];
                    array[j] = array [j+1];
                    array[j+1] = toChange;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

}
