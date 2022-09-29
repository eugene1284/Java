package HomeWork6;

import java.util.List;

public class NotebookContoller {
    private NotebookService notebookService;

    public NotebookContoller(){
        this.notebookService = new NotebookService();
    }

    public List<NoteBook> getFilteredNotebookList(List<NoteBook> list, String field, String value){
        return notebookService.methodFindAndWriteFilteringValue(list, field, value);
    }
}
