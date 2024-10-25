package ru.mpei.l11;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    private long ts;

    @Test
    public void sumTwoIntsTest1(){
        int sum = calculator.sum(10, 12);
        Assertions.assertEquals(22, sum);
    }

//    @Test
    @RepeatedTest(10)
    public void sumToIntsTest2(){
        int sum = calculator.sum(0,0);
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void divideTwoInts1(){
        Assertions.assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                int sum = calculator.divide(10, 0);

            }
        });
    }


    @Test
    public void substractTest(){
        int res = calculator.minus(10, 2);
        Assertions.assertEquals(8, res);
    }


    @BeforeEach
    public void before(){
        calculator = new Calculator();
        ts = System.currentTimeMillis();
    }

    @AfterEach
    public void afterEach(){
        System.err.println("Test was executed for "+(System.currentTimeMillis() - ts));
    }

    @BeforeAll
    public static void berforeAll(){
        System.out.println("Tests started");
    }

    @AfterAll
    public static void afterALl(){

    }

}