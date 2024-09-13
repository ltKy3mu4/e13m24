package ru.mpei.l3;

public class Lc3 {
    public static void main(String[] args) {
        String str = new String("Hello world");
        String str2 = "hello 2";

        String str3 = " world";

        String res = str2 + str3;
        System.out.println(res);

        res += 22.2;
        System.out.println(res);


        Car vwTuareg = new Car();
//        vwTuareg.color = "red";
//        vwTuareg.releaseYear = 2024;
//        vwTuareg.sold = false;
//        vwTuareg.model = "volkswagen";
        vwTuareg.setColor("red");
        vwTuareg.setReleaseYear(2024);
        vwTuareg.setSold(false);
        vwTuareg.setModel("volkswagen");

        Car ladaVesta = new Car(2023, "green", false, "lada");
//        ladaVesta.color = "green";
//        ladaVesta.releaseYear = 2023;
//        ladaVesta.sold = false;
//        ladaVesta.model = "lada";
        System.out.println(ladaVesta.getColor());

        Car skoda = new Car();
//        skoda.color = "grey";
//        skoda.releaseYear = 2021;
//        skoda.sold = true;
//        skoda.model = "skoda";
//
//        Car[] cars = {vwTuareg, ladaVesta, skoda};
//
//        int notSoldCarsCount = 0;
//        for (Car car : cars) {
//            if (car.sold == false){
//                notSoldCarsCount++;
//            }
//        }
//        System.out.println(notSoldCarsCount);
//
//        System.err.println(ladaVesta.color);
//        ladaVesta.setColor("sea wave color");
//        System.err.println(ladaVesta.color);
//
//        int age = skoda.getAge();
//        System.err.println("Age = "+age);
//
//        skoda.color = "dasdasdasd";
        skoda.setColor("dasdasdads");
        System.out.println(skoda.getColor());
        skoda.setColor(new String("green"));
        System.out.println(skoda.getColor());

        Car c1 = new Car();
        Car c2 = new Car();
        c1 = new Car();


        boolean b = c1.equals(c2);

        System.out.println();

        String color = c1.getColor();
        int length = color.length();
        System.out.println();
    }
}
