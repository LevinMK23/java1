package lesson2.homework;

import java.util.Arrays;

public class Andreev {
    public static void main(String[] args) {
//        int[] a = {100, 200, 300, 400, 500, 600};
//        shiftArray(a, -2);
//        for (int b : a) {
//            System.out.print(" " + b);
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(changeZeroOne(a)));
//        System.out.println(Arrays.toString(fillArray()));
//        System.out.println(Arrays.toString(fillArray3()));
//        System.out.println(Arrays.deepToString(multArr(5)));
//        findMaxMin(a);
//        System.out.println(findSum(a));
    }

    //first task
    private static int[] changeZeroOne(final int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) a[i] = 1;
            else a[i] = 0;
        }
        return a;
    }

    //second task
    private static int[] fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        return arr;
    }

    //third task
    private static int[] fillArray3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        return arr;
    }

    //fourth task
    private static int[][] multArr(int size) {
        int[][] multArr = new int[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (j == (size - i - 1)) {  //потому что массив считается с 0
                    multArr[i][j] = 1;
                } else {
                    multArr[i][j] = 0;
                }

            }
        }
        return multArr;
    }

    //fifth task
    private static void findMaxMin(int[] a) {
        int max = a[0], min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);

    }

    //sixth task
    private static boolean findSum(int[] arr) {
        int elemtSumLeft;
        int elemtSumRight;

        for (int i = 0; i < arr.length; i++) {
            elemtSumLeft = 0;
            elemtSumRight = 0;
            //этот цикл разделителя, делит массив на две части

            for (int j = 0; j <= i; j++) {
                //считаем сумму левой части
                elemtSumLeft += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                //считаем сумму правой части
                elemtSumRight += arr[j];
            }

            if (elemtSumLeft == elemtSumRight) {

                return true;
            }
        }

        return false;
    }

    //seventh
    private static int[] shiftArray(int[] arr, int shift) {
        if (shift > 0) {
            while (shift > 0) {
                int lastVar = arr[arr.length - 1];
                for (int counter = 0; counter < arr.length; counter++) {

                    int curVal = arr[counter];// запоминаем текущее значение элемента массива
                    arr[counter] = lastVar; // присвоим первому значению массива последнее
                    lastVar = curVal; //измненим последнее значение на предпоследнее
                    // и аналогично дальше
                }
                shift--;
            }
            return arr;
        } else if (shift < 0) {

            while (shift < 0) {
                int firstVar = arr[0];
                for (int counter = arr.length - 1; counter >= 0; counter--) {
                    int curVal = arr[counter];
                    arr[counter] = firstVar;
                    firstVar = curVal;
                }
                shift++;
            }
            return arr;
        } else {
            return arr;

        }
    }
}
