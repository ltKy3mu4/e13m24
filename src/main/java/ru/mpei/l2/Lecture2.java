package ru.mpei.l2;

import java.util.Arrays;

public class Lecture2 {
    public static void main(String[] args) {
        double counter = 10.2;
        if (counter < 10) {
            System.out.println("Operation failed");
        } else if (counter == 10) {
            System.out.println("need to repeat operation. Result is unknown");
        } else if (counter == 11) {
            System.out.println("need to repeat operation. Result is unknown");
        } else if (counter == 12) {
            System.out.println("need to repeat operation. Result is unknown");
        } else if (counter == 13) {
            System.out.println("need to repeat operation. Result is unknown");
        } else if (counter == 14) {
            System.out.println("need to repeat operation. Result is unknown");
        } else if (counter == 15) {
            System.out.println("need to repeat operation. Result is unknown");
        } else if (counter == 16) {
            System.out.println("need to repeat operation. Result is unknown");
        } else {
            System.out.println("Operation successful");
        }

        int choose = 1;

        switch (choose) {
            case 0:
                System.out.println("Wrong number");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Little number");
                break;

            case 5:
                System.out.println("ok");
                break;

            default:
                System.out.println("bad number");
                break;
        }

        int varible = 10;
//        varible +=5;
//        varible +=5;
//        varible +=5;
//        varible +=5;
//        varible +=5;
        while (varible < 33) {
            varible += 5;
            System.out.println(varible);
        }

        System.out.println(varible);

        double b = 1;
        for (int i = 0; i < 10; i++) {
            b = b * 2;
        }
        System.out.println(b);

//        b = 1;
//        int i =0;
//        for (;;){
//            if (i > 9) {
//                break;
//            }
//            b = b * 2;
//            i++;
//            System.out.println(b);
//        }
        int v = 1000;
        for (int i = 0; i < 10; i++) {
            if (v == 0) {
                break;
            }
            v = (v - 1) / v;
            System.out.println(v);
        }

        int j = 0;
//        j++;
        int k = 0;
//        ++k;
//        System.out.println();


        int l = 1 + ++k;
        int m = 1 + j++;

        System.out.println();


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        double[] arr =  new double[10];

        System.out.println(arr[2]);
        arr[2] = 2.5;
        System.out.println(arr[2]);

        System.out.println((arr[3] -3) *2 );

        int h =1;
        for (int i =0; i < 10;i++){
            arr[i] = h;
            h = h * 2;
        }
        System.out.println(Arrays.toString(arr));

        System.err.print("[");
        for(int i =0; i < arr.length; i++) {
            if (i == arr.length -1 ){
                System.err.print(arr[i]);
            } else {
                System.err.print(arr[i]+", ");
            }
        }
        System.err.print("]");
    }
}
