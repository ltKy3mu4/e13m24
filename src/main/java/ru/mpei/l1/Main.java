package ru.mpei.l1;

public class Main {
    public static void main(String[] args) {
        boolean agentDead = true;

        System.out.println(agentDead);

        byte byteTest = 10;
        byte byte2 = 126;

        byte byte3 = (byte) (byteTest + byte2);
        System.out.println(byte3);

        int i1 = 10;
        int i2 = 126;
        int iSum = i1 + i2;
        System.out.println(iSum);

        long l1 = 10_000_000;
        long l2 = 100_000_000;

        long lSum = l1+l2;
        System.out.println(lSum);


        double d1 = 2.5;
        double d2 = 2.4;

        double dRes = d1 - d2;

        float f1 = 2.52f;


        System.out.println();

        char c1 = 'd';

        System.out.println(c1);

        int a;

        a = 2;

        dRes = dRes + 10.2;

        System.out.println(a);

        System.out.println(" double result of math operation = " + dRes + " and first .. = "+f1);

    }
}