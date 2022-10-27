package OOP.homeWork5.src.model;

import OOP.homeWork5.src.classes.DesktopPC;
import OOP.homeWork5.src.model.common.ScanKbdSvc;
import OOP.homeWork5.src.model.common.ViewSvc;
import OOP.homeWork5.src.model.filters.CpuFilter;
import OOP.homeWork5.src.model.services.CpuService;
import OOP.homeWork5.src.model.services.MBoardService;
import OOP.homeWork5.src.model.services.RamService;
import OOP.homeWork5.src.classes.partClasses.Cpu;
import OOP.homeWork5.src.classes.partClasses.Part;

import java.util.HashMap;

public class Controller {
    private final ViewSvc vs = new ViewSvc();
    public final CpuService cpuSvc = new CpuService();
    public final RamService ramSvc = new RamService();
    public final MBoardService mBoardSvc = new MBoardService();

    public void loadParts() {
        Preloader preLdr = new Preloader();
        preLdr.parser();
        cpuSvc.load(preLdr.parts.get("cpu"));
        ramSvc.load(preLdr.parts.get("ram"));
        mBoardSvc.load(preLdr.parts.get("mainBoard"));
    }

    public void startBuildPC() {
        ScanKbdSvc scanKbd = new ScanKbdSvc();
        CpuFilter cf = new CpuFilter();

        HashMap<Integer, Part> cpuList = new HashMap<>();
        String brand = null;
        int ramVol;
        Cpu proc;

        boolean flag = true;
        while (flag) {
            brand = vs.chooseCpu();
            if (!brand.equalsIgnoreCase("cancel")) {
                cpuList = cf.brandFilter(cpuSvc.getCpuList(), brand);
                if (cpuList.size() > 0) {
                    flag = false;
                } else {
                    vs.printText("Incorrect input. Try again, please.");
                }
            } else {
                flag = false;
            }
        }
        if (!brand.equalsIgnoreCase("cancel")) {
            vs.printNumberedMap(cpuList);
            vs.printPrompt("Choose processor: \b\r");
            proc = (Cpu) cpuList.get(scanKbd.scanNum());

            ramVol = vs.chooseRamVol();


            DesktopBuilder dtBuild = new DesktopBuilder(this);
            DesktopPC newPC = dtBuild.buildDesktop(proc, ramVol);
            if (newPC != null) {
                vs.printText(newPC.toString());
            } else {
                vs.printText("Assembly cancelled!");
            }
        } else {
            vs.printText("Assembly cancelled!");
        }
    }
}
