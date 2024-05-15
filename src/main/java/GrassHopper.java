import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int n) {

        return IntStream.iterate(1, number -> number + 1)
                .limit(n).sum();
    }
}