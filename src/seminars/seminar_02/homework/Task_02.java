package seminars.seminar_02.homework;

// Написать функцию, возвращающую разницу между самым большим
// и самым маленьким элементами переданного не пустого массива.
public class Task_02 {
    public static void main(String[] args) {
        int[] array = {11, 15, 22, 6, 38, 20, 91};
        System.out.print("Разница между минимальным и максимальным элементами массива: ");
        System.out.println(differenceBetweenMinMax(array));
    }

    public static int differenceBetweenMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        return max - min;
    }
}
