import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {

        return stops.stream().map(bus -> bus[0] - bus[1]).reduce(0, Integer::sum);

    }
}