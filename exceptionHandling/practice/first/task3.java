package exceptionHandling.practice.first;

/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

 */
public class task3 {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 1, null, 1, null};
        checkArray(array);
    }

    private static void checkArray(Integer[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Элемент массива " + i + " - нулевой");
                count++;
            }
        }
        System.out.println("Количество нулевых элементов массива: " + count);
    }
}

// nullPointerException
