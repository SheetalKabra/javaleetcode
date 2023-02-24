package Scaler;

import java.util.Arrays;

public class ScalerAd_DP3_WaysToSendSignals {
    public static void main(String[] args) {
        ScalerAd_DP3_WaysToSendSignals s = new ScalerAd_DP3_WaysToSendSignals();
        System.out.println(s.solve(5));

    }
    public int solve(int A) {
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 2;
        return waysToSendSignal(A, dp);
    }

    public int waysToSendSignal(int A, int[] dp){
        if(dp[A] != -1){
            return dp[A];
        }
        return dp[A] = waysToSendSignal(A-1, dp) + waysToSendSignal(A-2, dp);
    }
}
