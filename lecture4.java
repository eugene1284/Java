import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class lecture4 {
    public static void main(String[] args) {
        // 1. Ссылочный лист
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        // 2. Queue (first in, first out)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("queue: " + queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println("queue after remove: " + queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(queue); // [2809]

        Queue<Integer> queue2 = new LinkedList<Integer>();
        queue2.add(1);
        int item2 = queue2.remove();
        queue2.offer(2809);
        item = queue2.poll();
        System.out.println("queue2: " + queue2);

        // 3. PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println("PriorityQueue<Integer> pq: " + pq); // [1, 2, 3, 4]
        System.out.println("pq.poll(): " + pq.poll()); // удалили первый элемент
        System.out.println(pq); //[3, 123, 13]

        // 4. Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);   deque.addLast(2);
        deque.removeLast();  deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst();   deque.pollLast();
        deque.getFirst();    deque.getLast();
        deque.peekFirst();   deque.peekLast();
 
        // 5. Stack
    }
}
