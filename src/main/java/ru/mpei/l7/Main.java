package ru.mpei.l7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>(10);
        for (int i = 0; i < 100;i++){
            listOfString.add(i+"");
        }
//        listOfString.add(2.0);
//        listOfString.add(100);
//        listOfString.add(true);
        System.out.println(listOfString);

        double s = calcSum(listOfString);

        System.out.println(s);

    }

    private static double calcSum(List listOfString) {
        double sum = 0;
        for (Object o: listOfString){
            sum += Double.parseDouble((String) o);
        }
        return sum;
    }
}
