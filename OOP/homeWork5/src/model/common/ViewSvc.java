package OOP.homeWork5.src.model.common;

import OOP.homeWork5.src.classes.partClasses.Part;

import java.util.HashMap;
import java.util.Map;

public class ViewSvc {

    private final ScanKbdSvc scanKbdSvc = new ScanKbdSvc();


    public void printText(String line) {
        System.out.println(line);
    }

    public void printPrompt(String line) {
        System.out.print(line + ": _> ");
    }

    public void printNumberedMap(HashMap<Integer, Part> mapToPrint) {
        for (Map.Entry<Integer, Part> item : mapToPrint.entrySet()) {
            System.out.printf("%d: %s\n", item.getKey(), item.getValue());
        }
    }

    public int chooseDiskVol(String diskType, int diskVol) {
        System.out.printf("Input %s drive volume (Gigabytes, %d max): ", diskType, diskVol);
        return scanKbdSvc.scanNum();
    }

    public int chooseRamVol() {
        int ramVol = 0;
        boolean flag = true;
        while (flag) {
            printPrompt("Set RAM volume (max 64GB)");
            ramVol = scanKbdSvc.scanNum();
            if (ramVol <= 64 && ramVol > 0) {
                flag = false;
            } else {
                System.out.println("Incorrect input. Try again, please.");
            }
        }
        return ramVol;
    }


    public String chooseCpu() {
        printPrompt("Choose CPU brand (Intel, AMD, CANCEL to exit)");
        return scanKbdSvc.scanLine();
    }
}
