// 1) Пусть дан LintedList с несколькими элементами. Реализуйте метод, который вернёт "перевёрнутый" список.
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {

        int[] list = {8, 1, 6, 3, 5};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : list) {
            linkList.add(temp);
        }
        
        int index = 0;
        while (index != linkList.size() - 1) {
            linkList.add(linkList.size() - index, linkList.getFirst());
            linkList.removeFirst();
            index++;
        }
        System.out.println("linkList = " + linkList);
    }
}