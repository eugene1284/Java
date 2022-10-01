import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lecture3 {
    public static void main(String[] args) {

        // 1
        Object o = 1;
        GetType(o); // java.lang.Integer
        o = 1.2;
        GetType(o); // java.lang.Double

        // 2
        System.out.println("Sum(1, 2) = " + Sum(1, 2));
        System.out.println("Sum(1.0, 2) = " + Sum(1.0, 2));
        System.out.println("Sum(1, 2.0) = " + Sum(1, 2.0));

        // 3. Массивы. Как увеличить размер массива?
        System.out.println("");
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);

        System.out.printf("выводим элементы массива a: ");
        for (int i : a) {
            System.out.printf("%d ", i);
        } // 1 9
        System.out.println("");
        System.out.printf("выводим элементы массива b: ");
        for (int i : b) {
            System.out.printf("%d ", i);
        } // 1 9 0

        System.out.println("");
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        System.out.printf("выводим элементы массива a после выполнений метода AddItem: ");
        for (int k : a) {
            System.out.printf("%d ", k);
        }

        System.out.println("");

        // 4. Иерархия коллекций. ArrayList
        // "Удобный массив"
        System.out.printf("выводим элементы массива list: ");
        ArrayList<Integer> list = new ArrayList<Integer>(); // <Integer> - называется обобщение
        //ArrayList list = new ArrayList();
        list.add(2809);
        //list.add("2809");
        for (Object p : list) {
            System.out.println(p);
        }

        ArrayList<Integer> list3 = new ArrayList<>(10); // изначально в нашей коллекции место под 10 элементов (но можно будет и расширить)
        ArrayList<Integer> list4 = new ArrayList<>(list3); 

        // 5. Итератор
        System.out.println("");
        System.out.println("выводим элементы list5 циклом foreach");
        List<Integer> list5 = List.of(1,12,123,1234);
        for (int iterable_element : list5) {
            System.out.println(iterable_element);
            //изменять элементы здесь не нужно и нельзя            
        }

        System.out.println();
        System.out.println("работаем с итератором");
        Iterator<Integer> col = list5.iterator();
        while (col.hasNext()) {
            System.out.println(col.next());
            //col.next();
            //col.remove();
        }
    }

    // 1
    private static void GetType(Object obj) {
        System.out.println("void GetType(o): obj.getClass().getName():" + obj.getClass().getName());
    }

    // 2
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else
            return 0;

    }

    // 3 массивы
    // тут мы написали метод AddItem, который на вход принимает массив, в который
    // будет добавляться элемент item
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
