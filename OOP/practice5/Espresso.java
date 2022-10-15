package OOP.practice5;

public class Espresso extends Coffee{

    public Espresso(String coffee, String sugar, String water) {
        super(coffee, sugar, water);
    }

    public Espresso(Coffee coffee){
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
    }
}
