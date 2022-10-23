package exceptionHandling.practice.second;

/*
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?      //8
Константин=?    //10
Иван=4

Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты с ним знакомы).
В отдельном методе нужно будет пройти по структуре данных

если сохранено значение ?, заменить его на соответствующее число.
Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?.
 */

import java.io.*;
import java.util.HashMap;

public class task3 {
    public static void main(String[] args) throws IOException {
        System.out.println(reader().toString());
        writer(reader());
    }

    public static HashMap<String, String> reader() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("D:\\Programming\\GBDeveloper\\Programmer\\Java\\J\\exceptionHandling\\second\\fileForTask3.txt"));
        String line;
        HashMap<String, String> hashMap = new HashMap<>();
        while ((line = bf.readLine()) != null) {
            String[] tmp = line.split("=");
            //System.out.println("tmp" + Arrays.toString(tmp));
            tmp = answerChecker(tmp);
            hashMap.put(tmp[0], tmp[1]);
        }
        return hashMap;
    }


    public static String[] answerChecker(String[] str) {
        if (str[1].equals("?")) {
            str[1] = Integer.toString(str[0].length());
        } else {
            try {
                Integer.parseInt(str[1]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("встретился символ, отличный от числа или ?");
                str[1] = Integer.toString(str[0].length());
            }
        }
        return str;
    }

    public static void writer(HashMap<String, String> hashMap) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("D:\\Programming\\GBDeveloper\\Programmer\\Java\\J\\exceptionHandling\\second\\fileForTask3_2.txt"));
        for (String key : hashMap.keySet()) {
            //System.out.printf("%s = %s", key, hashMap.get(key));
            bw.write(String.format("%s = %s", key, hashMap.get(key)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
