import java.time.LocalTime;
import java.util.Scanner; // для получения данных из терминала

public class practiсe1 {

    public static void main(String[] args) {
        /////////////// задача 1
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите, пожалуйста, ваше имя: ");
        String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // System.out.println();
        iScanner.close();

        LocalTime lt = LocalTime.now();

        if (lt.getHour() > 5 && lt.getHour() < 12)
            System.out.println("Доброе утро, " + name + "!");
        if (lt.getHour() > 12 && lt.getHour() < 18)
            System.out.println("Добрый день, " + name + "!");
        if (lt.getHour() > 18 && lt.getHour() < 23)
            System.out.println("Добрый вечер, " + name + "!");
        if (lt.getHour() > 23 && lt.getHour() < 5)
            System.out.println("Доброй ночи, " + name + "!");

        ///////// задача 2
        // дан массив чисел, например, [1,1,0,1,1,1], вывести максимальное количество
        // подряд идущих 1.
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        for (int x : arr) { //цикл for each
            if (x == 1) {
                count++;
            } else {
                count = 0;
            }
        }
        System.out.println(count); 

    }
}
