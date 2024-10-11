package ru.mpei.l8;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new MyEasyPeasyLinkedList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        String s = myList.get(2);
        System.out.println(s);

        myList.remove("third");

    }
}
