package HomeWork6.model.service;

import HomeWork6.classes.data.impl.Computer;

import java.util.List;

public interface Printable<T extends Computer> { // типизированный интерфейс

    String printedVersion(List<T> unitList);

    void print(List<T> unitList);
}


//<> diamond operator