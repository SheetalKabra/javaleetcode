import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP2_DungeonPrincess {
    public static void main(String[] args) {
        ScalerAd_DP2_DungeonPrincess s = new ScalerAd_DP2_DungeonPrincess();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        arr.add(new ArrayList<>(Arrays.asList(-2, -3, 3)));
//        arr.add(new ArrayList<>(Arrays.asList(-5, -10, 1)));
//        arr.add(new ArrayList<>(Arrays.asList(10, 30, -5)));

//        arr.add(new ArrayList<>(Arrays.asList(1,-1,0)));
//        arr.add(new ArrayList<>(Arrays.asList(-1, 1, -1)));
//        arr.add(new ArrayList<>(Arrays.asList(1, 0, -1)));


  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));
  arr.add(new ArrayList<>(Arrays.asList(-100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100, -100)));

        System.out.println(s.calculateMinimumHP(arr));
    }
    public int calculateMinimumHP(ArrayList<ArrayList<Integer>> A) {
        //for this we will start from the bottom, as they want how many min energy required to enter into matrix,
        //so if A[N-1][M-1] <= 0, then for A[N-1][M-1] min energy required is 1 - A[N-1][M-1],
        //else simply put min energy that is 1
        // now firstly fill out last cols of each row:
        //dp[i][j] = max(1, dp[i+1][j] - A.get(i).get(j));
        //now fill out last row:
        //dp[i][j] = max(1, dp[i][j+1] - A.get(i).get(j));
        //now fill out the remaining cols:
        //dp[i][j] = max(1, min(dp[i+1][j], dp[i][j+1]) - A.get(i).get(j));

        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        //fill out all values to -1 initially
        for(int i=0; i<N; i++){
            ArrayList<Integer> dprows = new ArrayList<>();
            for(int j=0; j<M; j++){
                dprows.add(j, -1);
            }
            dp.add(i, dprows);
        }
        int val = Math.max(1, (1 - A.get(N-1).get(M-1)));
        dp.get(N-1).set(M-1, val);
        //now firstly fill out last cols of each row:
        for(int i=N-2; i>=0; i--){
            val = Math.max(1, (dp.get(i+1).get(M-1) - A.get(i).get(M-1)));
            dp.get(i).set(M-1, val);
        }
        //now fill out last row:
        for(int j=M-2; j>=0; j--){
            val = Math.max(1, (dp.get(N-1).get(j+1) - A.get(N-1).get(j)));
            dp.get(N-1).set(j, val);
        }
        //now fill out the remaining cols:
        for(int i=N-2; i>=0; i--){
            for(int j=M-2; j>=0; j--){
                int minEnergy = Math.min(dp.get(i).get(j+1), dp.get(i+1).get(j));
                val = Math.max(1, (minEnergy - A.get(i).get(j)));
                dp.get(i).set(j, val);
            }
        }
        System.out.println("dp:"+dp);
        return dp.get(0).get(0);
    }
}
