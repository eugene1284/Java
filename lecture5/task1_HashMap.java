package lecture5;

import java.util.HashMap;
import java.util.Map;

public class task1_HashMap {
    public static void main (String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один"); 
        db.put(2, "два");
        db.put(3, "три");
        //System.out.println("db: " + db);
        // System.out.println("db.get(3): " + db.get(3));
        //System.out.println("db.containsKey(4): " + db.containsKey(4));
        //System.out.println("db.keySet(): " + db.keySet());*/
        Map<Integer, String> map1 = new HashMap<>(); // по умолчанию 16
        Map<Integer, String> map2 = new HashMap<>(9); // 9 элементов - если мы знаем сколько элементов нам нужно
        for (var item : db.entrySet()){ //for each loop
            System.out.printf("[%d: %s]\n",item.getKey(),item.getValue());
        }

        System.out.println(map1);
    }
}
