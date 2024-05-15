import java.util.Arrays;
import java.util.stream.Collectors;

public class Maps {
    public static int[] map(int[] arr) {

        return Arrays.stream(arr).map(number -> number * 2).toArray();
    }
}