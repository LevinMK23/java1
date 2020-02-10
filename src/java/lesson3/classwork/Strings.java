package lesson3.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String str = "Mama mila, rAmu.";
        System.out.println(str.charAt(1));
        char [] chars = str.toCharArray();
        String [] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase()
                    .replaceAll("[^a-z]+", "");
        }
        System.out.println(Arrays.toString(words));
        System.out.println("89112756975".matches("\\+7|8[0-9]{10}"));
        Scanner in = new Scanner(System.in);
        String sLine = in.nextLine();
        String s = in.next();
        System.out.println(sLine + ", " + s);
    }
}
