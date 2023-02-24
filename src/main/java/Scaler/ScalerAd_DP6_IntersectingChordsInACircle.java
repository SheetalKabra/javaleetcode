package Scaler;

import java.util.Arrays;

public class ScalerAd_DP6_IntersectingChordsInACircle {
    public static void main(String[] args) {
        ScalerAd_DP6_IntersectingChordsInACircle s = new ScalerAd_DP6_IntersectingChordsInACircle();
        System.out.println(s.chordCnt(22));
    }
    public int chordCnt(int A) {
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        return ways(A, dp);
    }

    public int ways(int A, int [] dp){
        int m = 1000000007;
        if(A <= 1){
            return 1;
        }
        if(dp[A] != -1){
            return dp[A];
        }
        long ans = 0;
        for(int l=0; l<A; l++){
            ans = (ans%m + (((long)ways(l, dp)%m)*((long)ways(A-1-l, dp)%m))%m)%m;

        }
        return dp[A] = (int)ans;
    }
}
