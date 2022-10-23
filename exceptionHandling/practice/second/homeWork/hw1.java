package exceptionHandling.practice.second.homeWork;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа double),
    и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {

        fractionalNumber();
    }

    public static double fractionalNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        double number = 1.0;

        if (scanner.hasNextDouble() == false) {
            System.out.println("Вы ввели не дробное число");
            fractionalNumber();
            return number;
        } else {
            number = scanner.nextDouble();
            System.out.println("Поздравляю, вы ввели дробное число, его значение: " + number);
            scanner.close();
            return number;
        }
    }
}
