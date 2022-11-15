package exceptionHandling.practice.third;

/*
Создайте метод doSomething(),
который может быть источником одного из типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class task1 {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    public static void doSomething() throws FileNotFoundException {
        FileReader fr = new FileReader("exceptionHandling/practice/third/testRead.txt");
        //fr.read(); // IOException
    }
}
