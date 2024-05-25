import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    @Test
    public void Test() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    @Test
    public void Test2() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 's'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e'}));
    }

    @Test
    public void Test3() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'w', 'n', 'w', 'n', 'w', 'n', 'w', 'n', 'w'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'e', 'e', 'e', 'e',  'w', 'w', 's', 's', 's', 'n'}));

    }

    @Test
    public void Test4() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'e', 'e', 'e', 'e', 'w', 'w', 's', 's', 's', 's'}));
        // jednak trzeba odróznic kierunke północ południe i wschoód zachóed jak beda mieć po 0  i 0 to w tedy powrót do punktu początkowego

    }

}