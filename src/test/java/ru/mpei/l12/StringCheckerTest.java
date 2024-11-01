package ru.mpei.l12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckerTest {

    @Test
    void testOkString(){
        StringChecker sc = new StringChecker();
        boolean check = sc.check("hello from mpei");
        Assertions.assertTrue(check);
    }

    @Test
    void testBadString(){
        StringChecker sc = new StringChecker();
        boolean check = sc.check("hello  from МЭИ");
        Assertions.assertFalse(check);
    }

}