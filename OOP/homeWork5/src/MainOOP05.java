package OOP.homeWork5.src;

import OOP.homeWork5.src.model.Controller;

public class MainOOP05 {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.loadParts();
        controller.startBuildPC();
    }
}
