package HomeWork6.controller;

import HomeWork6.data.impl.NoteBook;
import HomeWork6.service.NotebookService;

import java.util.ArrayList;
import java.util.List;

public class NotebookController {
    private NotebookService notebookService;

    public NotebookController() {
        this.notebookService = new NotebookService();
    }

    public List<NoteBook> getSortedNotebookById(List<NoteBook> list) {return notebookService.sort(list);}
}
