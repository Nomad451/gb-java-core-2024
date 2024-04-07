package seminars.seminar_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(insertIntoArray(arr, 5, 1)));
        System.out.println(Arrays.toString(insertIntoArray(arr, 5)));
    }

    public static int[] insertIntoArray(int[] arr, int value, int index) {
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("Индекс вышел за рамки массива.");
        }
        int[] result = new int[arr.length + 1];

        System.arraycopy(arr, 0, result, 0, index);

        result[index] = value;

        System.arraycopy(arr, index, result, index + 1, arr.length - index);

        return result;
    }

    public static int[] insertIntoArray(int[] arr, int value) {
        return insertIntoArray(arr, value, arr.length);
    }
}
