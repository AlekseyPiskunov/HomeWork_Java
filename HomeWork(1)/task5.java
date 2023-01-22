// 5) Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class task5 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 2, 2, 3};
        int val = 3;

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j++;
            }
        }

        for (int item : array) {
            System.out.println(item);
        }
    }

}
