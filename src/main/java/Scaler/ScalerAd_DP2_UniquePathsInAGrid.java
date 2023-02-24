package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP2_UniquePathsInAGrid {
    public static void main(String[] args) {
        ScalerAd_DP2_UniquePathsInAGrid s = new ScalerAd_DP2_UniquePathsInAGrid();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        arr.add(new ArrayList<>(Arrays.asList(0,0,0)));
//        arr.add(new ArrayList<>(Arrays.asList(0,1,0)));
//        arr.add(new ArrayList<>(Arrays.asList(0,0,0)));

        arr.add(new ArrayList<>(Arrays.asList(0,0,0)));
        arr.add(new ArrayList<>(Arrays.asList(1,1,1)));
        arr.add(new ArrayList<>(Arrays.asList(0,0,0)));
        System.out.println(s.uniquePathsWithObstacles(arr));
    }
    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        //in this question, 1 means obstacles, 0 means no obstacles.
        //so, for no confusion, firstly convert the 0 to 1 and 1 to 0 which is 1-value
        //now apply the bottom up approach
        //firstly fill all the first row
        //then fill all the first cols of each row
        //then fill the remaining cols of matrix
        int N = A.size();
        int M = A.get(0).size();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int val = A.get(i).get(j);
                //to convert 1 to 0, and 0 to 1
                A.get(i).set(j, 1-val);
            }
        }

//        int[][] dp = new int[N][M];
//        //fill all the values to -1 initially
//        for(int[] row: dp){
//            Arrays.fill(row, -1);
//        }
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        //fill all the values to -1 initially
        for(int i=0; i<N; i++) {
            ArrayList<Integer> dprows = new ArrayList<>();
            for (int j = 0; j<M; j++) {
                dprows.add(j, -1);
            }
            dp.add(i, dprows);
        }

        dp.get(0).set(0, A.get(0).get(0));
        //dp[0][0] = A.get(0).get(0);


        //now firstly fill first row of matrix
        for(int j=1; j<M; j++){
            if(A.get(0).get(j) == 0){
                dp.get(0).set(j, 0);
                //dp[0][j] = 0;
            }else{
                dp.get(0).set(j, dp.get(0).get(j-1));
                //dp[0][j] = dp[0][j-1];
            }
        }

        //now fill out first col of each rows of matrix
        for(int i=1; i<N; i++){
            if(A.get(i).get(0) == 0){
                dp.get(i).set(0, 0);
                //dp[i][0] = 0;
            }else{
                dp.get(i).set(0, dp.get(i-1).get(0));
                //dp[i][0] = dp[i-1][0];
            }
        }

        //now fill out the remaining cols of matrix
        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                if(A.get(i).get(j) == 0){
                    dp.get(i).set(j, 0);
                    //dp[i][j] = 0;
                }else{
                    dp.get(i).set(j, dp.get(i-1).get(j) + dp.get(i).get(j-1));
                    //dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        //return dp[N-1][M-1];
        return dp.get(N-1).get(M-1);

    }
}
