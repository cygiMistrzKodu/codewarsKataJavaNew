import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {

        Map<Integer, Long> numberAndOccurrence = Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> numberOddNumbersOfTime =
                numberAndOccurrence.entrySet().stream()
                        .filter(number -> number.getValue() % 2 != 0).findFirst();

        return numberOddNumbersOfTime.get().getKey();
    }
}