package HomeWork6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NoteBook n1 = new NoteBook("1", "Air", "8", "256");
        NoteBook n2 = new NoteBook("2", "MagicBook", "16", "512");

        ArrayList<NoteBook> al = new ArrayList<NoteBook>();
        al.add(n1);
        al.add(n2);

        Scanner in = new Scanner(System.in);

        // to do 1. записать данные в файл или в коллекцию (в какую?)

        System.out.println("В нашей базе есть следующие ноутбуки:" +
                "\n" + n1 +
                "\n" + n2); // to do 2. поменять формат вывода, заменить на вывод файла или коллекции

        System.out.println("Введите поле, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterField = in.next();
        System.out.println("Введите значение, введённого ранее поля, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterValue = in.next();
        in.close();

        NotebookContoller contoller = new NotebookContoller();

        System.out.println(contoller.getFilteredNotebookList(al,userAnswerFilterField,userAnswerFilterValue));

/*
NotebookContoller - тип создаваемого объекта
contoller - название создаваемого объекта
new - говорит, что мы создаём объект

 */

    }
}
