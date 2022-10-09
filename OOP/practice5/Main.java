package OOP.practice5;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("setCoffee(\"Растворимый кофе\"), ");
        sb.append("setWater(\"1 литр\"), ");
        sb.append("setWater(\"1 литр\")");

        /*CoffeeBuilder cb = new CoffeeBuilder();
        cb.setCoffee("Растворимый кофе");
        cb.setWater("1 литр");
        cb.setSugar("1 ложка");

        cb.boilingWater();

        Coffee c = cb.buildCoffee();*/

        System.out.println(sb.toString());

    }
}
