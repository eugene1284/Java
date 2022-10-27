package OOP.homeWork5.src.model.services;

import OOP.homeWork5.src.classes.partClasses.Cpu;
import OOP.homeWork5.src.classes.partClasses.Part;

import java.util.ArrayList;
import java.util.List;

public class CpuService {
    private final List<Cpu> cpuList = new ArrayList<>();

    public void load(List<String> units) {
        for (String s : units) {
            String[] procLine = s.split(";");
            if(procLine[1] == null)
                procLine[1] = "n/a";
            if (procLine[0] != null && procLine[2] != null)
                cpuList.add(new Cpu(procLine[0], procLine[1], procLine[2]));
        }
    }

    public List<Cpu> getCpuList() {
        return cpuList;
    }

    public List<Cpu> getCpuByBrand(String brandName) {
        List<Cpu> brandLine = new ArrayList<>();
        for (Cpu proc : cpuList) {
            if (proc.getBrand().equals(brandName)) {
                brandLine.add(proc);
            }
        }
        return brandLine;
    }


    public String getUnitsStringList() {
        StringBuilder sb = new StringBuilder();
        for (Part unit : cpuList)
            sb.append(unit).append("\n");
        return sb.toString();
    }
}
