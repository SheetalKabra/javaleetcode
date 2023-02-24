package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP3_BuyingCandies {
    public static void main(String[] args) {
        ScalerAd_DP3_BuyingCandies s = new ScalerAd_DP3_BuyingCandies();
        System.out.println(s.solve(
                new ArrayList<>(Arrays.asList(1,2,3)),
                new ArrayList<>(Arrays.asList(2,2,10)),
                new ArrayList<>(Arrays.asList(2,3,9)),
                8
        ));

//        System.out.println(s.solve(
//                new ArrayList<>(Arrays.asList(2)),
//                new ArrayList<>(Arrays.asList(5)),
//                new ArrayList<>(Arrays.asList(10)),
//                99
//        ));
    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, int D) {
        int N = A.size();
        int[][] dp = new int[N+1][D+1];
        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], -1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<N; i++){
            res.add(i, A.get(i)*B.get(i));
        }
        return ways(N-1, D, res, C, dp);
    }

    public int ways(int N, int D, ArrayList<Integer> candies, ArrayList<Integer> cost, int[][] dp){
        if(N < 0 || D == 0){
            return 0;
        }
        if(dp[N][D] != -1){
            return dp[N][D];
        }
        int notpick = ways(N-1, D, candies, cost, dp);
        int pick = -1;
        if(D >= cost.get(N)){
            pick = candies.get(N) + ways(N, D - cost.get(N), candies, cost, dp);
        }
        return dp[N][D] = Math.max(notpick, pick);

    }

}
