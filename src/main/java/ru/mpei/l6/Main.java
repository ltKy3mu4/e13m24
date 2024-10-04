package ru.mpei.l6;

import ru.mpei.l6.exceptions.SystemNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Person s = null;
//        try {
//            s.setAge(20);
//        } catch (NullPointerException e){
//            e.printStackTrace();
//        }
//        System.out.println("dasdas");
        ModeCalculator mc = new ModeCalculator();
//        try {
//            mc.calc(new String[]{"node1", "ees2"}, null);
//        } catch (SystemNotFoundException e) {
//            e.printStackTrace();
//            //TODO: tell to user that its scheme does not contain Power System
//            throw new RuntimeException("LOL");
//        } catch (NullPointerException npe){
//            npe.printStackTrace();
//            //TODO tell to user that its scheme is not valid
//        } catch (RuntimeException e){
//            e.printStackTrace();
//            //TODO don kown whast happend
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//        try {
//            double calc = mc.calc(null, null);
//        } catch (SystemNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            mc.clear();
//        }
//
//        File f = new File("src/main/resources/hello2.txt");
//        Scanner sc = null;
//        try {
//            sc = new Scanner(f);
//            String s = sc.nextLine();
//            System.out.println(s);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        print("hello");

        int a = 2 / 0;
        System.out.println(a);



    }

    public static void print(String s){
        System.out.println(s);
        print(s);
    }
}
