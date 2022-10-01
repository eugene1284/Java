import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class lecture1_part2 {
    public static void main(String[] args) {

        /// оператор выбора\\\
        int a = 123;
        switch (a) {
            case 1:
                System.out.println("case 1");
                break;
            case 123:
                System.out.println("case 123"); // выведется "case 123" так как а = 123
                break;
        }

        ////// циклы\\\\\\\
        // цикл while
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println("while: " + count);

        /// цикл do while (цикл с постусловием)
        value = 321;
        count = 0;

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println("do while: " + count);

        //// цикл for i и оператор contunue
        System.out.printf("for i || continue: ");
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // остаток от деления на 2, то есть чётное
                continue;
            }
            System.out.print(i); /// 012346789
        }
        System.out.println();

        //// цикл for i и оператор break
        System.out.printf("for i || break: ");
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // остаток от деления на 2, то есть чётное
                break;
            }
            System.out.print(i); /// 01234
        }
        System.out.println();

        //// цикл for i
        System.out.printf("for i: s = ");
        int s = 0;
        for (int i = 0; i <= 3; i++) {
            s += i;
        }
        System.out.print(s);
        System.out.println();

        /// вложенный цикл
        System.out.println("for i (for j): ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /// for : (только для коллекций!!!)
        System.out.println("for i:  ");
        int[] arr = new int[] { 1, 2, 3, 4, 5, 77 };
        for (int item : arr) {
            System.out.print(item);
        }
        System.out.println();

        /// цикл, в котором мы говорим, что item = 13, но эти 13 не записываются в
        /// массив arr!!
        for (int item : arr) {
            item = 13;
            System.out.print(item);
        }

        /////////////////// Работа с файлами
        /// Создание и запись\ дозапись
        try (FileWriter fw = new FileWriter("file_lecture1_part2.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void work_with_file(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file_lecture1_part2.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
