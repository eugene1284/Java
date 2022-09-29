package OOP.homework1.data.impl;

// у ребёнка только 1 родитель
// у родителя сколько угодно детей

import OOP.homework1.data.Product;

public class BottleOfTea extends Product { // наследование // ребёнок никогда не должен урезать функционал родителя

    private Double volume;

    public BottleOfTea(Integer id, String name, Double cost, Integer position, Double volume) { // конструктор
        super(id, name, cost, position); // данные параметры описаны в родителе Product  //сначала берём логику от родителя
        this.volume = volume;
    }


}

abstract class Test_Abstract_Сlass1 { // абстракнтый класс - это класс, который несёт в себе логику, но ему запрещено иметь свои объекты

}