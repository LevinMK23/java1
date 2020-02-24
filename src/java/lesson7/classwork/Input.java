package lesson7.classwork;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Input {

    static void readAllLines(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }

    static void appendToFile(File file, String word) throws FileNotFoundException {
        PrintWriter pr = new PrintWriter(new FileOutputStream(file, true));
        pr.print(word);
        pr.close();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("out.txt");
        /*String s = new String("aaaaaaa".getBytes(),
                StandardCharsets.UTF_8);
        PrintWriter pr = new PrintWriter(file);
        pr.print(s);
        pr.close();
        byte [] in = new byte[1024];
        int count = new FileInputStream(file).read(in);
        System.out.println(count);*/
        appendToFile(file, "\nOK");
        appendToFile(file, "\nNO");
        readAllLines(file);
    }
}
