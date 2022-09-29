package OOP.homework1.data.impl;

import OOP.homework1.data.Product;

public class Chips extends Product {

    private String flavor;

    public Chips (Integer id, String name, Double cost, Integer position){
        super(id, name, cost, position);
        this.flavor = flavor;
    }
}
