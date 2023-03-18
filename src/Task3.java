//*(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.
//Ввод: 2? + ?5 = 69
//Вывод: 24 + 45 = 69
//1)Делим число ищем где ? сохраняем значения делаем счетчик
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String number1 = number.nextLine();
        char[] symbol = new char[number1.length()];
        System.out.println(number1.length());
        number1.getChars(0, number1.length(), symbol, 0 );
        System.out.println(symbol);



    }
}
