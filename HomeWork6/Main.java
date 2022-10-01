package HomeWork6;

import HomeWork6.Data.NoteBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NoteBook n1 = new NoteBook("1", "Air", Memory.EIGHT, "256");
        NoteBook n2 = new NoteBook("2", "MagicBook", Memory.SIXTEEN, "512");
        NoteBook n3 = new NoteBook("3", "MateBook", Memory.SIXTEEN, "512");

        ArrayList<NoteBook> al = new ArrayList<NoteBook>();
        al.add(n1);
        al.add(n2);
        al.add(n3);

        Scanner in = new Scanner(System.in);

        System.out.println("В нашей базе есть следующие ноутбуки:" +
                "\n" + n1 +
                "\n" + n2 +
                "\n" + n3 );

        System.out.println("Введите поле, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterField = in.next();
        System.out.println("Введите значение, введённого ранее поля, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterValue = in.next();
        in.close();

        NotebookController contoller = new NotebookController();
/*
NotebookContoller - тип создаваемого объекта
contoller - название создаваемого объекта
new - говорит, что мы создаём объект
 */

        System.out.println(contoller.getFilteredNotebookList(al,userAnswerFilterField,userAnswerFilterValue));



    }
}
