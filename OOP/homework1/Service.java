package OOP.homework1;

public class Service {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        System.out.println("vm.getProductByName(Twix): " + vm.getProductByName("Twix")); // println - можно назвать контрактом
        System.out.println(vm.getBottleOfTea(1, "bon aqua", 10.0, 20,0.5));

    }
}