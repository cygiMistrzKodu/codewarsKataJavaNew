import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
    public static String order(String words) {

        String[] splitsWords = words.split(" ");
        Map<Integer, String> wordsSortedAscending = new TreeMap<>();

        String oneNumberPattern = "(\\d)";
        Pattern patternNumber = Pattern.compile(oneNumberPattern);

        Arrays.stream(splitsWords).forEach(word -> {
            Matcher matcher = patternNumber.matcher(word);

            if (matcher.find()) {

                Integer numberInWord = Integer.parseInt(matcher.group());
                wordsSortedAscending.put(numberInWord, word);
            }
        });

        return String.join(" ", wordsSortedAscending.values());
    }
}