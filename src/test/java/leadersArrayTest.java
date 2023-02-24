import Scaler.leadersArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class leadersArrayTest {

    @Test
    void solve() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12,5,3,4,11,10,2,1));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1,2,10,11,12)), output);
    }

    @Test
    void solve1() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(9,5,3,4,11,10,2,1));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1,2,10,11)), output);
    }

    @Test
    void solve2() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(4)), output);
    }

    @Test
    void solve3() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,3));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(3,4)), output);
    }

    @Test
    void solve4() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4,3,40));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(40)), output);
    }

    @Test
    void solve5() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(5)), output);
    }

    @Test
    void solve6() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)), output);
    }

    @Test
    void solve7() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(2)), output);
    }

    @Test
    void solve8() {
        leadersArray la = new leadersArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(16,17,4,3,5,2));
        ArrayList<Integer> output = la.solve(input);
        assertEquals(new ArrayList<Integer>(Arrays.asList(2,5,17)), output);
    }
}