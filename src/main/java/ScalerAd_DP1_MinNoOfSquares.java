import java.util.Arrays;
import java.util.HashMap;

public class ScalerAd_DP1_MinNoOfSquares {
    public static void main(String[] args) {
        ScalerAd_DP1_MinNoOfSquares s = new ScalerAd_DP1_MinNoOfSquares();
        System.out.println(s.countMinSquares(97280));
    }
    public int countMinSquares(int A) {
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        helper(A, dp);
        return dp[A];
    }

    public int helper(int A, int[] dp){
        if(A == 0){
            return 0;
        }
        if(dp[A] != -1){
            return dp[A];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=1; i*i<=A; i++){
            ans = Math.min(ans, helper(A-i*i, dp)+1);
        }
        dp[A] = ans;
        return ans;
    }
}
