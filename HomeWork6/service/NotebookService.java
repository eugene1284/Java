package HomeWork6.service;

import HomeWork6.ComputerComparator;
import HomeWork6.data.impl.NoteBook;
import java.util.Collections;
import java.util.List;

public class NotebookService implements Sortable<NoteBook>{


    @Override
    public List<NoteBook> sort(List<NoteBook> list) {
        Collections.sort(list, new ComputerComparator());
        return list;
    }
}
