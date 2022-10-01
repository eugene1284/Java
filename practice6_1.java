import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
 */

public class practice6_1 {
    public static void main(String[] args) {

        // 1.
        HashSet<Integer> a1 = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 8, 5, 6, 3));
        System.out.println("HashSet<Integer> a1: " + a1);

        // 2.
        LinkedHashSet<Integer> a2 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 7, 4, 5, 6, 3));
        System.out.println("LinkedHashSet<Integer> a2: " + a2);

        // 3.
        Set<Integer> a3 = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 6, 5, 3));
        System.out.println("Set<Integer> a3: " + a3);

        /*
         * Напишите метод, который заполнит массив из 100 элементов случайными цифрами
         * от 0 до 24.
         * Создайте метод, в который передайте заполненный выше массив и с помощью Set
         * вычислите процент уникальных значений в данном массиве и верните его в виде
         * числа с плавающей запятой.
         * Для вычисления процента используйте формулу:
         * процент уникальных чисел = количество уникальных чисел * 100 / общее
         * количество чисел в массиве.
         */

        Integer[] a = ar(10);
        System.out.println(a);
        System.out.println(getus(a));
    }

    private static Integer[] ar(int a) {
        Random rn = new Random();
        Integer[] arr = new Integer[a];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = rn.nextInt(20);
        }
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        return arr;
    }

    private static int getus(Integer[] arr) {
        Set<Integer> in = new TreeSet<>(Arrays.asList(arr));
        System.out.println(in);
        int a = in.size() * 100 / arr.length;
        return a;
    }


    
}