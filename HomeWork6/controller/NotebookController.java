package HomeWork6.controller;

import HomeWork6.classes.data.impl.NoteBook;
import HomeWork6.model.service.NotebookService;
import HomeWork6.model.service.NotebookServiceSortedBySsd;

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
