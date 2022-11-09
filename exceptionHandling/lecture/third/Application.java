package exceptionHandling.lecture.third;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Application {
    public static void main(String args[]) {
        try (FileReader test = new FileReader("exceptionHandling/lecture/third/file.txt")) {
            test.read();
        } catch(RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
    }
}



