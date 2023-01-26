// 1) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 2, 4, 1, 3};
        int[] result = bubbleSort(array);
        printArray(result);
    }

    // Пузырьковая сортировка.
    static int[] bubbleSort(int[] arr) {
        boolean flag = false;
        int temporary;
        int count = 1;
        while (!flag) {
            flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                logger(count, arr);
                count++;
                if (arr[i] > arr[i + 1]) {
                    flag = false;
                    temporary = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temporary;
                }
            }
        }
        return arr;
    }

    // Печать массива.
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // Запись. (logger)
    static void logger(int count, int[] arr) {
        try (FileWriter fw = new FileWriter("logger.txt", true)) {
            String index = Integer.toString(count);
            String array = Arrays.toString(arr);
            fw.write("Итерация: ");
            fw.write(index);
            fw.append('\n');
            fw.write("Массив: ");
            fw.write(array);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}