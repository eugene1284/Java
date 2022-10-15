package HomeWork6.controller;

import HomeWork6.DesktopLoader;
import HomeWork6.NotebookLoader;
import HomeWork6.data.impl.Desktop;
import HomeWork6.data.impl.NoteBook;
import HomeWork6.service.NotebookFilterService;
import HomeWork6.service.NotebookService;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final List<NoteBook> notebooks = new ArrayList<>();
    private final List<Desktop> desktops = new ArrayList<>();

    public Controller() { // тут мы передаем наши ноутбуки и десктопы в наш контроллер
        NotebookLoader loadNotebooks = new NotebookLoader();
        DesktopLoader loadDT = new DesktopLoader();

        loadNotebooks.loadNtb(notebooks);
        loadDT.loadDskt(desktops);
    }

    public String printNotebooks() {
        NotebookService ntbSvc = new NotebookService();
        return ntbSvc.printedVersion(notebooks);
    }

    public String filterNotebooks(String field, String request) {
        NotebookFilterService nFs = new NotebookFilterService();
        return nFs.commonFilter(notebooks, field, request);
    }

}
