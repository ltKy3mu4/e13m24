package ru.mpei.l8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyEasyPeasyLinkedListTest {

    @Test
    public void testAddFiveElements(){
        List<String> myList = new MyEasyPeasyLinkedList<>();

        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");

        Assertions.assertEquals(5, myList.size());
        Assertions.assertEquals("five", myList.get(4));
        Assertions.assertEquals("one", myList.get(0));
    }

    @Test
    public void testRemoveMiddleElement(){
        MyEasyPeasyLinkedList<String> myList = new MyEasyPeasyLinkedList<>();

        myList.add("one");
        myList.add("two");
        myList.add("three");

        Assertions.assertEquals(3, myList.size());
        Assertions.assertEquals("two", myList.first.getNext().getValue());
        Assertions.assertEquals("two", myList.last.getPrev().getValue());

        myList.remove("two");
        Assertions.assertEquals(2, myList.size());
        Assertions.assertEquals("three", myList.first.getNext().getValue());
        Assertions.assertEquals("one", myList.last.getPrev().getValue());
    }

    @Test
    public void testRemoveLastElement(){
        MyEasyPeasyLinkedList<String> myList = new MyEasyPeasyLinkedList<>();

        myList.add("one");
        myList.add("two");
        myList.add("three");

        Assertions.assertEquals(3, myList.size());
        Assertions.assertEquals("three", myList.last.getValue());

        myList.remove("three");
        Assertions.assertEquals(2, myList.size());
        Assertions.assertEquals("two", myList.last.getValue());
    }
}