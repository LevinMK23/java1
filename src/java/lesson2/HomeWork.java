package lesson2.homework;

import java.util.Arrays;



public class HomeWork {
    public static void main(String[] args) {


//** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        int[] maxMinArray = {5, 44, -34, 22, 44, -4, 5, 6, 4, 5, -56, 34, 67, 8};
        Arrays.sort(maxMinArray);
        int max = maxMinArray[maxMinArray.length - 1], min = maxMinArray[0];
        System.out.println(max);
        System.out.println(min);

// Проверка методов
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        shift(array, -1);
        System.out.println(Arrays.toString(array));
    }


//** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance(int[] array) {
        int sum = 0, leftSum = 0;
        for (int i : array) {
            sum += i;
        }
        for (int i : array) {
            leftSum += i;
            if (2 * leftSum == sum) {
                return true;
            }
        }
        return false;
    }

//**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    public static void shift(int[] array, int n) {
        if (n < 0) {
            n = -n;
            n = n % array.length;
            n = array.length - n;
        } else {
            n = n % array.length;
        }
        while (n > 0){
            int temp = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = temp;
            n--;
        }
    }
}
