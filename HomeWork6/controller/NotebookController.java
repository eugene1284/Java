package HomeWork6.controller;

import HomeWork6.data.impl.NoteBook;
import HomeWork6.service.NotebookService;
import HomeWork6.service.NotebookServiceSortedBySsd;

import java.util.ArrayList;
import java.util.List;

public class NotebookController {
    private NotebookService notebookService;
    private NotebookServiceSortedBySsd notebookServiceSortedBySsd;

    public NotebookController() {
        this.notebookService = new NotebookService();
        this.notebookServiceSortedBySsd = new NotebookServiceSortedBySsd();
    }


    public List<NoteBook> getSortedNotebookById(List<NoteBook> list) {return notebookService.sort(list);}

    public List<NoteBook> getSortedNotebookBySSD(List<NoteBook> list) {return notebookServiceSortedBySsd.sort(list);}
}
