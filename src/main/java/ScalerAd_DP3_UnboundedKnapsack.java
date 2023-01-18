import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP3_UnboundedKnapsack {
    public static void main(String[] args) {
        ScalerAd_DP3_UnboundedKnapsack  s = new ScalerAd_DP3_UnboundedKnapsack();
        System.out.println(s.solve(8, new ArrayList<>(Arrays.asList(2,3,5)), new ArrayList<>(Arrays.asList(3,4,7))));
//        System.out.println(s.solve(10, new ArrayList<>(Arrays.asList(5)), new ArrayList<>(Arrays.asList(10))));
//        System.out.println(s.solve(10, new ArrayList<>(Arrays.asList(6,7)), new ArrayList<>(Arrays.asList(5,5))));
    }
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int N = B.size();
        int[][] dp = new int[N+1][A+1];
        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], -1);
        }
        return ways(N-1, A, B, C, dp);

    }

    public int ways(int N, int C, ArrayList<Integer> val, ArrayList<Integer> wt, int[][] dp){
        if(N < 0 || C == 0){
            return 0;
        }
        if(dp[N][C] != -1){
            return dp[N][C];
        }
        int notPick = ways(N-1, C, val, wt, dp);
        int pick = -1;
        if(C >= wt.get(N)){
            pick = val.get(N) + ways(N, C - wt.get(N), val, wt, dp);
        }
        return dp[N][C] = Math.max(pick, notPick);
    }
}
