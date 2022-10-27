package OOP.homeWork5.src.model.services;
import OOP.homeWork5.src.classes.partClasses.Part;
import OOP.homeWork5.src.classes.partClasses.Ram;

import java.util.ArrayList;
import java.util.List;

public class RamService {
    private final List<Ram> ramList = new ArrayList<>();

    public RamService(){    }

    public void load(List<String> units) {
        for (String s : units) {
            String[] ramLine = s.split(";");
            ramList.add(new Ram(ramLine[0], ramLine[1], ramLine[2]));
        }
    }

    public List<Ram> getRamList() {
        return ramList;
    }

    public String getUnitsStringList() {
        StringBuilder sb = new StringBuilder();
        for (Part unit : ramList)
            sb.append(unit).append("\n");
        return sb.toString();
    }



}
