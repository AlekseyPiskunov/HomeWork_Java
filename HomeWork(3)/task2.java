// 2) Пусть дан произвольный список целых чисел, удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(-9, 10);
            list.add(val);
        }

        System.out.printf("Первоначальный список: %s\n", list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }

        System.out.printf("Список c нечетными числами: %s", list);
    }

}