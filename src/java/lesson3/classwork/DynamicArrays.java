package lesson3.classwork;

import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        for (int i = 0; i < 10; i++) {
            arr.add(0, i + 10);
        }
        arr.remove(0);
        arr.remove(new Integer(10));
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.get(i) + " "); //[]
//        }
        arr.set(0, -5);
        System.out.println(arr);
    }
}
