import java.util.LinkedList;
import java.util.List;

class Persist {

    private static List<Integer> brakeOnDigits(long number) {
        LinkedList<Integer> digits = new LinkedList<>();
        while (number > 0) {
            digits.push((int) (number % 10));
            number /= 10;
        }
        return digits;
    }

    private static long multiplyDigits (List<Integer> digits) {
      return digits.stream().reduce(1, (a,b) -> a * b);
    }

    public static int persistence(long n) {

        List<Integer> digits;
        long number = n;
        int howManyTimesMultiply = 0;

        while (number - 10 >= 0) {
            howManyTimesMultiply++;
            digits = brakeOnDigits(number);
            number =  multiplyDigits(digits);
        }


        return howManyTimesMultiply;
    }
}