// 3) Задан целочисленный список ArrayList. Найти мин. , макс. и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(-9, 10);
            list.add(val);
        }
        System.out.printf("Список: %s\n", list);
        int max = max(list);
        int min = min(list);
        int maxItem = list.get(0);
        int minItem = list.get(0);
        int sumItems = 0;
        for (int item : list) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float) sumItems / list.size();
        System.out.printf("Максимальный элемент при помощи (java.util.Collections.max): %s\n", max);
        System.out.printf("Максимальный элемент: %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи (java.util.Collections.min): %s\n", min);
        System.out.printf("Минимальный элемент: %s\n", minItem);
        System.out.printf("Среднее арифметическое: %s\n", average);
    }
}