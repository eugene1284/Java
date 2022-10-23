package exceptionHandling.practice.first;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */

public class task2 {
    public static void main(String[] args) {
        int[][] array = {{0, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};


        if (!checkArraySquare(array)) {
            throw new RuntimeException("Массив не является квадратным");
        }

        if (!checkElementArrayBinary(array)) {
            throw new RuntimeException("Элементы массива не являются 0 и 1");
        }

        System.out.println("Сумма элементов массива: " + sumElementsArray(array));

    }


    private static boolean checkArraySquare(int[][] array) {
        for (int[] i : array) {
            if (array.length != i.length) return false;
        }
        return true;
    }

    private static boolean checkElementArrayBinary(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                if (j != 1 && j != 0) return false;
            }
        }
        return true;
    }

    private static int sumElementsArray(int[][] array) {
        int sum = 0;
        for (int[] i : array) {
            for (int j : i) {
                sum += j;
            }
        }
        return sum;
    }
}
