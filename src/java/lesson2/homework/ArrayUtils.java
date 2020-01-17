package lesson2.homework;

class ArrayUtils {
    private ArrayUtils() {
        throw new IllegalStateException("Utility class");
    }

    static int[] change0And1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    static int[] makeArray() {
        int[] array = new int[8];
        for (int index = 0, value = 0; index < array.length; index++) {
            array[index] = value;
            value += 3;
        }
        return array;
    }

    static int[] changeLess6(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] < 6) array[index] = array[index] * 2;
        }
        return array;
    }

    static int[][] fillDiagonals1(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array.length; column++) {
                if (line == column || line == array.length - 1 - column) array[line][column] = 1;
            }
        }
        return array;
    }

    static int[] findMinAndMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) min = array[index];
            if (array[index] > max) max = array[index];
        }
        return new int[]{min, max};
    }
}
