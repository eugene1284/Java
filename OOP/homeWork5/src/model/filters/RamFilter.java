package OOP.homeWork5.src.model.filters;

import OOP.homeWork5.src.classes.partClasses.Part;
import OOP.homeWork5.src.classes.partClasses.Ram;
import OOP.homeWork5.src.model.Controller;

import java.util.ArrayList;
import java.util.List;

public class RamFilter {
    public final List<Plates> memSet = new ArrayList<>();
    private final List<Part> ramList = new ArrayList<>();

    private final Controller control;

    public RamFilter(Controller control) {
        this.control = control;
    }

    enum Plates {
        SIXTEEN(16), EIGHT(8), FOUR(4), TWO(2), ONE(1);
        private final int vol;

        Plates(int a) {
            this.vol = a;
        }

        int getVol() {
            return this.vol;
        }

    }

    public void count(int inVol) {
        memSet.clear();
        int vol = inVol;
        int position = 0;

        while (vol > 0) {
            while (vol - Plates.values()[position].getVol() > 0) {
                memSet.add(Plates.values()[position]);
                vol -= Plates.values()[position].getVol();
            }
            if (vol % Plates.values()[position].getVol() == 0) {
                memSet.add(Plates.values()[position]);
                vol -= Plates.values()[position].getVol();
            } else {
                position++;
            }
        }
    }

    boolean checker(List<Part> ramList, int wishedVol) {
        if (ramList.size() > 4)
            return false;
        int result = 0;
        for (Part module : ramList) {
            result += ((Ram) module).getIntRamVol();
        }
        return Math.abs(result - wishedVol) < 3;
    }

    public List<Part> getRamList(int wishedVol) {
        List<Ram> ramStore = control.ramSvc.getRamList();
        count(wishedVol);
        for (Plates plate : memSet) {
            for (Ram module : ramStore) {
                if (module.getIntRamVol() == plate.getVol()) {
                    ramList.add(module);
                    break;
                }
            }
        }
        if (!checker(ramList, wishedVol)) {
            ramList.clear();
            getRamList(wishedVol + 1);
        }
        return ramList;
    }
}
