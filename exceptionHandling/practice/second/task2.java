/*
Обработайте возможные исключительные ситуации.
“Битые” значения в исходном массиве считайте нулями.
Можно внести в код правки, которые считаете необходимыми.
 */

package exceptionHandling.practice.second;

public class task2 {
    public static void main(String[] args) {
        String[][] str2d = {{"1", "2", "here"},
                {"1", "0", "1"},
                {"1", "1", "1"}};
        Integer sum = sum2d(str2d);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.printf("Элемент [%d:%d] битый%n", i, j);
                    val = 0;
                }
                sum += val;
            }
        }
        return sum;
    }
}