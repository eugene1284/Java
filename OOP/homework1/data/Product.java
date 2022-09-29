package OOP.homework1.data;

public class Product {


    private Integer id;
    private String name; // сокрытие данных переменной name на предмет изменения
    private Double cost;
    private Integer position;

    public Product(Integer id, String name, Double cost, Integer position) { // конструктор
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.position = position;
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
