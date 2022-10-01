import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
Дан deque из последовательности цифр. Необходимо определить является ли она палиндромом.

deque1 = [0]        true
deque2 = [1,2,1]    true
deque3 = [1,2,1,2]  false
 */

public class practice4_1 {
    public static void main(String[] args) {

        Deque<Integer> deque1 = new LinkedList<>();
        deque1.add(0);

        Deque<Integer> deque2 = new LinkedList<>();
        deque2.add(1);
        deque2.add(2);
        deque2.add(1);

        Deque<Integer> deque3 = new LinkedList<>();
        deque3.add(1);
        deque3.add(2);
        deque3.add(1);
        deque3.add(2);

        System.out.println("isPalindrome(deque1): " + isPalindrome(deque1));
        System.out.println("isPalindrome(deque2): " + isPalindrome(deque2));
        System.out.println("isPalindrome(deque3): " + isPalindrome(deque3));

    }

    public static boolean isPalindrome(Deque<Integer> d) {
        while (d.size() > 1) {
            if (d.peekFirst() == d.peekLast()) {
                d.pollFirst();
                d.pollLast();
            } else {
                return false;
            }
        }
        return true;
    }
}