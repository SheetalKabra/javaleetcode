import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AmazingSubArraysTest {

    @Test
    void solve() {
        AmazingSubArrays as = new AmazingSubArrays();
        int count = as.solve("ABEC");
        assertEquals(6, count);
    }

    @Test
    void solve1() {
        AmazingSubArrays as = new AmazingSubArrays();
        int count = as.solve("AAAABEC");
        assertEquals(24, count);
    }
}