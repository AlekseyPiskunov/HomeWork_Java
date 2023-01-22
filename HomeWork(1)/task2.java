// 2) Вывести все простые числа от 1 до 1000.
public class task2 {
    public static void main(String[] args) {
        numberGenerator(1000);
    }

    static void numberGenerator(int value) {
        int index = 0;
        while (index != value) {
            System.out.println(index + 1);
            index++;
        }
    }
}