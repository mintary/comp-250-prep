import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Week1Test {

    @Test
    void rearrangeTest1() {
        String input = "ABCDE";
        char[] result = Week1.rearrange(input);
        assertEquals("AEBDC", new String(result));
    }

    @Test
    void rearrangeTest2() {
        String input = "THING";
        char[] result = Week1.rearrange(input);
        assertEquals("TGHNI", new String(result));
    }

    @Test
    void rearrangeTest3() {
        String input = "ABCD";
        char[] result = Week1.rearrange(input);
        assertEquals("ADBC", new String(result));
    }

    @Test
    void countMatchingTest1() {
        int[] guess = {1,1,1,0,2};
        int[] hidden = {5,1,3,1,3};
        assertEquals(2, Week1.countMatching(guess, hidden));
    }

    @Test
    void countMatchingTest2() {
        int[] guess = {1,2,3,4,5};
        int[] hidden = {5,2,0,4,1};
        assertEquals(4, Week1.countMatching(guess, hidden));
    }

    @Test
    void countMatchingTest3() {
        int[] guess = {9,8,7,6,5};
        int[] hidden = {1,2,3,4,0};
        assertEquals(0, Week1.countMatching(guess, hidden));
    }

    @Test
    void countMatchingTest4() {
        int[] guess = {0,0,0,0,0};
        int[] hidden = {0,0,1,2,3};
        assertEquals(2, Week1.countMatching(guess, hidden));
    }

    @Test
    void countMatchingTest5() {
        int[] guess = {1,2,3,4,5};
        int[] hidden = {1,2,3,4,5};
        assertEquals(5, Week1.countMatching(guess, hidden));
    }

    @Test
    void countGuessTest1() {
        int[] guess = {1,1,1,0,2};
        int[] hidden = {5,1,3,1,3};
        assertArrayEquals(new int[]{1,1}, Week1.countGuess(guess, hidden));
    }

    @Test
    void countGuessTest2() {
        int[] guess = {1,2,3,4,5};
        int[] hidden = {5,2,0,4,1};
        assertArrayEquals(new int[]{2,2}, Week1.countGuess(guess, hidden));
    }

    @Test
    void countGuessTest3() {
        int[] guess = {0,0,0,0,0};
        int[] hidden = {0,0,1,2,3};
        assertArrayEquals(new int[]{0,2}, Week1.countGuess(guess, hidden));
    }

    @Test
    void countGuessTest4() {
        int[] guess = {1,2,3,4,5};
        int[] hidden = {1,2,3,4,5};
        assertArrayEquals(new int[]{0,5}, Week1.countGuess(guess, hidden));
    }

    @Test
    void countGuessTest5() {
        int[] guess = {9,8,7,6,5};
        int[] hidden = {1,2,3,4,0};
        assertArrayEquals(new int[]{0,0}, Week1.countGuess(guess, hidden));
    }
}
