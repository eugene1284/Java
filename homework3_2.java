import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа
 */

public class homework3_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("лист до обработки: " + list);

        list.removeIf(i -> i % 2 == 0);
        System.out.println("лист после удаления чётных чисел: " + list);
    }

}
