package OOP.homeWork5.src.model.services;

import OOP.homeWork5.src.classes.partClasses.MainBoard;
import OOP.homeWork5.src.classes.partClasses.Part;

import java.util.ArrayList;
import java.util.List;

public class MBoardService {
    private final List<MainBoard> mbList = new ArrayList<>();

    public MBoardService(){
    }

    public void load(List<String> units) {
        for (String s : units) {
            String[] mbLine = s.split(";");
            mbLine[2] = mbLine[2].replaceAll("Socket", "").
                    replaceAll("[Ss-]", "").strip();
            mbList.add(new MainBoard(mbLine[0], mbLine[1], mbLine[2], mbLine[3], mbLine[4], mbLine[5]));
        }
    }

    public List<MainBoard> getMbList() {
        return mbList;
    }
    public String getUnitsStringList() {
        StringBuilder sb = new StringBuilder();
        for (Part unit : mbList)
            sb.append(unit).append("\n");
        return sb.toString();
    }
}
