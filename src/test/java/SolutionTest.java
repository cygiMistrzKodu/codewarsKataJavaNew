import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;


public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", Kata.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", Kata.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", Kata.towerBuilder(3)));
    }


    @Test
    public void spaceCalculatorTests() {

        assertArrayEquals(new Integer[]{0} ,Kata.calculateSpace(1).toArray());
        assertArrayEquals(new Integer[]{1,0} ,Kata.calculateSpace(2).toArray());
        assertArrayEquals(new Integer[]{2,1,0} ,Kata.calculateSpace(3).toArray());
        assertArrayEquals(new Integer[]{3,2,1,0} ,Kata.calculateSpace(4).toArray());
        assertArrayEquals(new Integer[]{4,3,2,1,0} ,Kata.calculateSpace(5).toArray());
        assertArrayEquals(new Integer[]{5,4,3,2,1,0} ,Kata.calculateSpace(6).toArray());
        assertArrayEquals(new Integer[]{6,5,4,3,2,1,0} ,Kata.calculateSpace(7).toArray());


    }
}