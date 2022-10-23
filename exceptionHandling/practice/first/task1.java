package exceptionHandling.practice.first;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс.
При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем.
То есть, этот метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
 */

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        int[] array = {1, 6, 4, 8, 9, 10, 95};

        int temp = findNumber(array, userAnswer());



        switch (temp){
            case -1 :
                System.out.println("Длина массива меньше заданного минимума");
                break;
            case -2 :
                System.out.println("Искомый элемент не найден");
                break;
            case -3 :
                System.out.println("Массив не задан");
                break;
            default:
                System.out.println(temp);
        }
    }

    private static int findNumber(int[] array, int number) {
        int minLengthArray = 1;
        if (array.length < minLengthArray) {
            return -1;
        } //если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.

        else if (array == null) {
            return -3; //если вместо массива пришел null, метод вернет -3
        } else for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -2;
    }

    private static int userAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер");
        int number = sc.nextInt();
        //sc.hasNextInt();
        sc.close();
        return number;
    }

}
