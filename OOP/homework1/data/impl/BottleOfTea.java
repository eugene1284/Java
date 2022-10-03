package OOP.homework1.data.impl;

// у ребёнка только 1 родитель
// у родителя сколько угодно детей

import OOP.homework1.Type;
import OOP.homework1.data.Product;

public class BottleOfTea extends Product { // наследование // ребёнок никогда не должен урезать функционал родителя

    private Double volume;

    public BottleOfTea(Integer id, String name, Double cost, String position, Double volume, Type type) { // конструктор
        super(id, name, cost, position, type); // данные параметры описаны в родителе Product  //сначала берём логику от родителя
        this.volume = volume;
    }


}