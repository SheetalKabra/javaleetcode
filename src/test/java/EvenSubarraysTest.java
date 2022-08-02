import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EvenSubarraysTest {

    @Test
    void solve() {
        EvenSubarrays es = new EvenSubarrays();
        String op = es.solve(new ArrayList<>(Arrays.asList(2,4,6,8)));
        assertEquals("YES", op);
    }

    @Test
    void solve1() {
        EvenSubarrays es = new EvenSubarrays();
        String op = es.solve(new ArrayList<>(Arrays.asList(2,4,6)));
        assertEquals("NO", op);
    }

    @Test
    void solve2() {
        EvenSubarrays es = new EvenSubarrays();
        String op = es.solve(new ArrayList<>(Arrays.asList(2,4,6,8,5)));
        assertEquals("NO", op);
    }

    @Test
    void solve3() {
        EvenSubarrays es = new EvenSubarrays();
        String op = es.solve(new ArrayList<>(Arrays.asList(2,4,6,5,7,8)));
        assertEquals("YES", op);
    }

    @Test
    void solve4() {
        EvenSubarrays es = new EvenSubarrays();
        String op = es.solve(new ArrayList<>(Arrays.asList(2,4,6,12,14,3)));
        assertEquals("NO", op);
    }

    @Test
    void solve5() {
        EvenSubarrays es = new EvenSubarrays();
        String op = es.solve(new ArrayList<>(Arrays.asList(2,4,6,7,8)));
        assertEquals("NO", op);
    }
}