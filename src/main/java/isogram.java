public class isogram {
    public static boolean isIsogram(String str) {

        String text = str.toLowerCase();

        for (char letter : text.toCharArray()) {

            long nextLetterCount = text.chars().filter(nextLetter -> nextLetter == letter).count();
            if (nextLetterCount > 1) {
                return false;
            }
        }

        return true;
    }
}