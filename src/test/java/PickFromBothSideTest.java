import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PickFromBothSideTest {

    @Test
    void solve() {
        PickFromBothSide pickFromBothSide = new PickFromBothSide();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,-4,-3,-2,-1));

        int solve = pickFromBothSide.solve(input, 2);
        assertEquals(-3, solve);

    }
}