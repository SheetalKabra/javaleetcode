package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP2_MinSumPathInMatrix {
    public static void main(String[] args) {
        ScalerAd_DP2_MinSumPathInMatrix s = new ScalerAd_DP2_MinSumPathInMatrix();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1,3,2)));
        arr.add(new ArrayList<>(Arrays.asList(4,3,1)));
        arr.add(new ArrayList<>(Arrays.asList(5,6,1)));

//        arr.add(new ArrayList<>(Arrays.asList(1,-3,2)));
//        arr.add(new ArrayList<>(Arrays.asList(2,5,10)));
//        arr.add(new ArrayList<>(Arrays.asList(5,-5,1)));
        System.out.println(s.minPathSum(arr));
    }
    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        //1. first fill out the first row
        //2. then fill out the first cols of each row
        //3. then fill out the remaining ones
        int N = A.size();
        int M = A.get(0).size();
        //ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        int[][] dp = new int[N][M];

        //fill out all values to -1 default
//        for(int i=0; i<N; i++){
//            ArrayList<Integer> dprows = new ArrayList<>();
//            for(int j=0; j<M; j++){
//                dprows.add(j, -1);
//            }
//            dp.add(i, dprows);
//        }

        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], -1);
        }

        //dp.get(0).set(0, A.get(0).get(0));
        dp[0][0] = A.get(0).get(0);
        //now fill out first row
        for(int i=1; i<M; i++){
            //int val = A.get(0).get(i) + dp.get(0).get(i-1);
            //dp.get(0).set(i, val);
            int val = A.get(0).get(i) + dp[0][i-1];
            dp[0][i] = val;
        }
        //now fill out cols of each row
        for(int i=1; i<N; i++){
//            int val = A.get(i).get(0) + dp.get(i-1).get(0);
//            dp.get(i).set(0, val);
            int val = A.get(i).get(0) + dp[i-1][0];
            dp[i][0] = val;
        }
        //now fill out the remaining cols
        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
//                int val = A.get(i).get(j) + Math.min(dp.get(i-1).get(j), dp.get(i).get(j-1));
//                dp.get(i).set(j, val);
                int val = A.get(i).get(j) + Math.min(dp[i-1][j], dp[i][j-1]);
                dp[i][j] = val;
            }
        }
        //return dp.get(N-1).get(M-1);
        return dp[N-1][M-1];
    }
}
