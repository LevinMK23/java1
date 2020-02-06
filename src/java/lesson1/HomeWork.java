package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(calc(5,6, 3, 2));
        System.out.println(task10and20(6, 5));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-1));
        greetings("Mike");
    }

    byte byteValue = 10;
    short shortValue= 10000;
    int intValue = 100000 ;
    long longValue = 100000000000000L;
    float floatValue = 1.4f;
    double doubleValue = 1.5;
    char charValue = 'a';
    boolean booleanValue = true; // true, false

    public static float calc(float a, float b, float c, float d){
        return a * (b + (c / d));
    }
    public static boolean task10and20( int w, int q){
        if (10 <= w + q && w + q <= 20) {
            return true;
        }else{
            return false;
        }
    }
    public static void isPositiveOrNegative(int z){
        if (z >= 0){
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }

    }
    public static boolean isNegative(int x){
        if(x < 0){
            return true;
        } else {
            return false;
        }
    }
    public static void greetings(String name){
        System.out.println("Приветствую тебя, " + name + "!");
    }


}
