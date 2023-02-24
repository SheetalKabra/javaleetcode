package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScalerAd_DP7_BuyAndSellStockslll {
    public static void main(String[] args) {
        ScalerAd_DP7_BuyAndSellStockslll s = new ScalerAd_DP7_BuyAndSellStockslll();
        System.out.println(s.maxProfit(new ArrayList<>(Arrays.asList(1,2,1,2))));
    }
    public int maxProfitTopDown(final List<Integer> A) {
        int N = A.size();
        //we have 3 choices: buy, sell or skip
        //[][][] ->
            //first bracket [] = n+1
            //second bracket [] = either you buy or not buy that is 0 or 1
            //third bracket [] = either you have 0 transactions left, or you have 1 transactions left or you have 2 transactions left

        int[][][] dp = new int[N+1][2][3];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i][0], -1);
            Arrays.fill(dp[i][1], -1);
        }
        return waysTopDown(0, 1, 2, A, dp, N);

    }

    public int waysTopDown(int ind, int buy, int k, final List<Integer> A, int[][][] dp, int n){
        if(ind == n || k == 0){
            return 0;
        }
        if(dp[ind][buy][k] != -1){
            return dp[ind][buy][k];
        }
        if(buy == 1){
            //we can either buy or skip
            return dp[ind][buy][k] = Math.max(-A.get(ind) + waysTopDown(ind+1, 0, k, A, dp, n), waysTopDown(ind+1, 1, k, A, dp, n));
        }
        return dp[ind][buy][k] = Math.max(A.get(ind) + waysTopDown(ind+1, 1, k-1, A, dp, n), waysTopDown(ind+1, 0, k, A, dp, n));
    }

    //Bottom up:
    public int maxProfitBottomUpV1(final List<Integer> A) {
        int N = A.size();
        //we have 3 choices: buy, sell or skip
        //[][][] ->
        //first bracket [] = n+1
        //second bracket [] = either you buy or not buy that is 0 or 1
        //third bracket [] = either you have 0 transactions left, or you have 1 transactions left or you have 2 transactions left


        int[][][] dp = new int[N+1][2][3];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i][0], 0);
            Arrays.fill(dp[i][1], 0);
        }
        //write the base case:
        //1. base case is: if k == 0, fill them with 0
        //2. base case is: if ind == n, fill them with 0
        //we don't need to do this because we have already initialize the values with 0

        //now we are returning this: ways(0, 1, 2, A, dp, N), so do opposite of this:
        //so, n loop will start from (n-1)->0
        //buy loop will start from 0->1
        //transaction loop will start from 1->2, why we have started from 1, because in base case we have already defined for transaction=0, we have 0 values
        for(int ind = N-1; ind >=0; ind--){
            for(int buy=0; buy<=1; buy++){
                for(int k=1; k<=2; k++){
                    //copy the recursive logic:
                    if(buy == 1){
                        dp[ind][buy][k] = Math.max(-A.get(ind) + dp[ind+1][0][k], dp[ind+1][1][k]);
                    }else{
                        dp[ind][buy][k] = Math.max(A.get(ind) + dp[ind+1][1][k-1], dp[ind+1][0][k]);
                    }
                }
            }
        }
        return dp[0][1][2];
    }

    //bottom up space optimization
    public int maxProfit(final List<Integer> A) {
        int N = A.size();
        //we have 3 choices: buy, sell or skip
        //[][][] ->
        //first bracket [] = n+1
        //second bracket [] = either you buy or not buy that is 0 or 1
        //third bracket [] = either you have 0 transactions left, or you have 1 transactions left or you have 2 transactions left


        int[][] after = new int[2][3];
        int[][] curr = new int[2][3];
        //write the base case:
        //1. base case is: if k == 0, fill them with 0
        //2. base case is: if ind == n, fill them with 0
        //we don't need to do this because we have already initialize the values with 0

        //now we are returning this: ways(0, 1, 2, A, dp, N), so do opposite of this:
        //so, n loop will start from (n-1)->0
        //buy loop will start from 0->1
        //transaction loop will start from 1->2, why we have started from 1, because in base case we have already defined for transaction=0, we have 0 values
        for(int ind = N-1; ind >=0; ind--){
            for(int buy=0; buy<=1; buy++){
                for(int k=1; k<=2; k++){
                    //copy the recursive logic:
                    if(buy == 1){
                        curr[buy][k] = Math.max(-A.get(ind) + after[0][k], after[1][k]);
                    }else{
                        curr[buy][k] = Math.max(A.get(ind) + after[1][k-1], after[0][k]);
                    }
                }
            }
            after = curr;
        }
        return after[1][2];
    }
}
