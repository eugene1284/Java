package exceptionHandling.practice.third;

/*
Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.

Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
Исключение должно отображать понятное для пользователя сообщение об ошибке

Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
*/

public class task3 {
    public static void main(String[] args) {

        int number = 1;
        int a = 1;
        int b = 0;

        Integer[] myArray;
        myArray = new Integer[2];
        myArray[1] = null;

        try {
            if (b == 0) throw new task3ExceptionDivideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (myArray[1] == null) throw new task3NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        }



        /*
        Integer[] myArray;
        myArray = new Integer[2];
        myArray[1] = null;
        try {
            int result = myArray[1] + 1;
        } catch (NullPointerException e) {
            throw new task3NullPointerException();
        }*/

    }
}
