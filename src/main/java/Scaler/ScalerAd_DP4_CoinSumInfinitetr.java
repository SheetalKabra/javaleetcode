package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP4_CoinSumInfinitetr {
    public static void main(String[] args) {

    }
    public int coinchange2(ArrayList<Integer> A, int B) {
        int N = A.size();
        int[][] dp = new int[N+1][B+1];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i], -1);
        }
        return ways(N, B, A, dp);
    }

    public int ways(int N, int K, ArrayList<Integer> A, int[][] dp){
        if(N == 0 ){
            if(K == 0){
                dp[N][K] = 1;
                return 1;
            }else{
                dp[N][K] = 0;
                return 0;
            }
        }
        if(dp[N][K] != -1){
            return dp[N][K];
        }
        int ans = ways(N-1, K, A, dp);
        if(K >= A.get(N-1)){
            ans += ways(N, K-A.get(N-1), A, dp);
        }
        return ans;
    }


}
