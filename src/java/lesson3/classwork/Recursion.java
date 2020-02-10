package lesson3.classwork;

import java.util.Scanner;

public class Recursion {
    //f(x) = 1 + f(x-1)
    public static int f(int x) {
        if (x <= 1) return 1;
        return x * f(x - 1);
    }

    //()(())((()))
    //f(3) = f(2) + (f(2)) = ()(())((()))
    //f(2) = ()+ (()) = ()(())
    //f(1) = ()

    static String gen(int n) {
        if (n == 1) return "()";
        return "(" + gen(n - 1) + "())";
    }

    //f(4) -> 4 * f(3) -> 4 * 3 * f(2) -> 4 * 3 * 2 * f(1) -> 4 * 3 * 2 * 1

    public static void print(Scanner in) {
        int n = in.nextInt();
        if (n == 0) return;
        print(in);
        System.out.print(n + " ");
    }
    //3(aaaabbb)3(c) = aaaabbbaaaabbbaaaabbbccc
    //aaaabbbccc = 3(4(a)3(b))3(c) -> 4(a)3(b)ccc -> 4(a)bbbccc -> aaaabbbccc
    public static String decompress(String s) {
        int lastBracket = s.lastIndexOf('(');
        if (lastBracket == -1) {
            return s;
        } else {
            int endBracket = lastBracket + s.substring(lastBracket).indexOf(')');
            int value = 0, pos = lastBracket - 1;
            while (pos >= 0 && s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
                //BUG
                value = value * 10 + (s.charAt(pos) - '0');
                pos--;
            }
            StringBuilder decomp = new StringBuilder();
            String part = s.substring(lastBracket + 1, endBracket);
            System.out.println(part + " " + value);
            while (value > 0) {
                decomp.append(part);
                value--;
            }
            System.out.println("d:" + decomp + " s:" + s);
            return decompress(s.substring(0, pos+1) +
                    decomp + s.substring(endBracket+1));
        }
    }

    public static void main(String[] args) {
        //System.out.println(gen(3));
        System.out.println(decompress("2(def2(c2(ab2(cd)12(x))))"));
    }
}
