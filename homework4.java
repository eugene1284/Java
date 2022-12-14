import java.util.Scanner;

/*
1) Реализуйте сущность “Deque” с помощью массива Integer, массив ограничен в размере size <=5 . Нужно реализовать методы

boolean offerFirst(Integer element); //добавляет элемент element в самое начало массива. Если элемент удачно добавлен, возвращает true, иначе - false
boolean offerLast(Integer element); //добавляет элемент element в конец массива. Если элемент удачно добавлен, возвращает true, иначе - false
Integer peekFirst(); //возвращает без удаления элемент из начала массива. Если массив пуст, возвращает значение null
Integer peekLast(); //возвращает без удаления последний элемент массива. Если массив пуст, возвращает значение null
Integer pollFirst(); //возвращает с удалением элемент из начала массива. Если массив пуст, возвращает значение null
Integer pollLast(); //возвращает с удалением последний элемент массива. Если массив пуст, возвращает значение null

 */

public class homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[] { 1, 2, 3, 4 };
        System.out.print("Массив arr до обработки: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        System.out.println("Введите элемент: ");
        int element = scan.nextInt();
        System.out.println(offerFirst(arr, element));
        System.out.println(offerLast(arr, element));
        System.out.println("peekFirst(arr): " + peekFirst(arr));
        System.out.println("peekLast(arr): " + peekLast(arr));
        System.out.println("pollFirst(arr): " + pollFirst(arr));
        System.out.println("pollLast(arr): " + pollLast(arr));
    }

    public static boolean offerFirst(int[] a, int el) {
        System.out.println("Введите элемент: ");

        int[] a2 = new int[a.length + 1];
        if (a2.length > 5) {
            return false;
        }
        a2[0] = el;
        System.arraycopy(a, 0, a2, 1, a.length);
        System.out.print("Массив после offerFirst: ");
        for (int i = 0; i < a2.length; i++) {
            System.out.printf("%d ", a2[i]);
        }
        System.out.println();
        return true;
    }

    public static boolean offerLast(int[] a, int el) {
        int[] a2 = new int[a.length + 1];
        if (a2.length > 5) {
            return false;
        }
        a2[a2.length - 1] = el;
        System.arraycopy(a, 0, a2, 0, a.length);
        System.out.print("Массив после offerLast: ");
        for (int i = 0; i < a2.length; i++) {
            System.out.printf("%d ", a2[i]);
        }
        System.out.println();
        return true;
    }


    public static Integer peekFirst(int[] a) { //Integer peekFirst(); //возвращает без удаления элемент из начала массива. Если массив пуст, возвращает значение null
        if (a.length > 0 & a.length <= 5) {
            return a[0];
        } else if (a.length > 5) {
            return null;
        } else {
            return null;
        }
    }

    public static Integer peekLast(int[] a) { //Integer peekLast(); //возвращает без удаления последний элемент массива. Если массив пуст, возвращает значение null
        if (a.length > 0 & a.length <= 5) {
            return a[a.length - 1];
        } else if (a.length > 5) {
            return null;
        } else {
            return null;
        }
    }

    public static Integer pollFirst(int[] a) { //Integer pollFirst(); //возвращает с удалением элемент из начала массива. Если массив пуст, возвращает значение null
        if (a.length > 0 & a.length <= 5) {
            int[] a2 = new int[a.length - 1];
            System.arraycopy(a, 1, a2, 0, a2.length);
            return a[0];
        } else if (a.length > 5) {
            return null;
        } else {
            return null;
        }
    }

    public static Integer pollLast(int[] a) { //Integer pollLast(); //возвращает с удалением последний элемент массива. Если массив пуст, возвращает значение null
        if (a.length > 0 & a.length <= 5) {
            int[] a2 = new int[a.length - 1];
            System.arraycopy(a, 0, a2, 0, a2.length);
            return a[a.length - 1];
        } else if (a.length > 5) {
            return null;
        } else {
            return null;
        }
}
}