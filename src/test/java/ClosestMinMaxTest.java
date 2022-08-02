import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClosestMinMaxTest {

    @Test
    void solve() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,5,3,2,2,4,5,11,1,2,1,12));
        int solve = closestMinMax.solve(input);
        assertEquals(4, solve);
    }

    @Test
    void solve1() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        int solve = closestMinMax.solve(input);
        assertEquals(1, solve);
    }

    @Test
    void solve2() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2));
        int solve = closestMinMax.solve(input);
        assertEquals(2, solve);
    }

    @Test
    void solve4() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,5,3,2,2,4,15,11,1,2,1,12));
        int solve = closestMinMax.solve(input);
        assertEquals(3, solve);
    }

    @Test
    void solve5() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(15,5,3,2,2,4,15,11,1,2,1,12));
        int solve = closestMinMax.solve(input);
        assertEquals(3, solve);
    }
    @Test
    void solve6() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(153,5,3,2,2,4,15,11,1,2,1,12));
        int solve = closestMinMax.solve(input);
        assertEquals(9, solve);
    }

    @Test
    void solve7() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,5,3,2,2,4,5,11,1,12,1,12));
        int solve = closestMinMax.solve(input);
        assertEquals(2, solve);
    }

    @Test
    void solve8() {
        ClosestMinMax closestMinMax = new ClosestMinMax();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,4,4,4,4,4));
        int solve = closestMinMax.solve(input);
        assertEquals(1, solve);
    }
}