package OOP.practice5.builders;

import OOP.practice5.Coffee;
import OOP.practice5.Latte;
import OOP.practice5.MilkFrother;

public class LatteCoffeeBuilder extends CoffeeBuilder{
    private String milk;

    public void setMilk(String milk) {this.milk = milk;}

    public Coffee buildLatte(){
        MilkFrother mf = new MilkFrother();
        System.out.println("Your Latte, please");
        return new Latte(buildCoffee(), milk);
    }
}


// данный класс написан для иллюстрации принципа SOLID L — Liskov Substitution
/*Если П является подтипом Т, то любые объекты типа Т, присутствующие в программе,
могут заменяться объектами типа П без негативных последствий для функциональности программы.
 */