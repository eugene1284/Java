package exceptionHandling.practice.first.HomeWork;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

import java.util.Arrays;

public class homeWork2ArraysDifference {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 4};
        int[] arr2 = {1, 2, 3};
        differenceArrays(arr1, arr2);
    }

    public static int[] differenceArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("длины массивов не равны, поэлементное вычитание невозможно");
            return arr1;
        } else {
            int[] difArr = new int[3];
            for (int i = 0; i < arr1.length; i++) {
                difArr[i] = arr1[i] - arr2[i];
            }
            System.out.println("Результирующий массив: " + Arrays.toString(difArr));
            return difArr;
        }
    }
}
