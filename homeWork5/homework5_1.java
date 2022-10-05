package homeWork5;/*
Задание 1
Дана строка. Необходимо написать метод, 
который отсортирует слова в строке по длине с помощью TreeMap.
слова с одинаковой длиной не должны “потеряться”.

Пример:
“Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись”

Результат:
[и], [ты], [Еще], [день, друг, Пора], [Мороз], [солнце], [чудесный, дремлешь, проснись], [красавица], [прелестный]

*/

/* тут нужно использовать 
treemap<Integer, ArrayList<String>> 
ключ - количество букв
значение - слова с одинаковым количеством букв
*/

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class homework5_1 {
    public static void main(String[] args) {
        Logger lg = Logger.getLogger(homework5_1.class.getName());
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        try {
            lg.log(Level.INFO, sort(s).values().toString());
        } catch (Exception ex) {
            lg.log(Level.WARNING, ex.getMessage());
        }
    }

    public static TreeMap<Integer, String> sort(String str) {
        ArrayList<String> s1 = new ArrayList<>(List.of(str.split(" ")));
        ArrayList<String> s2 = new ArrayList<>();
        TreeMap<Integer, String> tm = new TreeMap<>();
        while (s1.size() != 0) {
            int size = s1.get(0).length();
            for (int i = 0; i < s1.size(); i++) {
                if (s1.get(i).length() == size) {
                    s2.add(s1.get(i));
                    s1.remove(i);
                }
            }
            tm.put(s2.get(0).length(), s2.toString());
            s2.clear();
        }
        return tm;
    }
}
