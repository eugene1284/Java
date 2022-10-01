import java.util.HashMap;
import java.util.Map;

/*
Дана последовательность чисел.
Необходимо вернуть сумму уникальных чисел.
1) In: arr = [3,2,2]
    out: 3
 */

public class Practice5_task1 {
    public static void main(String[] args) {
        int[] array = new int[] {5,4,4,3,2,2};
        Map<Integer, Integer> dic = new HashMap<>();
        
        for (Integer i : array) {
            if (dic.containsKey(i)) {
                dic.put(i, dic.get(i) + 1);
                System.out.println(dic.put(i, dic.get(i) + 1));
            } else {
                dic.put(i, 1);
            }
        }

        int sum = 0;
        for (int i : dic.keySet()) {
            if (dic.get(i) == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
