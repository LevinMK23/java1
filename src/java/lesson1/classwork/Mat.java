package lesson1.classwork;

public class Mat {
    public static void main(String[] args) {
        int x = 5, y = 3;
        float xf = 5, yf = 3;
        System.out.println(x / y);
        System.out.printf("%.16f\n", xf / yf);
        // + - * / (% - остаток) >> <<
        //++ -- += /= *= %=
        //System.out.println(++x);
        System.out.println(x);
        x = x++ + ++x; //5 = 5(6) + 7 = 12
        System.out.println(x);
        x -= 5; x += 2; x *= 2; x /= 3;
        x = x % 4;
        System.out.println(x);
        x = 12;
        System.out.println(Integer.toBinaryString(x));
        x <<= 3; // x = x << k <=> x = x * (2 ** k)
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }
}
