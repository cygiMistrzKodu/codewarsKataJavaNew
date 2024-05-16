import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> listA = Arrays.stream(a).boxed().toList();
        List<Integer> listB = Arrays.stream(b).boxed().toList();

        List<Integer> difference = new ArrayList<>(listA);
        for (Integer numberB : listB) {

            for (Integer numberA : listA) {
                if (numberA.equals(numberB)) {
                    difference.remove(numberB);
                }
            }
        }

        return difference.stream().mapToInt(i -> i).toArray();
    }

}