package OOP.practice5;

public class Cappucino extends Coffee{
    private String milk;
    public Cappucino(String coffee, String sugar, String water) {
        super(coffee, sugar, water);
    }

    public Cappucino(Coffee coffee, String milk) {
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
        this.milk = milk;
    }
}
