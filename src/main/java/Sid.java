import java.util.List;
import java.util.stream.IntStream;

class Kata {
    public static String countingSheep(int num) {

     List<String> sheepList =  IntStream.range(1, num+1).mapToObj(String::valueOf)
                .map(nextSheepNumber -> nextSheepNumber + " sheep...").toList();

        return String.join("", sheepList);
    }
}