import java.util.ArrayList;
import java.util.List;

/*
Задание 4
Каталог товаров книжного магазина сохранён в виде двумерного списка List<ArrayList<String>>

проза           поэзия          док
Война и Мир     Бородино
12 стульев

*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice3_4 {
    public static void main(String[] args) {
        List<List<String>> listBk = new ArrayList<>();
        listBk.add(addBooks("Novel", Arrays.asList("War'n'Peace", "12 chairs")));
        listBk.add(addBooks("Poetry", Arrays.asList("Borodino")));
        listBk.add(addBooks("Documentary", Arrays.asList()));
        for (int i = 0; i < listBk.size(); i++) {
            for (int j = 0; j < listBk.get(i).toArray().length; j++) {
                System.out.printf("%15s", listBk.get(j).get(i));
            }
            System.out.println();
        }
    }

    public static List<String> addBooks(String genre, List<String> names) {
        List<String> listBk = new ArrayList<>();
        listBk.add(genre);
        listBk.addAll(names);
        return listBk;
    }
}