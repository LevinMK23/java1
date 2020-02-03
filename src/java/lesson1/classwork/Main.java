package lesson1.classwork;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //примитивные типы данных
        //integers
        byte b = -128; //1b = 8bit (2 ** 8 = 256)
        //[-128; 128) -128 ... - 1 0 1 2 3 ... 127
        short sh = 32736; // 2b = 16 bit
        // [-2 ** 15; 2 ** 15)
        int i = 2_000_000_000; // 4b = 32 bit
        long l = 1_000_000_000_000_000_000L; // 8b = 64 bit
        System.out.println(l);
        // 10 ** 18
        //BigInteger bi = new BigInteger("0");
        //floating point
        final int a = 12;
        float f = 121212.6565656f; // 4 b
        double d = 121212.6565656; // 8 b
        char c = 's';// ' " \
        System.out.println((char)(c + 1));
        boolean bool = c < 'S' + 33;
        //boolean b1;
        System.out.println(bool);
        String str = "+79112756975";
        System.out.println(str.matches("\\+7[0-9]{10}"));
    }

}
