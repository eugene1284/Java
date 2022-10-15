package OOP.practice5.builders;

import OOP.practice5.Coffee;
import OOP.practice5.Espresso;

public class EspressoBuilder extends CoffeeBuilder {

    public Coffee buildEspresso(){
        System.out.println("Your little black strong Espresso, please");
        return new Espresso(buildCoffee());
    }
}
