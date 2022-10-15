package HomeWork6;

import HomeWork6.controller.Controller;
import HomeWork6.controller.NotebookController;
import HomeWork6.data.impl.NoteBook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Main mLever = new Main();
        Logger logger = Logger.getAnonymousLogger();
        StringBuilder sb = new StringBuilder();
        Controller controller = new Controller();

        sb.append("\nВ нашей базе есть ноутбуки:\n");
        sb.append(controller.printNotebooks());
        logger.info(sb.toString());
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Что будем искать? ");
            String deviceSection = input.next();
            input.reset();
            mLever.chooser(deviceSection, logger, controller);
        }

    }

    void chooser(String deviceSection, Logger logger, Controller controller) {
        String[] fields;
        switch (deviceSection) {
            case "Notebooks":
            case "notebooks":
                fields = askField();
                logger.info(controller.filterNotebooks(fields[0], fields[1]));
                break;
            default:
                throw new IllegalStateException("Wrong search area");
        }
    }

    String[] askField() {
        String[] response = new String[2];
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите поле, по которому хотите выполнить поиск устройства: ");
            response[0] = input.nextLine();
            System.out.print("Введите значение, введённого ранее поля, по которому хотите выполнить поиск устройства: ");
            response[1] = input.nextLine();
            input.reset();
        }
        return response;
    }


/*
        ArrayList<NoteBook> al = new ArrayList<NoteBook>();
        al.add(n1);
        al.add(n2);
        al.add(n3);

        Scanner in = new Scanner(System.in);

        System.out.println("В нашей базе есть следующие ноутбуки:" +
                "\n" + n1 +
                "\n" + n2 +
                "\n" + n3);*/

        /*System.out.println("Введите поле, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterField = in.next();
        System.out.println("Введите значение, введённого ранее поля, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterValue = in.next();
        in.close();*/

/*        NotebookController contoller = new NotebookController();


        StringBuilder sb = new StringBuilder();
        Logger lg = Logger.getLogger(Main.class.getName());
        try {
            sb.append(contoller.getSortedNotebookById(al));
            lg.log(Level.INFO, sb.toString());
        } catch (Exception ex) {
            lg.log(Level.WARNING, ex.getMessage());
        }

        // ToDo: результат: вывод наших ноутбуков и десктопов и запись в логе

*/


/*
NotebookContoller - тип создаваемого объекта
contoller - название создаваемого объекта
new - говорит, что мы создаём объект
 */

    //System.out.println(contoller.getFilteredNotebookList(al,userAnswerFilterField,userAnswerFilterValue));
    //System.out.println(contoller.getFilteredNotebookList(al,userAnswerFilterField,"")); // данный метод вызовет Exception in thread "main" HomeWork6.StupidUserException

}
