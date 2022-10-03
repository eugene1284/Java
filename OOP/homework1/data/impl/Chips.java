package OOP.homework1.data.impl;

import OOP.homework1.Type;
import OOP.homework1.data.Product;

public class Chips extends Product {

    private String flavor;

    public Chips (Integer id, String name, Double cost, String position, Type type){
        super(id, name, cost, position, type);
        this.flavor = flavor;
    }
}
