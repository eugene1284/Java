package OOP.homeWork3.service;

import OOP.homeWork3.people.Human;
import OOP.homeWork3.people.Relation;
import OOP.homeWork3.people.Relative;

import java.util.List;

public class ViewService {

    public void printMenu() {
        String menu = "\n\n" +
                "Enter your choice:\n" +
                "1. Print full info about humans\n" +
                "2. Find Human\n" +
                "3. Print full info about relatives\n" +
                "0: Exit\n" + "_> ";
        System.out.println(menu);
    }

    public void printFullHumanList(List<Human> list){
        for (Human person : list) {
            System.out.println(person);
        }
    }

    public void printFullRelativesList(List<Relative> rtlList) {
        for (Relative pair : rtlList)
            System.out.println(pair);
    }

    public void printTree(List<Relative> list) {
        for (Relative r : list) {
            if (r.getRelation().equals(Relation.FATHER)) {
                System.out.print("||  |\n||  |______");
                System.out.println(r.getRelation() + " of " + r.getHuman2());
            } else {
                System.out.print("||\n\n||");
                System.out.println(r);
            }
        }
    }
}
