import java.util.*;
public class Pod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Спрашиваем длину массива
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        // 2. Генерация массива
        ArrayOperations.generateArray(length);

        // 3. Вывод массива
        System.out.println("Сгенерированный массив: " + Arrays.toString(ArrayOperations.getArray()));

        // 4. Разделительная строка
        System.out.println("***********");

        // 5. Считаем разность
        int min = ArrayOperations.findMin(ArrayOperations.getArray());
        int max = ArrayOperations.findMax(ArrayOperations.getArray());
        int difference = max - min;
        System.out.println("Разность между максимальным (" + max + ") и минимальным (" + min + ") элементами: " + difference);

        // 6. Определяем индекс минимального
        int minIndex = ArrayOperations.indexOf(ArrayOperations.getArray(), min);
        System.out.println("Индекс минимального элемента: " + minIndex);

        // 7. Определяем индекс максимального
        int maxIndex = ArrayOperations.indexOf(ArrayOperations.getArray(), max);
        System.out.println("Индекс максимального элемента: " + maxIndex);

        // 8. Применяем процедуру обмена
        ArrayOperations.swap(ArrayOperations.getArray(), minIndex, maxIndex);

        // 9. Разделительная строка
        System.out.println("***********");

        // 10. Выводим измененный массив
        System.out.println("Массив после обмена: " + Arrays.toString(ArrayOperations.getArray()));

        // 11. Выводим разность
        System.out.println("Разность между максимальным и минимальным элементами: " + difference);

        // 12. Разделительная строка
        System.out.println("***********");

        // 13. Выводим отсортированный массив
        ArrayOperations.sortArray(ArrayOperations.getArray());
        System.out.println("Отсортированный массив: " + Arrays.toString(ArrayOperations.getArray()));

        scanner.close();
    }
}