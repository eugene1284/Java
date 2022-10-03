package OOP.homework1.data.impl;

import OOP.homework1.Type;
import OOP.homework1.data.Product;

public class Chocolate extends Product {

    private Boolean nuts;

    public Chocolate(Integer id, String name, Double cost, String position, Type type) { // конструктор
        super(id, name, cost, position, type); // данные параметры описаны в родителе Product
        this.nuts = nuts;
    }
}
