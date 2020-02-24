package lesson7.classwork;

public class Ex1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (long i = 0; i < 10000000; i++) {
            s.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start) + " ms.");
    }
}
