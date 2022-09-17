/*
Задан целочисленный список ArrayList. Найти 
1. минимальное, 
2. максимальное, 
3. среднее из этого списка (просуммировать все элементы и поделить / среднеарифметическое).
*/

import java.util.ArrayList;
import java.util.List;

public class homework3_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println("лист: " + list);

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;

        for (Integer i : list) {
            sum += i;
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        double avg = (double) sum / (double) list.size();

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее арифметическое заданного списка: " + avg);

        System.out.printf("Минимальное число = %d, Максимальное = %d, Среднее арифметическое = %.1f", min, max,avg);
    }

}
