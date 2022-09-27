package HomeWork6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Data_NoteBook n1 = new Data_NoteBook(1, "Air", 8, 256);
        Data_NoteBook n2 = new Data_NoteBook(2, "MagicBook", 16, 512);

        Scanner in = new Scanner(System.in);

        // to do 1. записать данные в файл или в коллекцию (в какую?)

        System.out.println("В нашей базе есть следующие ноутбуки:" +
                "\n" + n1 +
                "\n" + n2); // to do 2. поменять формат вывода, заменить на вывод файла или коллекции

        System.out.println("Введите поле, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterField = in.next();
        System.out.println(Service.methodFindFieldInDataBase(userAnswerFilterField));
        System.out.println("Введите значение, введённого ранее поля, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterValue = in.next();
        in.close();
        System.out.println(Service.methodFindAndWriteFilteringValue(userAnswerFilterField, userAnswerFilterValue));


    }
}
