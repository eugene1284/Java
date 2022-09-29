package HomeWork6;

import java.util.ArrayList;
import java.util.List;

public class NotebookService {

    /*public static String methodFindFieldInDataBase(String field){ // метод выполняет проверку наличия поля, которое ввёл пользователь
        String res = o + "1";
        // to do 3. Написать метод
        return res;
    }*/

    public List<NoteBook> methodFindAndWriteFilteringValue(List<NoteBook> list, String field, String value) { // данный метод выводит отфильтрованные строки
        List<NoteBook> fList = new ArrayList<>();
        for (NoteBook notebook : list) {
            switch (field) {
                case "id":
                    if (notebook.getId().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "model":
                    if (notebook.getModel().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "memory":
                    if (notebook.getMemory().equals(value)) {
                        fList.add(notebook);
                    }
                    break;


                case "ssd":
                    if (notebook.getSsd().equals(value)) {
                        fList.add(notebook);
                    }
                    break;
            }
        }

        return fList;
    }

}
