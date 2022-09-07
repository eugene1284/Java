
/*
Задание 2
Напишите программу, которая считает, распарсит и выведет в логгер заранее созданный файл с именами, 
предметами и оценками студентов

Формат строк в файле:
Андрей 5
Алена 5
Игорь 4

Формат вывода: Ученик %s получил сегодня %d.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.Character.isDigit;

public class homework2_task2 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("homework2_task2_input.txt"))) {
            String s;
            String s2 = "";
            char[] s1;
            int grade = 0;
            while ((s = br.readLine()) != null) {
                s1 = s.toCharArray();
                for (char i : s1) {
                    if (isDigit(i)) {
                        grade = Character.digit(i, 10);
                    } else if (!isDigit(i) && i != ' ') {
                        s2 += i;
                    }
                }
                System.out.printf("Ученик %s получил сегодня %d.\n", s2, grade);
                s2 = "";
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
    }
}
}
