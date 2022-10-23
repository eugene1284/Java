package exceptionHandling.practice.second.homeWork;

/* Необходимо исправить следующий код
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */

public class hw2 {
    public static void main(String[] args) {
        int[] intArray = new int[8];

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Необходимо добавить ещё один оператор catch на тот случай, если массив будет проинициализирован количеством элементов меньше 9
            System.out.println("Catching exception: " + ex);
        }


    }
}
