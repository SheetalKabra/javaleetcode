import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BulbsTest {

    @Test
    void bulbs() {
        Bulbs b = new Bulbs();
        int count = b.bulbs(new ArrayList<>(Arrays.asList(0,1,0,1)));
        assertEquals(4, count);
    }

    @Test
    void bulbs1() {
        Bulbs b = new Bulbs();
        int count = b.bulbs(new ArrayList<>(Arrays.asList(1,1,1,1)));
        assertEquals(0, count);
    }

    @Test
    void bulbs2() {
        Bulbs b = new Bulbs();
        int count = b.bulbs(new ArrayList<>(Arrays.asList(0,0,0,0)));
        assertEquals(1, count);
    }

    @Test
    void bulbs3() {
        Bulbs b = new Bulbs();
        int count = b.bulbs(new ArrayList<>(Arrays.asList(1,1,1,0,0,1,0,0,0,1)));
        assertEquals(4, count);
    }

    @Test
    void bulbs4() {
        Bulbs b = new Bulbs();
        int count = b.bulbs(new ArrayList<>(Arrays.asList(1,1,1,0,0,1)));
        assertEquals(2, count);
    }

    @Test
    void bulbs5() {
        Bulbs b = new Bulbs();
        int count = b.bulbs(new ArrayList<>(Arrays.asList(1,0,1,0)));
        assertEquals(3, count);
    }
}