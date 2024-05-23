public class StringUtils {

    private static char changeChar(char sign) {

        if (Character.isUpperCase(sign)) {
            sign = Character.toLowerCase(sign);
        } else {
            sign = Character.toUpperCase(sign);
        }

        return sign;
    }

    public static String toAlternativeString(String string) {

        int[] charCodes = string.chars().map(sign -> changeChar((char) sign)).toArray();

        StringBuilder sb = new StringBuilder(charCodes.length);
        for (int charCode : charCodes) {
            sb.append((char) charCode);
        }

        return sb.toString();

    }
}