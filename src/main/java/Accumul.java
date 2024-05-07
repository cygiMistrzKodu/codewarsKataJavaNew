import java.util.Arrays;
import java.util.List;

public class Accumul {

    public static String accum(String s) {

        String text = s.toUpperCase();
        List<String> byLetterText = Arrays.stream(text.split("")).toList();

        StringBuilder resultText = new StringBuilder();
        for (int letterNumber = 0; letterNumber < byLetterText.size(); letterNumber++) {

            String capitalLetter = byLetterText.get(letterNumber);
            resultText.append(byLetterText.get(letterNumber));

            if (letterNumber > 0) {
                resultText.append(capitalLetter.toLowerCase().repeat(letterNumber));
            }

            resultText.append("-");


        }
        removeLastDash(resultText);

        return resultText.toString();
    }

    private static void removeLastDash(StringBuilder resultText) {
        resultText.deleteCharAt(resultText.length() - 1);
    }
}