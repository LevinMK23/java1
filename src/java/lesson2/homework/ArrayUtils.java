package lesson2.homework;

class ArrayUtils {
    private ArrayUtils() {
        throw new IllegalStateException("Utility class");
    }

    static void change0and1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }
}
