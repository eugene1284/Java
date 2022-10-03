package OOP.homework1;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();
        System.out.println("Добрый день, вас приветствует вендинговый аппарат. \n" +
                "У нас в наличии следующие продукты: \n" +
                vm.products);
        System.out.println("Введите позицию товара, которую вы желаете получить:");
        String userAnswerPosition = in.next();
        System.out.println(vm.getProductByPosition(userAnswerPosition));
        //System.out.println("vm.getProductByName(Twix): " + vm.getProductByName("Twix")); // println - можно назвать контрактом
        //System.out.println(vm.getBottleOfTea(1, "bon aqua", 10.0, 20,0.5, Type.BOTTLEOFTEA));

    }
}