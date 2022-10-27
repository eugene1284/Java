package HomeWork6.model.service;

import HomeWork6.classes.ComputerComparator;
import HomeWork6.classes.data.impl.NoteBook;

import java.util.Collections;
import java.util.List;

public class NotebookService implements Sortable<NoteBook>, Printable<NoteBook> {


    @Override
    public List<NoteBook> sort(List<NoteBook> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }

    @Override
    public String printedVersion(List<NoteBook> unitList) {
        StringBuilder sb = new StringBuilder();
        for (NoteBook noteBook : sort(unitList)) {
            sb.append(noteBook).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void print(List<NoteBook> unitList) {

    }
}
