
/*
Задание 1
Напишите программу, записывающую 100 раз слово ”ТЕST” в файл. 
Слова должны чередоваться по формату – четная итерация большими буквами, 
нечетные – маленькимиПример: TESTtestTESTtestTEST…
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class homework2_task1 {
    public static void main(String[] args) {

        String str1 = "TEST";
        String str2 = "test";
        try (FileWriter fw = new FileWriter("file_homework2_task1.txt", false)) {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0)
                    fw.append(str1);
                if (i % 2 != 0)
                    fw.append(str2);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}