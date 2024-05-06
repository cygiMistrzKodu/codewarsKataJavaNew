import java.util.Arrays;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int sumClassPoints = Arrays.stream(classPoints).sum();
        int countClassPoints = (int) Arrays.stream(classPoints).count();

        int allClassPoints = sumClassPoints + yourPoints;
        int countAll = countClassPoints + 1;

        int avgPoints =  allClassPoints / countAll;

        return avgPoints < yourPoints;
    }
}
