// 1) Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
public class task1 {
    public static void main(String[] args) {
        System.out.println(triangle(5));
    }

    static int triangle(int n) {
        if(n==1)
            return 1;
        else
            return(n + triangle(n-1));
    }
}