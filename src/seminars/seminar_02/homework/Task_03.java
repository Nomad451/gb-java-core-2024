package seminars.seminar_02.homework;

// Написать функцию, возвращающую истину, если в переданном массиве
// есть два соседних элемента, с нулевым значением.
public class Task_03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 0, 7, 9, 0, 0};
        System.out.println(isTwoZero(array));
    }

    public static boolean isTwoZero(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == 0 && array[i + 2] == 0) {
                return true;
            }
        }
        return false;
    }
}
