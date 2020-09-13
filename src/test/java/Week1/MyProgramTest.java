package Week1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyProgramTest {

    @Test
    void findLast() {
        int[] x = {2, 3, 5};
        int y = 2;
        int expected = 0;
        int actual = MyProgram.findLast(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void lastZero() {
        int[] x = {0, 1, 0};
        int expected = 2;
        int actual = MyProgram.lastZero(x);
        assertEquals(expected, actual);
    }

    @Test
    void countPositive() {
        int[] x = {-4, 2, 0, 2};
        int expected = 2;
        int actual = MyProgram.countPositive(x);
        assertEquals(expected, actual);
    }

    @Test
    void oddOrPos() {
        int[] x = {-3, -2, 0, 1, 4};
        int expected = 3;
        int actual = MyProgram.oddOrPos(x);
        assertEquals(expected, actual);
    }
}