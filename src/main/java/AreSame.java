import java.util.Arrays;
import java.util.List;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null) {
            return false;
        }

        if (b == null) {
            return false;
        }

        List<Integer> numbers = Arrays.stream(a).boxed().toList();
        List<Integer> squareNumbers = new java.util.ArrayList<>(Arrays.stream(b).boxed().toList());

        if (numbers.isEmpty() && !squareNumbers.isEmpty()) {
            return false;
        }

        for (Integer number : numbers) {
            if (!squareNumbers.contains(number * number)) {
                return false;

            } else {
                Integer squareNumberToRemove = number * number;
                squareNumbers.remove(squareNumberToRemove);
            }
        }

        return true;
    }
}