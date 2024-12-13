import java.util.*;
public class ArrayOperations {
    private static int[] array;

    // Процедура генерации массива
    public static void generateArray(int length) {
        array = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(100); // Заполнение массива случайными числами от 0 до 99
        }
    }

    // Функция поиска минимума в массиве
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Функция поиска максимума в массиве
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Процедура обмена двух элементов массива
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Функция определения индекса элемента массива
    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Значение не найдено
    }

    // Сортировка массива
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    // Геттер для массива
    public static int[] getArray() {
        return array;
    }
}