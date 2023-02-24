package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP3_01Knapsack {
    public static void main(String[] args) {
        ScalerAd_DP3_01Knapsack s = new ScalerAd_DP3_01Knapsack();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(100,60,120,150)),
//                                    new ArrayList<>(Arrays.asList(20,10,30,40)),
//                                    50));

//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(60, 100, 120)),
//                new ArrayList<>(Arrays.asList(10,20,30)),
//                50));

        System.out.println(s.solve(new ArrayList<>(Arrays.asList(10, 20, 30, 40)),
                new ArrayList<>(Arrays.asList(12, 13, 15, 19)),
                10));
    }
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int N = A.size();
        int[][] dp = new int[N+1][C+1];
        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], -1);
        }

//        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
//        for(int i=0; i<N; i++){
//            ArrayList<Integer> dprows = new ArrayList<>();
//            for(int j=0; j<=C; j++){
//                dprows.add(j, -1);
//            }
//            dp.add(i, dprows);
//        }

        return maxValue(N-1, C, A, B, dp);
    }

    public int maxValue(int N, int W, ArrayList<Integer> val, ArrayList<Integer> wt, int[][] dp){
        if(N < 0 || W == 0){
            return 0;
        }
        if(dp[N][W] != -1){
            return dp[N][W];
        }
//        if(dp.get(N).get(W) != -1){
//            return dp.get(N).get(W);
//        }
        int notpick = maxValue(N-1, W, val, wt, dp);
        int pick = -1;
        if(W >= wt.get(N)){
            pick = val.get(N) + maxValue(N-1, W-wt.get(N), val, wt, dp);

        }
        //dp.get(N).set(W, Math.max(pick, notpick));
        //return  dp.get(N).get(W);
        return dp[N][W] = Math.max(pick, notpick);

    }
}
