import static org.junit.Assert.*;
import org.junit.Test;


public class AreSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void test2() {
        int[] a = new int[]{2, 2, 3};
        int[] b = new int[]{4, 9, 9};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void test3() {
        int[] a = new int[]{4, 4};
        int[] b = new int[]{1, 31};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void aIsNull() {
        int[] a = null;
        int[] b = new int[]{1, 31};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void bIsNull() {
        int[] a = new int[]{4, 4};
        int[] b = null;
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void aAndbisNull() {
        int[] a = null;
        int[] b = null;
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void oneIsEmpty() {
        int[] a = new int[]{};
        int[] b = new int[]{1};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void secondIsEmpty() {
        int[] a = new int[]{1};
        int[] b = new int[]{};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void bothIsEmpty() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(true, AreSame.comp(a, b));
    }

}