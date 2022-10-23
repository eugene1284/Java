package OOP.practice7;

public class Valera
        extends ValeraParent  // пример нарушения принципа D — Dependency Inversion (Принцип инверсии зависимостей)
        implements HumanWorker{

    // тут мы обязаны реализовать логику интерфейса humanworker
    // Мы не можем ему не дописать методы дыхания и работы для валеры
    @Override
    public CO2 breath(Object air) {
        return null;
    }

    @Override
    public void work() {
        System.out.println("im valera. im working...");
    }
}
