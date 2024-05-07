import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static String reverseWords(final String original) {

        if (original.isBlank()) {
            return original;
        }

        List<String> splitByWorldSpaceIncluded = List.of(original.split(" "));

        return splitByWorldSpaceIncluded.stream().map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

    }
}