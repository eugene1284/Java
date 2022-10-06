package OOP.homeWork3;

import HomeWork6.data.impl.NoteBook;

import java.util.ArrayList;

public class Main {
    // ToDo: в main инициализировать коллекции и вызвать контроллер
    public static void main(String[] args) {
        Human fatherBobSmith = new Human("Bob", "Smith", Gender.MALE, "40");
        Human motherKateSmith = new Human("Kate", "Smith", Gender.FEMALE, "35");
        Human daughterMarySmith = new Human("Mary", "Smith", Gender.FEMALE, "15");

        ArrayList<Human> humanArrayList = new ArrayList<Human>();
        humanArrayList.add(fatherBobSmith);
        humanArrayList.add(motherKateSmith);
        humanArrayList.add(daughterMarySmith);

        ArrayList<Relative> relativeArrayList = new ArrayList<>();


        // ToDo: передать эти листы в контроллер    contrloller()
            // ToDo: контроллер обращается в сервис
    }
}
