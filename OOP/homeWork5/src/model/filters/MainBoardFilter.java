package OOP.homeWork5.src.model.filters;

import OOP.homeWork5.src.classes.partClasses.MainBoard;
import OOP.homeWork5.src.classes.partClasses.Part;
import OOP.homeWork5.src.model.Controller;

import java.util.HashMap;

public class MainBoardFilter {

    private final Controller control;
    public MainBoardFilter(Controller control){
        this.control = control;
    }

    public HashMap<Integer, Part> mbBySocketFilter(String socket) {
        HashMap<Integer, Part> mbNumberedList = new HashMap<>();
        socket = socket.replaceAll("[Ss]ocket", "").strip();

        int counter = 0;
        for (MainBoard mb : control.mBoardSvc.getMbList()) {
            if (mb.getSocket().equals(socket)) {
                mbNumberedList.put(++counter, mb);
            }
        }
        return mbNumberedList;
    }

}
