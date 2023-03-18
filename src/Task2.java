//Реализовать простой калькулятор (+ - / *)
//Ввод числа ->
//Ввод знака ->
//Ввод числа ->

import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double resalt = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num1 = num.nextInt();
        System.out.println("Введите второе число");
        double num2 = num.nextInt();
        System.out.println("Введите необходимую арифмитическую операция операцию");
        char value = num.next().charAt(0);
        num.close();


            switch (value) {

                case '+': resalt = num1 + num2;
                break;

                case '-': resalt = num1 - num2;

                break;
                case '*':
                    resalt = num1 * num2;
                break;
                case '/':
                    resalt = num1 / num2;

            }
        System.out.println("Result = 5" +  resalt);
        }}











//        try {
//            if (value == '+') {
//                System.out.println(num1 + num2);
//
//            }
//        }
//        catch (IOException e){
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }



