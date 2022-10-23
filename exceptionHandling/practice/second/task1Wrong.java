package exceptionHandling.practice.second;

import java.util.Scanner;

public class task1Wrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt();
        try {
            arr[index] = 1;
        } catch (Exception e) {
            System.out.println("Указан индекс за пределами массива");
        }
    }
}
