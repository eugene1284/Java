package OOP.practice5.builders;

import OOP.practice5.Cappucino;
import OOP.practice5.Coffee;
import OOP.practice5.Latte;
import OOP.practice5.MilkFrother;

public class CappucinoCoffeeBuilder extends CoffeeBuilder{
    private String milk;

    public void setMilk(String milk) {this.milk = milk;}

    public Coffee buildCappucino(){
        MilkFrother mf = new MilkFrother();
        System.out.println("Your Cappucino, please");
        return new Cappucino(buildCoffee(), milk);
    }
}


// данный класс написан для иллюстрации принципа SOLID L — Liskov Substitution
/*Если П является подтипом Т, то любые объекты типа Т, присутствующие в программе,
могут заменяться объектами типа П без негативных последствий для функциональности программы.
 */