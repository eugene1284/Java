package exceptionHandling.practice.first.HomeWork;

/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */


public class homeWork1SomeTypeException {
    public static void main(String[] args) {
        // 1. Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(divide(10,0));


        // 2. Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 0 out of bounds for length 0
        String[] arr= {};
        array(arr);

        // 3. Exception in thread "main" java.lang.NumberFormatException: For input string: "gfd"
        System.out.println(numbers(100));

    }

    public static int divide(int a1, int a2){
        return a1/a2;
    }

    public static String array(String[] array){
        System.out.println(array);
        return array[0];
    }

    public static int[] numbers(int number){
        int[] numbers = new int[3];
        numbers[0]=number;
        numbers[1]=Integer.parseInt("gfd");
        return numbers;
    }
}
