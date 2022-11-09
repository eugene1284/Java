package exceptionHandling.practice.third;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class task2Counter implements AutoCloseable {


    Integer number = 0;
    Boolean isOpen;

    public task2Counter()  {
        isOpen = true;
    }


    public void add(){
        if (isOpen == false) {
            throw new RuntimeException();
        }
        this.number++;
    }

    @Override
    public void close() throws Exception {
        // закрыть
        isOpen = false;
    }
}
