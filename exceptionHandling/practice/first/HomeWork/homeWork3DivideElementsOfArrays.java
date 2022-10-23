package exceptionHandling.practice.first.HomeWork;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и
возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

import java.util.Arrays;

public class homeWork3DivideElementsOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 4};
        int[] arr2 = {1, 2, 3};
        divideElementsOfArrays(arr1, arr2);
    }

    public static int[] divideElementsOfArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("длины массивов не равны, поэлементное вычитание невозможно");
        } else {
            int[] divArr = new int[3];
            for (int i = 0; i < arr1.length; i++) {
                divArr[i] = arr1[i]/arr2[i];
            }
            System.out.println("Результирующий массив: " + Arrays.toString(divArr));
            return divArr;
        }
    }
}
