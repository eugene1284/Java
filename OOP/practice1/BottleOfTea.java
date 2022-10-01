package OOP.practice1;

// у ребёнка только 1 родитель
// у родителя сколько угодно детей

public class BottleOfTea extends Product { // наследование // ребёнок никогда не должен урезать функционал родителя

    private Double volume;

    public BottleOfTea(String name, Double cost, Double volume) { // конструктор 
        super(name, cost); // данные параметры описаны в родителе Product  //сначала берём логику от родителя
        this.volume = volume;
    }


}

abstract class Test_Abstract_Сlass1 { // абстракнтый класс - это класс, который несёт в себе логику, но ему запрещено иметь свои объекты

}