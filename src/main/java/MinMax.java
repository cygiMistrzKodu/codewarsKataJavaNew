import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        return new int[]{min, max};
    }
}