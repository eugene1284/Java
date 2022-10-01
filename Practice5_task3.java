import java.util.HashMap;

/*
Задание 3
Вам дан массив путей, где пути[i] = ["Город А", "Город Б"] означает, что существует прямой путь, идущий от Город А до Город Б.
Верните город назначения, то есть город без какого-либо пути

[Москва, Самара],[Курск, Пенза],[Самара, Курск] === Пенза


Москва, Самара
===Самаре
*/
public class Practice5_task3 {
    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("Москва", "Самара");
        hashmap.put("Курск", "Пенза");
        hashmap.put("Самара", "Курск");

        for (String i : hashmap.values()) {
            if (!(hashmap.containsKey(i))) {
                System.out.println(i);
            }
        }
    }
}
