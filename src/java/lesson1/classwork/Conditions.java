package lesson1.classwork;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите а");
//        int a = in.nextInt();
//        System.out.println("Введите b");
//        int b = in.nextInt();
//        System.out.println("Большее из двух: ");
//        if (a > b) {
//            System.out.println("a");
//        } else {
//            System.out.println("b");
//        }
        //  1     2     3       4
        //.....0.....7.....12........
        int x = in.nextInt();
        if (x < 0) {
            System.out.println("1");
        } else if (x < 7) {
            System.out.println("2");
        } else if (x < 12) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

//        if (x < 0) {}
//        if (x >= 0 && x < 7){}
//        if (x >= 7 && x < 12){}
//        if (x >= 12){}
        boolean condition1 = x > 7, condition2 = x < 12;
        //>, <, >=, <=, ==, !=
    }
}
