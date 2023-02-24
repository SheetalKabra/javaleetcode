package Scaler;

import java.util.Arrays;

public class ScalerAd_DP6_LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String x = "Scaler.abc";
        String y = "Scaler.abc";

        System.out.println(x.concat(y));
        System.out.print(x);

        ScalerAd_DP6_LongestPalindromicSubsequence s = new ScalerAd_DP6_LongestPalindromicSubsequence();
        System.out.println(s.solve("aedsead"));
    }
    public int solve(String A) {
        int N = A.length();
        int M = A.length();
        StringBuilder B = new StringBuilder(A);
        B.reverse();
        int[][] dp = new int[N+1][M+1];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i], -1);
        }
        return lcs(N, M, A, String.valueOf(B), dp);
    }

    public int lcs(int N, int M, String A, String B, int[][] dp){
        if(N == 0 || M == 0){
            return 0;
        }
        if(dp[N][M] != -1){
            return dp[N][M];
        }
        if(A.charAt(N-1) == B.charAt(M-1)){
            return dp[N][M] = 1+lcs(N-1, M-1, A, B, dp);
        }
        return dp[N][M] = Math.max(lcs(N, M-1, A, B, dp), lcs(N-1, M, A, B, dp));
    }
}
