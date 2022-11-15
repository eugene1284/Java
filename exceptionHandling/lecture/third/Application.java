package exceptionHandling.lecture.third;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Application {
    public static void main(String args[]) {
        try (FileReader reader = new FileReader("exceptionHandling/lecture/third/testRead.txt")) {
            FileWriter writer = new FileWriter("exceptionHandling/lecture/third/testWrite.txt");
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Copy succesfully");
    }
}



