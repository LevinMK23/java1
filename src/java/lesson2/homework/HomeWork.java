package lesson2.homework;

import java.util.Arrays;

public class HomeWork {

    // TODO: 17.01.2020

    public static int[] inverse(int[] array) {
        for (int i = 0; i < array.length; i++) { //len - 1
            array[i] = (array[i] + 1) % 2;
            //0 + 1 -> 1 % 2 = 1,
            // 1 + 1 = 2 % 2 = 0
        }
        return array;
    }

    public static int[] fillArray(int len) {
        int[] arr = new int[len]; //0 3 6 9 0 0 0 0 0 0
                                  //0 1 2 3 4 5 .....
        for (int i = 1; i < len; i++) {
            arr[i] = arr[i - 1] + 3; // accumulator
        }
        return arr;
    }

    //O(len) -> O(len * len)
    public static int[][] fillMatrix(int len) {
        int[][] matrix = new int[len][len];
        for (int i = 0; i < len; i++) {

        }
        return matrix;
    }

    public static int min(int[] array) {
        //
        return 0;
    }

    //{1 2 3 4 5}, 2 -> 4 5 1 2 3
    //1 2 3 4 5 -2 -> 3 4 5 1 2
    //if shift  < 0 then shift = len + sift
    //2 3 4 5 1 -> 6 : 1 (6 % 5)
    //5 1 2 3 4 -> -1 : 5 - 1 = 4
    public static void shiftRight(int[] array, int shift) {
        shift = shift < 0 ? array.length + shift : shift;
        shift = shift % array.length;
//        int [] buffer = new int[array.length];
//        int pos = 0;
//        //O(len)
//        for (int i = array.length-1 - shift; i < array.length; i++) {
//            buffer[pos++] = array[i];
//        }
//        for (int i = 0; i < array.length-1 - shift; i++) {
//            buffer[pos++] = array[i];
//        }
//        array = buffer;
        // O(shift * len)
        for (int i = 0; i < shift; i++) {
            int cur = array[0];
            //1 2 3 4 5 : 1
            //2 3 4 5 5
            // 2 3 4 5
            //a[0] = a[1]
            for (int j = 0; j < array.length - 1; j++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = cur;
        }
    }

    public static boolean checkBalance(int [] array) {
        int n = array.length;
        //1 2 3 | 3 3
        //allSum = 12
        //leftSum 1 != 12 - 1, 3 != 12 - 3, 6 == 12 - 6 (true)
        int fullSum = 0, leftSum = 0;
        //1 2 3 3 3
        //i = 1, i = 2, i = 3, i = 3, i = 3
        for (int i : array) {
            fullSum += i;
        }
        for (int i : array) {
            leftSum += i;
            if (2 * leftSum == fullSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverse(new int[]{0, 0, 1, 1, 0, 1})));
        System.out.println(Integer.toBinaryString(121));
        System.out.println(inverse(121));
        System.out.println(Arrays.toString(fillArray(8)));
        int[][] m = fillMatrix(5);
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[] row : m) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println(min(new int[]{5, 7, -1, 4, 3, -2, 1}));
        int[] array = new int[]{1, 2, 3, 4, 5};
        shiftRight(array, -1);
        System.out.println(Arrays.toString(array));
    }

    private static String inverse(int value) {
        return Integer.toBinaryString(~value);
    }
}
