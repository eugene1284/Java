package HomeWork6;

import HomeWork6.Data.NoteBook;

import java.util.List;

public class NotebookController {
    private NotebookService notebookService;

    public NotebookController(){
        this.notebookService = new NotebookService();
    }

    public List<NoteBook> getFilteredNotebookList(List<NoteBook> list, String field, String value){
        return notebookService.methodFindAndWriteFilteringValue(list, field, value);
    }
}
