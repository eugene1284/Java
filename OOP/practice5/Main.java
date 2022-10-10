package OOP.practice5;

public class Main {
    public static void main(String[] args) {

        /*StringBuilder sb = new StringBuilder();
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

    }
}

