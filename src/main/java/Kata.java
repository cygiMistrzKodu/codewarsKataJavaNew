import java.util.ArrayList;
import java.util.List;

public class Kata {

    // moja czesc dla testowania spacji
    public static List<Integer> calculateSpace(int nFloors) {

        List<Integer> spaces = new ArrayList<>();

        for (int floor = 1; floor <= nFloors; floor++) {
            int numberOfSpacesOnFloor = ((nFloors * 2 - 1) - (floor * 2 - 1)) / 2;
            spaces.add(numberOfSpacesOnFloor);
        }
        return spaces;
    }

    public static String[] towerBuilder(int nFloors) {

        StringBuilder tower = new StringBuilder();

        int numberOfBlockForFloor;
        int numberOfSpacesForFloor;
        for (int floor = 1; floor <= nFloors; floor++) {

            numberOfBlockForFloor = (floor * 2) - 1;
            numberOfSpacesForFloor = ((nFloors * 2 - 1) - (floor * 2 - 1)) / 2;

            String numberOfSpaces = " ".repeat(numberOfSpacesForFloor);
            tower.append(numberOfSpaces);
            tower.append("*".repeat(numberOfBlockForFloor));
            tower.append(numberOfSpaces);
            if (floor != nFloors) {
                tower.append(",");
            }

        }

        return new String[]{tower.toString()};
    }
}