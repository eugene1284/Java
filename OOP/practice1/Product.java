package OOP.practice1;

public class Product {


    private String name; // сокрытие данных переменной name на предмет изменения
    private Double cost;

    public Product(String name, Double cost) { // конструктор
        this.cost = cost;
        this.name = name;
    }

    public String getName() { // геттер
        return name;
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

    @Override // унаследовалось в BottleOfTea
    public String toString() {
        return "стоимость: " + cost;
    }

/*
    @Override
    public String toString() {
        return String.format("prod: %s, cost: %f", name, cost);
    }
*/

}
