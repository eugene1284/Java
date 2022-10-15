package OOP.practice5;

public class Latte extends Coffee{

    private String milk;
    public Latte(String coffee, String sugar, String water, String milk) {
        super(coffee, sugar, water);
        this.milk = milk;
    }

    public Latte(Coffee coffee, String milk){
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
        this.milk = milk;
    }


}
