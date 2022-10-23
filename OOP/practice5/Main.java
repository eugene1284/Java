package OOP.practice5;

import OOP.practice5.builders.*;

public class Main {
    public static void main(String[] args) {

        /*
        пример билдера
        StringBuilder sb = new StringBuilder();
        sb.append("setCoffee(\"Растворимый кофе\"), ");
        sb.append("setWater(\"1 литр\"), ");
        sb.append("setWater(\"1 литр\")");*/


        CoffeeBuilder cb = new MilkCoffeeBuilder();
        cb.setCoffee("Растворимый кофе");
        cb.setWater("1 литр");
        cb.setSugar("1 ложка");
        cb.boilingWater();
        ((MilkCoffeeBuilder) cb).setMilk("100ml milk"); // "скастовать" // уточнили, что хотим использовать логику наследника  // приведение типов
        //Coffee c = cb.buildCoffee();
        Coffee c = (((MilkCoffeeBuilder) cb).buildMilkCoffee()); // тут произошёл апкаст  // приведение типов
        //System.out.println(sb.toString());
        System.out.println(c);

        System.out.println("-----------------------");

        LatteCoffeeBuilder lb = new LatteCoffeeBuilder();
        lb.buildLatte(); // Your Latte, please

        System.out.println("-----------------------");

        CappucinoCoffeeBuilder ccb = new CappucinoCoffeeBuilder();
        ccb.buildCappucino(); // Your Cappucino, please

        System.out.println("-----------------------");

        EspressoBuilder eb = new EspressoBuilder();
        eb.buildEspresso(); // Your little black strong Espresso, please


    }
}

