import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlteringSubArrayTest {

    @Test
    void solve() {
        AlteringSubArray a = new AlteringSubArray();
        ArrayList<Integer> op = a.solve(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 1)), 1);
        assertEquals(op, new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
    }

    @Test
    void solve1() {
        AlteringSubArray a = new AlteringSubArray();
        ArrayList<Integer> op = a.solve(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 0, 1)), 1);
        assertEquals(op, new ArrayList<Integer>(Arrays.asList(5)));
    }

    @Test
    void solve2() {
        AlteringSubArray a = new AlteringSubArray();
        ArrayList<Integer> op = a.solve(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 0, 1)), 0);
        assertEquals(op, new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6)));
    }

    @Test
    void solve3() {
        AlteringSubArray a = new AlteringSubArray();
        ArrayList<Integer> op = a.solve(new ArrayList<Integer>(Arrays.asList(1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1)), 5);
        assertEquals(op, new ArrayList<Integer>(Arrays.asList(5,6,7,8,9,10,11,12,13,14,15)));
    }

    @Test
    void solve4() {
        AlteringSubArray a = new AlteringSubArray();
        ArrayList<Integer> op = a.solve(new ArrayList<Integer>(Arrays.asList(1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,1,1)), 5);
        assertEquals(op, new ArrayList<Integer>(Arrays.asList(5,6)));
    }
}