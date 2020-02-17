package lesson5.classwork;

import java.util.Arrays;

public class Test {
    static int a = 2;
    public static void main(String[] args) {
        int a = 4;
        a = 3;
        System.out.println();
        Cat cat = new Cat();
        new Cat(); new Cat();
        System.out.println(new Cat().getCounter());
        // null.some NPE
        Arrays.toString(new int[]{});
        cat.say();
        cat.setName("Vaska");
        System.out.println(cat.getName());
        //System.out.println(cat.name);
        for (int i = 0; i < 1000000; i++) {
            new Cat();
        }
        System.out.println(new Cat().getCounter());
    }
}
