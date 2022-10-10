package OOP.practice5.builders;

import OOP.practice5.Coffee;
import OOP.practice5.MilkCoffee;

public class MilkCoffeeBuilder extends CoffeeBuilder {
    private String milk;

    public void setMilk(String milk) {
        this.milk = milk;
    }


    public Coffee buildMilkCoffee() {
        System.out.println("added milk"); // какая-то доп инструкция
        return new MilkCoffee(buildCoffee(), milk);
    }
}

// данный класс написан для иллюстрации принципа SOLID L — Liskov Substitution
/*Если П является подтипом Т, то любые объекты типа Т, присутствующие в программе,
могут заменяться объектами типа П без негативных последствий для функциональности программы.
 */
