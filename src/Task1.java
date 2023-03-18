//Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//        Ввод:5
//        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//        n! 1 * 2 * 3 * 4 * 5 = 120
//
//        Вывести все простые числа от 1 до 1000
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scun = new Scanner(System.in);
        System.out.print("введите значение n :");
        String scan1 = scun.nextLine();
        scun.close();
        System.out.println(scan1);
//        System.out.println(n.length());
        int n = Integer.parseInt(scan1);
        int summ = 0;
        int factor = 1;
        for (int i = 1 ; i<=n ; i++) {
            summ += i;
            factor *= i;

        }
        System.out.printf("summ =%d ; factor = %d", summ,  factor);
    }

}
