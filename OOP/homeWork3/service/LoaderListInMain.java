package OOP.homeWork3.service;

import OOP.homeWork3.people.Gender;
import OOP.homeWork3.people.Human;
import OOP.homeWork3.people.Relation;
import OOP.homeWork3.people.Relative;

import java.util.ArrayList;
import java.util.List;

public class LoaderListInMain {

    public void voidLoadHumanRelativeInMain(List<Human> humanArrayList, List<Relative> relativeArrayList){
        humanArrayList.add(new Human("Bob", "Smith", Gender.MALE, "40"));
        humanArrayList.add(new Human("Kate", "Smith", Gender.FEMALE, "35"));
        humanArrayList.add(new Human("Mary", "Smith", Gender.FEMALE, "15"));



        relativeArrayList.add(new Relative(
                new Human("Bob", "Smith", Gender.MALE, "40"),
                Relation.HUSBAND,
                new Human("Kate", "Smith", Gender.FEMALE, "35")));

        relativeArrayList.add(new Relative(
                new Human("Bob", "Smith", Gender.MALE, "40"),
                Relation.FATHER,
                new Human("Mary", "Smith", Gender.FEMALE, "15")));

        relativeArrayList.add(new Relative(
                new Human("Kate", "Smith", Gender.FEMALE, "35"),
                Relation.WIFE,
                new Human("Bob", "Smith", Gender.MALE, "40")));

        relativeArrayList.add(new Relative(
                new Human("Mary", "Smith", Gender.FEMALE, "15"),
                Relation.DAUGHTER,
                new Human("Bob", "Smith", Gender.MALE, "40")));



    }

}
