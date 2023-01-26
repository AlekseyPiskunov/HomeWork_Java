// 2) К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        int x = getValue();
        int y = getValue();
        char symbol = getSymbol();
        int result = operations(x, y, symbol);
        view(result);
    }

    // Ввод символа.
    static char getSymbol() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("operation (+,-,*,/): ");
        char symbol;
        if (iScanner.hasNext()) {
            symbol = iScanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе! Попробуйте ещё раз.");
            iScanner.next();
            symbol = getSymbol();
        }
        return symbol;
    }

    // Ввод чисел.
    static int getValue() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("value: ");
        int value;
        if (iScanner.hasNextInt()) {
            value = iScanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте ещё раз.");
            iScanner.next();
            value = getValue();
        }
        return value;
    }

    // Запись. (logger)
    static void logger(char symbol) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write("Была выполнена операция: ");
            fw.append(symbol);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Операции.
    static int operations(int a, int b, char symbol) {
        int result;
        switch (symbol) {
            case '+':
                result = a + b;
                logger(symbol);
                break;
            case '-':
                result = a - b;
                logger(symbol);
                break;
            case '*':
                result = a * b;
                logger(symbol);
                break;
            case '/':
                result = a / b;
                logger(symbol);
                break;
            default:
                System.out.println("Операция не распознана! Попробуйте ещё раз.");
                result = operations(a, b, getSymbol());
        }
        return result;
    }

    // Вывод.
    static void view(int res) {
        System.out.printf("result = %d", res);
    }
}