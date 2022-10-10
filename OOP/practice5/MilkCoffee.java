package OOP.practice5;

public class MilkCoffee extends Coffee{
    private String milk;

    public MilkCoffee(String coffee, String sugar, String water, String milk) {
        super(coffee, sugar, water);
        this.milk = milk;
    }

    public MilkCoffee(Coffee coffee, String milk){
        super(coffee.getCoffee(), coffee.getSugar(),coffee.getWater());
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Tasty MilkCoffee";
    }
}
