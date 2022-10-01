import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class practice3_1 {
    public static void main(String[] args) {
        int array_nums[] = new int[10];

        for (int i = 0; i < array_nums.length; i++) {
            array_nums[i] = (int) (Math.random() * 10);
            System.out.println(array_nums[i]);
        }

        Arrays.sort(array_nums);
        System.out.println("Arrays.sort(array_nums);");

        for (int i = 0; i < array_nums.length; i++) {
            System.out.println(array_nums[i]);
        }


/////////////////////////////////////
        System.out.println("work with List<Integer> list = new ArrayList<>();");
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(10);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}
