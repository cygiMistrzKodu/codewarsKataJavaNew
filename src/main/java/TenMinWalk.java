import java.util.HashMap;
import java.util.Map;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        Map<Character, Integer> directionAndMovingVectorNorthSouth = new HashMap<>();
        directionAndMovingVectorNorthSouth.put('n', 1);
        directionAndMovingVectorNorthSouth.put('s', -1);

        Map<Character, Integer> directionAndMovingVectorWestEast = new HashMap<>();
        directionAndMovingVectorWestEast.put('e', 1);
        directionAndMovingVectorWestEast.put('w', -1);

        boolean isWalkTake10Minutes = walk.length == 10;

        if (isWalkTake10Minutes) {

            int displacementNorthSouth = 0;
            int displacementWestEast = 0;

            for (char directionLetter : walk) {
                displacementNorthSouth += directionAndMovingVectorNorthSouth.getOrDefault(directionLetter, 0);
                displacementWestEast += directionAndMovingVectorWestEast.getOrDefault(directionLetter, 0);
            }
            return (displacementNorthSouth == 0) && (displacementWestEast == 0);

        }

        return false;
    }
}