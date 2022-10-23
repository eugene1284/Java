package exceptionHandling.practice.first;

public class task0 {
    public static void main(String[] args) {
        int[] array = {1, 6, 4, 8, 9, 10, 95};
        System.out.println(getArrayLength(array));

    }

    private static int getArrayLength(int[] array) {
        int min = 10;
        if (array.length < min) {
            return -1;
        }
        return array.length;
    }
}
