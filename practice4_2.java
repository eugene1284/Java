import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*
Даны два deque представляющие два неотрицательных числа.
Цифры хранятся в обратном порядке, и каждый из них содержит одну цифру.
Сложите два числа и верните сумму в виде связанного списка

пример1 d1 = [321], d2 = [645], вывод [966]             // 123 + 546 = 669
пример2 d1 = [1,1,1,1], d2 = [9,9], вывод [0,1,2,1]     // 1111 + 99 = 1210

 */

public class practice4_2 {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new LinkedList<>();
        deque1.add(3);
        deque1.add(2);
        deque1.add(1);

        Deque<Integer> deque2 = new LinkedList<>(Arrays.asList(6, 4, 5));
        Deque<Integer> deque3 = new LinkedList<>(Arrays.asList(1, 1, 1, 1));
        Deque<Integer> deque4 = new LinkedList<>(Arrays.asList(9, 9));

        Deque<Integer> deque_sum = new LinkedList<>();
        deque_sum.addFirst(deque1.getFirst() + deque2.getFirst());
        System.out.println("deque_sum: " + deque_sum);

        deq_sum(deque1, deque2);
        // deq_sum(deque3, deque4);
    }

    public static void deq_sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> d_sum = new LinkedList<>();
        while (d1.size() >= 1 || d2.size() >= 1) {
            d_sum.addLast(d1.pollFirst() + d2.pollFirst());
        }
        System.out.println(d_sum);

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addAll(Arrays.asList(1, 1, 1, 1));
        Deque<Integer> ll2 = new LinkedList<>();
        ll2.addAll(Arrays.asList(9, 9));
        Deque<Integer> result = new LinkedList<>();

        int temp, ten = 0;
        while (ll1.peek() != null || ll2.peek() != null) {
            temp = 0;

            if (ll1.peek() != null) temp = ll1.poll();
            if (ll2.peek() != null) temp = temp + ll2.poll();

            temp += ten;
            ten = 0;

            if (temp >= 10) {
                ten = 1;
                temp = temp - 10;
            }

            result.add(temp);
        }

        if (ten != 0) result.add(ten);

        System.out.println("result: " + result);
    }
}
