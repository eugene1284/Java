package OOP.homework1;

import OOP.homework1.data.Product;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    // метод, который выбирает продукт сначала по имени
    // а потом по стоимости


    VendingMachine vm;

    public Controller() {
        this.vm = new VendingMachine();
    }


    public List<Product> getProductsByNameAndCost(String name, Double cost) { // данный метод иллюстрирует SOLID 1
        List<Product> list = new ArrayList<>();

        for (Product p: vm.getProductByName(name)) {
            if(p.getCost().equals(cost)) {
                list.add(p);
            }
        }
        return list;
    }
}
