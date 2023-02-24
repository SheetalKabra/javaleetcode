import Scaler.IsRectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsRectangleTest {

    @Test
    void solve() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(1,2,3,4);
        assertEquals(0, op);
    }

    @Test
    void solve1() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(1,1,3,4);
        assertEquals(0, op);
    }

    @Test
    void solve2() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(1,2,4,4);
        assertEquals(0, op);
    }

    @Test
    void solve3() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(1,4,4,4);
        assertEquals(0, op);
    }

    @Test
    void solve4() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(4,4,4,4);
        assertEquals(1, op);
    }

    @Test
    void solve5() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(3,3,4,4);
        assertEquals(1, op);
    }

    @Test
    void solve6() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(4,3,3,4);
        assertEquals(1, op);
    }

    @Test
    void solve7() {
        IsRectangle r = new IsRectangle();
        int op = r.solve(3,4,3,4);
        assertEquals(1, op);
    }
}