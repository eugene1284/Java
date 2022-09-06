
/*
Написать консольный калькулятор принимающий два числа и операто(умножение, деление, сложение, вычитание)
 и завершающий процесс по решению пользователя. 
 Завершающее слово должно быть не регистрочувствительным
 (Пример: поданные слова в разном регистре "Да", "да", "дА", "ДА" - должны быть однозначно трактованны, как "Да").

Пример:

Введите первое число:
5
Введите второе число:
10
Введите желаемую операцию
*
Результат: 50
Хотите продолжить?
Нет
 */
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        do {
            calc(iScanner);
        } while (question(iScanner));
        iScanner.close();
    }

    public static void calc(Scanner scan) {

        System.out.printf("Введите первое число: ");
        float firstNumber = scan.nextFloat();
        System.out.printf("Введите второе число: ");
        float secondNumber = scan.nextFloat();
        System.out.printf("Выберите операцию ( * , / , + , - ) ");
        String operation = scan.next();
        switch (operation) {
            case "+":
                System.out.printf("Результат = %s", firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("Результат = %s", firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("Результат = %s", firstNumber * secondNumber);
                break;
            case "/":
                System.out.printf("Результат = %s", firstNumber / secondNumber);
                break;
            default:
                System.out.printf("Некорректный ввод");
        }
    }

    public static boolean question(Scanner scan) {
        System.out.printf("\nХотите продолжить?\n");
        byte[] b = scan.next().getBytes();
        String answer = new String(b);
        return answer.equalsIgnoreCase("да");
    }
}