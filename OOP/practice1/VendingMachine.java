package OOP.practice1;

import java.util.ArrayList;

public class VendingMachine {

    public VendingMachine() { // конструктор по умолчанию
        products.add(new Product("Snikers", 10.0)); // если мы делаем класс Product абстрактным, то мы не можем добавлять в него объекты
        products.add(new Product("Bounty", 11.0)); // тут переделать продукт на шоколадки
        products.add(new Product("Twix", 12.0));

    }

    public Product getProductByName(String name) { // можно назвать метод getProductByName контрактом
        for (Product product : products) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProductByCost(Double cost) {
        for (Product product : products) {
            if (product.getCost().equals(cost))
                return product;
        }
        return null;
    }


    public BottleOfTea getBottleOfTea(String name, Double cost, Double volume) { //метод, который вернёт бутылку воды
        return new BottleOfTea(name, cost, volume);
    }

    // то что мы передаём в getProductByCost string - есть перегрузка overload
    public Product getProductByCost(String string_cost) { // реализуем полиморфизм (метод выполняет одну и ту же задачу, но с разными данными // перегрузка overload метода getProductByCost
        for (Product product : products) {
            if (product.getCost().equals(Double.valueOf(string_cost)))
                return product;
        }
        return null;
    }

    ArrayList<Product> products = new ArrayList<>();



}

// конструктор - метод, цель которого вернуть настроенный объект

/*
 * public static void main(String[] args) {
 * Product p = new Product("Snikers", 10.0);
 * Product p1 = new Product("Bounty", 11.0);
 * 
 * p.setName("twix");
 * p1.getName();
 * 
 * 
 * 
 * }
 */