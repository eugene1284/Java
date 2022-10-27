package OOP.homeWork5.src.model.common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanKbdSvc {


    public int scanNum() {
        boolean flag;
        int num = 0;
        do {
            flag = false;
            try {
                num = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Only integer numbers allowed.");
                flag = true;
            }
        } while (flag);

        return num;
    }

    public String scanLine() {
        boolean flag;
        String lineIn = null;
        do {
            flag = false;
            try {
                lineIn = new Scanner(System.in).nextLine();
            } catch (InputMismatchException e) {
                System.out.println("INTERNAL ERROR.");
                flag = true;
            }
        } while (flag);

        return lineIn;
    }
}
