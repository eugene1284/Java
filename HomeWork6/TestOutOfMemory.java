package HomeWork6;

import java.util.ArrayList;

public class TestOutOfMemory {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        while (true){
            arrayList.add(new String[1024*64-1]);
        }
    }
}

    /*
        Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
         at HomeWork6.TestOutOfMemory.main(TestOutOfMemory.java:9)
     */
