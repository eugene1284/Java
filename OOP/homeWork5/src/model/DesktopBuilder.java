package OOP.homeWork5.src.model;

import OOP.homeWork5.src.classes.DesktopPC;
import OOP.homeWork5.src.classes.partClasses.Cpu;
import OOP.homeWork5.src.classes.partClasses.MainBoard;
import OOP.homeWork5.src.model.common.ScanKbdSvc;
import OOP.homeWork5.src.model.common.ViewSvc;
import OOP.homeWork5.src.model.filters.MainBoardFilter;
import OOP.homeWork5.src.model.filters.RamFilter;
import OOP.homeWork5.src.classes.partClasses.Part;
import OOP.homeWork5.src.classes.partClasses.Ram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DesktopBuilder {

    private final DesktopPC aMachine = new DesktopPC();
    private final ViewSvc vs = new ViewSvc();
    private final ScanKbdSvc scanKbdSvc = new ScanKbdSvc();

    Controller control;

    public DesktopBuilder(Controller control) {
        this.control = control;
    }


    void installRam(int ramVol) {
        List<Ram> memSet = new ArrayList<>();
        RamFilter ramFilter = new RamFilter(control);
        for (Part module : ramFilter.getRamList(ramVol)) {
            memSet.add((Ram) module);
        }
        aMachine.setRam(memSet);
    }

    void installMainBoard() {
        MainBoardFilter mbF = new MainBoardFilter(control);
        HashMap<Integer, Part> mbNumMap = mbF.mbBySocketFilter(aMachine.getCpu().getSocket());
        vs.printNumberedMap(mbNumMap);
        vs.printPrompt("Choose a main board from a list above (0 to decline)");
        int num = scanKbdSvc.scanNum();
        aMachine.setMainBoard((MainBoard) mbNumMap.get(num));
    }



    public DesktopPC buildDesktop(Cpu proc, int ramVol) {
        aMachine.setCpu(proc);
//        aMachine.setRamVol(ramVol);
        installMainBoard();
        if (aMachine.getMainBoard() != null) {
            installRam(ramVol);
            return aMachine;
        }
        return null;

    }
}
