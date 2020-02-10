package lesson3.classwork;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Algo {

    //binary search
    static double sqrt(double x) {
        double left = 0, right = x + 1;
        double mid = 0, epsilon = 0.0000000001;
        int iter = 0;
        while (right - left > epsilon) {
            mid = (left + right) / 2;
            System.out.println("mid = " + mid);
            iter++;
            if (mid * mid > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.println("Count of iterations: " + iter);
        return mid;
    }

    // > < = (victory) count = ?
    static void game() throws IOException {
        //[0, 1000]
        int left = 0, right = 10000;
        Scanner in = new Scanner(System.in);
        while (true) {
            int mid = (left + right) / 2;
            System.out.println("I think that you guess " + mid);
            char ch = in.next().charAt(0);
            if (ch == '>') {
                right = mid;
            }
            if (ch == '<') {
                left = mid;
            }
            if (ch == '=') {
                System.out.println("YES, you guess " + mid);
                return;
            }
        }
    }

    static int search(int[] arr, int key) {
        int left = -1, right = arr.length;
        while (right - left > 0) {
            int mid = (left + right) / 2 + (left + right) % 2;
            // {1 (2)}    3 4           {(5) 6 7 8 9} : 3
            // 0 1        2 3
            //            l r
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                right = mid - 1;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) throws IOException {
        //default values: int 0, double 0.0, char \0 boolean false
        //                String null
        //Arrays.binarySearch()
        System.out.println(search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 0));
    }
}
