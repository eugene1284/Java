// изучаем шаблон builder - создать сложный объект с помощью изменяющихся инструкций
//

//

package OOP.practice5.builders;

// builder - паттерн разработки, когда мы делегируем отдельному классу сложный набор инструкций
// (он может изменяться)

import OOP.practice5.Coffee;

public class CoffeeBuilder {

    private Coffee coffee;
    private String water;
    private String sugar;
    private String typeOfCoffee;



// тут должен быть набор инструкций

    //boilingWater(distilWater);


    public void boilingWater() {
        System.out.println("Вода вскипятилась");
    }

    public Coffee buildCoffee() {
        // возьми чашку
        // залей воду
        // перемешай
        // кофе готов
        return new Coffee(typeOfCoffee, sugar, water);
    }


    public void setCoffee(String typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }


}
