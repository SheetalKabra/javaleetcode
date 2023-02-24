import Scaler.BusiestTimeAtMall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusiestTimeAtMallTest {
    BusiestTimeAtMall busiestTimeAtMall = new BusiestTimeAtMall();
    @Test
    void testCase1() {
        int[][] data = {
                {1487799426,21,1}
        };
        int actualTimestamp = busiestTimeAtMall.findBusiestPeriod(data);
        assertEquals(1487799426, actualTimestamp);
    }

    @Test
    void testCase2(){
        //[[1487799425,21,0],[1487799427,22,1],[1487901318,7,0]],Expected: 1487799427,Actual: 1487799427
        int[][] data = {
                {1487799425,21,0},
                {1487799427,22,1},
                {1487901318,7,0}
        };
        int actualTimestamp = busiestTimeAtMall.findBusiestPeriod(data);
        assertEquals(1487799427, actualTimestamp);
    }

    @Test
    void testCase3(){
        //[[1487799425,21,1],[1487799425,4,0],[1487901318,7,0]],Expected: 1487799425,Actual: 1487799425
        int[][] data = {
                {1487799425,21,1},
                {1487799425,4,0},
                {1487901318,7,0}
        };
        int actualTimestamp = busiestTimeAtMall.findBusiestPeriod(data);
        assertEquals(1487799425, actualTimestamp);
    }

    @Test
    void testCase4(){
        //[[1487799425,14,1],[1487799425,4,0],[1487799425,2,0],[1487800378,10,1],[1487801478,18,0],[1487801478,18,1],[1487901013,1,0],[1487901211,7,1],[1487901211,7,0]],Expected: 1487800378,Actual: 1487800378
        int[][] data = {
                {1487799425,14,1},
                {1487799425,4,0},
                {1487799425,2,0},
                {1487800378,10,1},
                {1487801478,18,0},
                {1487801478,18,1},
                {1487901013,1,0},
                {1487901211,7,1},
                {1487901211,7,0}
        };
        int actualTimestamp = busiestTimeAtMall.findBusiestPeriod(data);
        assertEquals(1487800378, actualTimestamp);
    }

    @Test
    void testCase5(){
        //[[1487799425,14,1],[1487799425,4,1],[1487799425,2,1],[1487800378,10,1],[1487801478,18,1],[1487901013,1,1],[1487901211,7,1],[1487901211,7,1]],Expected: 1487901211,Actual: 1487901211
        int[][] data = {
                {1487799425,14,1},
                {1487799425,4,1},
                {1487799425,2,1},
                {1487800378,10,1},
                {1487801478,18,1},
                {1487901013,1,1},
                {1487901211,7,1},
                {1487901211,7,1}
        };
        int actualTimestamp = busiestTimeAtMall.findBusiestPeriod(data);
        assertEquals(1487901211, actualTimestamp);
    }

}