package HomeWork6.controller;

import HomeWork6.classes.DesktopLoader;
import HomeWork6.classes.NotebookLoader;
import HomeWork6.classes.data.impl.Desktop;
import HomeWork6.classes.data.impl.NoteBook;
import HomeWork6.model.Preloader;

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
/*
    public String printNotebooks() {
        NotebookService ntbSvc = new NotebookService();
        return ntbSvc.printedVersion(notebooks);
    }

    public String filterNotebooks(String field, String request) {
        NotebookFilterService nFs = new NotebookFilterService();
        return nFs.commonFilter(notebooks, field, request);
    }

    public void loadParts() {
        Preloader preLdr = new Preloader();
        preLdr.parser();
        cpuSvc.load(preLdr.parts.get("cpu"));
        mBoardSvc.load(preLdr.parts.get("mainBoard"));

    }*/

}
