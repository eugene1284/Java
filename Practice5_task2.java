import java.util.HashMap;
import java.util.Map;

/*

Дана последовательность чисел. 
Необходимо вернуть число совпадающих пар в этой последовательности.
[1,2] - 0
[1,1,2] - 1
[1,1,1] - 3
[1,1,1,2,2] - 4

*/


public class Practice5_task2 {
    public static void main(String[] args) {
        int[] array = new int[] {1,1,1,2,2};
        Map<Integer, Integer> hashmap = new HashMap<>();

        
        int count = 0, temp;

        for (int i : array){
            if (hashmap.containsKey(i)) {
                temp = hashmap.get(i);
                count += temp;
                hashmap.put(i,temp+1);
            } else {
                hashmap.put(i,1);
            }
        }
        System.out.println(count);
    }
}
