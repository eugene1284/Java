package exceptionHandling.practice.second;

import java.util.Arrays;
import java.util.Scanner;

public class task1Write {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            if (index < arr.length && index >= 0)
                arr[index] = 1;
        } else {
            System.out.println("Некорректный ввод");
        }
        System.out.println(Arrays.toString(arr));
    }
}
