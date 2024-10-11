package ru.mpei.l7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        List<String> listOfString = new ArrayList<>(10);
//        for (int i = 0; i < 100;i++){
//            listOfString.add(i+"");
//        }
//        listOfString.add(2.0);
//        listOfString.add(100);
//        listOfString.add(true);
//        System.out.println(listOfString);
//
//        double s = calcSum(listOfString);
//
//        System.out.println(s);

//        Box<String> box = new Box<>();
//        box.setValue("dasd");
//        String value = box.getValue();
//        System.out.println(value);

        Box<String> generate = generate(12);
        if (!generate.isEmpty()){
            System.out.println(generate.getValue());
        }
        List<String> myList = new ArrayList<>(10);
        myList.add("das");
        myList.add("das");
        myList.add("das");
        myList.add("das");


    }

    public static Box<String> generate( int lettersCount){
        if (lettersCount < 0){
            return Box.ofNullable();
        } else {
            String s = "";
            Random r = new Random();
            for(int i =0;i<lettersCount;i++){
                char c = (char)(r.nextInt(26) + 'a');
                s+=c;
            }
            return Box.of(s);
        }
    }

    private static double calcSum(List listOfString) {
        double sum = 0;
        for (Object o: listOfString){
            sum += Double.parseDouble((String) o);
        }
        return sum;
    }
}
