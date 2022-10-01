package OOP.practice1;

public class Service {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        System.out.println("vm.getProductByName(Twix): " + vm.getProductByName("Twix")); // println - можно назвать контрактом
        System.out.println(vm.getBottleOfTea("bon aqua", 10.0, 0.5));

    }
}