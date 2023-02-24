import Scaler.SumOfEvenOddIndices;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumOfEvenOddIndicesTest {

    @Test
    void solve() {
        SumOfEvenOddIndices s = new SumOfEvenOddIndices();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 1, 6, 4));
        int count = s.solve(input);
        assertEquals(1, count);
    }

    @Test
    void solve1() {
        SumOfEvenOddIndices s = new SumOfEvenOddIndices();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1));
        int count = s.solve(input);
        assertEquals(3, count);
    }

    @Test
    void solve2() {
        SumOfEvenOddIndices s = new SumOfEvenOddIndices();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1,2));
        int count = s.solve(input);
        assertEquals(0, count);
    }
}