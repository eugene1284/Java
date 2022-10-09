// изучаем шаблон builder - создать сложный объект с помощью изменяющихся инструкций
//

//

package OOP.practice5;

public class CoffeeBuilder {

    Object coffee;
    Object sugar;
    Object water;

    public Object getCoffee() {
        return coffee;
    }

    public void setCoffee(Object coffee) {
        this.coffee = coffee;
    }

    public Object getSugar() {
        return sugar;
    }

    public void setSugar(Object sugar) {
        this.sugar = sugar;
    }

    public Object getWater() {
        return water;
    }

    public void setWater(Object water) {
        this.water = water;
    }

    // тут должен быть набор инструкций

    //boilingWater(distilWater);


    public void boilingWater(){
    }

    public Coffee buildCoffee() {
        // возьми чашку
        // залей воду
        // перемешай
        // кофе готов
       return null;
    }


}
