package OOP.practice5;

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

// данный класс написан для иллюстрации принципа третьего принципа SOLID
