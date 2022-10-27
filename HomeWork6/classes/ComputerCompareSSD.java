package HomeWork6.classes;

import HomeWork6.classes.data.impl.Computer;

import java.util.Comparator;

public class ComputerCompareSSD implements Comparator<Computer> {

    @Override
    public int compare(Computer o, Computer o2) {
        if (Integer.valueOf(o.getSsd()) > Integer.valueOf(o2.getSsd())) return 1;
        if (Integer.valueOf(o.getSsd()) > Integer.valueOf(o2.getSsd())) return -1;
        return 0;
    }
}

// данный класс написан для иллюстрации принципа SOLID