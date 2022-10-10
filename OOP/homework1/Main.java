package OOP.homework1;

public class Main {



    public static void main(String[] args) {
        String name = "Twix";
        Double cost = 20.0;
        Controller cnt = new Controller();
        System.out.println(cnt.getProductsByNameAndCost(name, cost));
    }
}
