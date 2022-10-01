/*
 * комменты 
 */
// комментарий

import java.util.Scanner; // для получения данных из терминала

public class lecture1_part1 {
    public static void main(String[] args) { // метод main, для нас это точка входа
        System.out.println("bye world");

        String s = " 2";
        System.out.println(s);

        float f1 = 123.45f;
        double f2 = 123.45;
        System.out.println(f1); // 123.45
        System.out.println(f2);

        char ch1 = '1';
        System.out.println(Character.isDigit(ch1)); // true
        char ch2 = 'a';
        System.out.println(Character.isDigit(ch2)); // false

        int a = 13;
        int b = a; // неявное преобразование данных

        boolean flag = true && false;
        System.out.println(flag); // false
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag1); // true
        boolean flag3 = flag1 ^ flag2; // дизъюнкция
        System.out.println(flag1); // false

        var i = 123;
        int i2 = 23_123_344; // просто для видимости разделения разрядов
        System.out.println(i2);
        System.out.println(Integer.MAX_VALUE); // Ingeter - класс обёртка
        // Character.

        String s1 = "qwer";
        s1.length();
        s1.charAt(1); // w

        System.out.println("Приоритетность операций, пре и пост фиксный инкремент");
        int ao = 123;

        System.out.println(ao++); // 123
        System.out.println(ao); // 124

        int ao2 = ao--;
        int ao3 = --ao;
        System.out.println("ao-- = " + ao2);
        System.out.println("--ao = " + ao3);
        int aaa = --ao - ao--;
        System.out.println("--ao-ao-- = " + aaa);

        int t = 100;
        t = t-- - --t;
        System.out.println("t-- - --t = " + t); // t-- - --t = 2

        int p = 100;
        p = --p - p--;
        System.out.println("--p-p-- = " + p); // --p-p-- = 0

        boolean f = 123 > 234;
        System.out.println("boolean f = 123 > 234" + f); // false

        // побитовые сдвиги
        int a4 = 8;
        // 1000
        System.out.println(a << 1); // 16 // 10000

        int a5 = 18;
        // 10010
        System.out.println(a >> 1); // 9 // 1001

        // побитовое сравнение
        int a10 = 5;
        int b10 = 2;
        System.out.println(a10 | b10); // a10 | b10 = 7
        // 101 //5
        // 010 //2
        // 111 // побитово сравниваем 0 или 1 это 1

        System.out.println(a10 & b10); // a10 & b10 = 0
        // 101 //5
        // 010 //2
        // 000 // побитово сравниваем 0 и 1 это 0

        ///////// массивы/////
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        System.out.println(arr[3]); // 0, так как значение по умолчанию

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5

        int[] arr2; // определили массив без инициализации
        int brr[]; // так же можно определить массив

        //// многомерные массивы
        System.out.println("многомерные массивы");
        int[] arr3[] = new int[3][5];
        for (int[] line : arr3) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        //////// массивы массивов\\\\\\
        System.out.println("массивы массивов");
        int[][] arr4 = new int[3][5];
        for (int i4 = 0; i4 < arr4.length; i4++) {
            for (int j = 0; j < arr4[i4].length; j++) {
                System.out.printf("%d ", arr4[i4][j]);
            }
            System.out.println();
        }

        ///// получаем данные из терминала\\\\
        /// строки
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        System.out.println();
        // iScanner.close();

        /// примитивы
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();
        System.out.println();

        /// Проверка на соответствие получаемого типа
        System.out.printf("int a: ");
        boolean flag5 = iScanner.hasNextInt();
        System.out.println(flag5);
        int i5 = iScanner.nextInt();
        System.out.println(i5);
        iScanner.close();

        /// Форматированный вывод
        String s6 = "qwe";
        int a6 = 123;
        String q6 = s6 + a6;
        System.out.println(q6); // qwe123
        /*
         * вопрос сколько строк мы получаем, ответ 4
         * 1. строка s
         * 2. строка под неявное преобразование а6 в стринг (оно где-то будет в памяти)
         * 3. строка s6 + a6 (тоже где-то будет в памяти)
         * 4. строка q
         * 
         * это очень плохой вариант, необходимо использовать string builder
         * если в коде такая штука используется, то это надо переписывать 100%%!!!!!
         * 
         */

        int a7 = 1, b7 = 2;
        int c7 = a7 + b7;
        String res7 = a7 + " + " + b7 + " = " + c7;
        System.out.println(res7);

        /////////////////
        a = 1;
        b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00

        //// Функции и Методы\\\\\\
        sayHi();
        /*prog_lib.sayHiFromLib();
        int libSum = prog_lib.sum(1, 3); // 4
        var libFactor = prog_lib.factor(5); // 120.0
        System.out.println(libSum); 
        System.out.println(libFactor);*/

        ///// Управляющие конструкции\\\\\\\
        /// условный оператор
        a = 1;
        b = 2;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }

        //упрощённый вариант записи условных операторов
        if (a > b) c = a;
        if (b > a) c = b;
        System.out.println(c);

        ///тернарный оператор
        System.out.println("ternar oper: ");
        a = 1;
        b = 2;
        int min = a < b ? a : b; // если а < б, то выведется а (то что до двоеточия)
        System.out.println(min);

    }

    static void sayHi() {
        System.out.println("hi");
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
