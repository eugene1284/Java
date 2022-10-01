// Поэтому в отличие от коллекции HashMap в TreeMap все объекты автоматически сортируются по возрастанию их ключей.

package lecture5;

import java.util.Map;
import java.util.TreeMap;

public class task2_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> states = new TreeMap<>();
        states.put(10, "Germany");
        states.put(2, "Spain");

        String first = states.get(2);
        //System.out.println("first = states.get(2): " + first);
        
        // перебор элементов
       for(Map.Entry<Integer, String> item : states.entrySet()){
         
        System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
    }
    }
}
