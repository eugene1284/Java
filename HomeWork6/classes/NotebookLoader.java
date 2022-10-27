package HomeWork6.classes;

import HomeWork6.classes.data.impl.NoteBook;

import java.util.Arrays;
import java.util.List;

public class NotebookLoader {
    public NotebookLoader(){}

    public void loadNtb(List<NoteBook> ntbList){
        NoteBook n1 = new NoteBook("14", "Air", Memory.EIGHT, "256", 65_000);
        NoteBook n2 = new NoteBook("2", "MagicBook", Memory.SIXTEEN, "512", 70_000);
        NoteBook n3 = new NoteBook("3", "MateBook", Memory.SIXTEEN, "512", 75_000);
        ntbList.addAll(Arrays.asList(n1, n2, n3));
    }
}
