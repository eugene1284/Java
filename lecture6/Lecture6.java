package lecture6;

public class Lecture6 {
    public static void main(String[] args) {
        /*Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(123);
        set.add(1234);
        set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        for (var item : set)
            System.out.println(item); // null 1 1234 123
        set.clear();
        System.out.println(set); // []*/

        Worker w1 = new Worker(); // конструктор
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия4";
        w4.salary = 400;
        w4.id = 1000;

        System.out.println(w4);
        System.out.println(w1==w4);
        System.out.println("w1.equals(w4): " + w1.equals(w4));
    }
}