package HomeWork6.model.service;

import HomeWork6.classes.ComputerComparator;
import HomeWork6.classes.data.impl.NoteBook;

import java.util.Collections;
import java.util.List;

public class NotebookServiceSortedBySsd implements Sortable<NoteBook> {
    @Override
    public List<NoteBook> sort(List<NoteBook> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }
}

// данный класс написан для иллюстрации принципа SOLID 2 Leskov