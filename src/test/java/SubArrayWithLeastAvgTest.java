import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayWithLeastAvgTest {

    @Test
    void solve() {
        SubArrayWithLeastAvg s = new SubArrayWithLeastAvg();
        int ans = s.solve(new ArrayList<Integer>(Arrays.asList(3, 7, 90, 20, 10, 50, 40)), 3);
        assertEquals(3, ans);
    }
    @Test
    void solve1() {
        SubArrayWithLeastAvg s = new SubArrayWithLeastAvg();
        int ans = s.solve(new ArrayList<Integer>(Arrays.asList(3, 7, 5, 20, -10, 0, 12)), 2);
        assertEquals(4, ans);
    }
}