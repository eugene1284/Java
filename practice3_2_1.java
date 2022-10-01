/*
Задание 2.1.
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice3_2_1 {
    public static void main(String[] args) {
        String[] s = { "B", "C", "A", "B", "C", "A" };
        Arrays.sort(s, Comparator.naturalOrder());
        System.out.println(Arrays.toString(s)); // [A, A, B, B, C, C]

        List<String> list = new ArrayList<>();
        list.add("Mercure");
        list.add("Earth");
        list.add("Earth");
        list.add("Earth");
        list.add("Earth");
        list.add("Earth");
        list.add("Mars");
        list.add("Saturn");

        Map<String, Long> fr = list.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println("fr " + fr);

        int count;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))) {
                    count++;
                }
            }
            System.out.println(list.get(i) + " " + ++count);
        }

    }
}
