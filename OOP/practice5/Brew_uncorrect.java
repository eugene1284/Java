package OOP.practice5;

// иллюстрация принципа I — Interface Segregation (Принцип разделения интерфейсов)
// пример неправильного интерфейса

public interface Brew_uncorrect {

    void addWater();
    void addSugar();
    void addCoffee();
    void addTea();
}
