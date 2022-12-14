package OOP.homework1;

import OOP.homework1.data.Product;
import OOP.homework1.data.impl.BottleOfTea;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    public VendingMachine() { // конструктор по умолчанию
        products.add(new Product(1, "Snikers", 10.0, "1", Type.CHOCOLATE)); // если мы делаем класс Product абстрактным, то мы не можем добавлять в него объекты
        products.add(new Product(2, "Bounty", 11.0, "2", Type.CHOCOLATE)); // тут переделать продукт на шоколадки
        products.add(new Product(3, "Twix", 12.0, "3", Type.CHOCOLATE));
        products.add(new Product(4, "Nestea", 13.0, "4", Type.BOTTLEOFTEA));
        products.add(new Product(6, "Nestea", 20.0, "6", Type.BOTTLEOFTEA));
        products.add(new Product(5, "Lays", 14.0, "5", Type.CHIPS));
        products.add(new Product(7, "Twix", 20.0, "7", Type.CHOCOLATE));
    }

    public List<Product> getProductByName(String name) { // контракт
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                list.add(product);
            }
        }
        return list;
    }

    public Product getProductByPosition(String position) { // контракт
        for (Product product : products) {
            if (product.getPosition().equals(position))
                return product;
        }
        return null;
    }

    public List<Product> getProductByCost(Double cost) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getCost().equals(cost)) {
                list.add(product);
            }
        }
        return list;
    }


    public BottleOfTea getBottleOfTea(Integer id, String name, Double cost, String position, Double volume, Type type) { //метод, который вернёт бутылку воды
        return new BottleOfTea(id, name, cost, position, volume, Type.BOTTLEOFTEA);
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