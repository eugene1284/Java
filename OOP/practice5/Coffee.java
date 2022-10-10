package OOP.practice5;

public class Coffee {
    String coffee;
    String sugar;
    String water;

    public Coffee(String coffee, String sugar, String water) {
        this.coffee = coffee;
        this.sugar = sugar;
        this.water = water;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "вкусный кофе";
    }
}
