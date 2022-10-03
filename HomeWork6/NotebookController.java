package HomeWork6;

import java.util.ArrayList;
import java.util.List;

public class NotebookController {
    private NotebookService notebookService;

    public NotebookController() {
        this.notebookService = new NotebookService();
    }

    public List<NoteBook> getFilteredNotebookList(List<NoteBook> list, String field, String value) {

        if (list.isEmpty()){
            return new ArrayList<>();
        }

        if (field.isBlank()){
            throw new StupidUserException();
        }

        if (value.isBlank()){
            throw new StupidUserException();
        }


        return notebookService.methodFindAndWriteFilteringValue(list, field, value);
    }

    public List<NoteBook> getAsusNotebooks(List<NoteBook> list) {
        return notebookService.getAsusNotebooks(list);
    }
}
