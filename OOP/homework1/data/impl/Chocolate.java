package OOP.homework1.data.impl;

import OOP.homework1.data.Product;

public class Chocolate extends Product {

    private Boolean nuts;

    public Chocolate(Integer id, String name, Double cost, Integer position) { // конструктор
        super(id, name, cost, position); // данные параметры описаны в родителе Product
        this.nuts = nuts;
    }
}
