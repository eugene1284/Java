package OOP.homework1.data;

import OOP.homework1.Type;

public class Product {


    private Integer id;
    private String name; // сокрытие данных переменной name на предмет изменения
    private Double cost;
    private String position;
    private Type type;


    public Product(Integer id, String name, Double cost, String position, Type type) { // конструктор
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.position = position;
        this.type = type;
    }

    public String getName() { // геттер
        return name;
    }

    public String getPosition() { // геттер
        return position;
    }

    public Double getCost() { // геттер для возврата стоимости
        return cost;
    }

    public void setName(String name) { // сеттер для установки значения из другого класса
        this.name = name;
    }

    public void setCost(Double cost) { // сеттер
        this.cost = cost;
    }

    /*@Override // унаследовалось в BottleOfTea
    public String toString() {
        return "стоимость: " + cost;
    }*/


    @Override
    public String toString() {
        return String.format("id: %s; name: %s; cost: %.1f; position: %s; type: %s \n", id, name, cost, position, type);
    }


}
