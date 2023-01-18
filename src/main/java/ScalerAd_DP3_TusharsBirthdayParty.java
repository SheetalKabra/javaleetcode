import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScalerAd_DP3_TusharsBirthdayParty {
    public static void main(String[] args) {
        ScalerAd_DP3_TusharsBirthdayParty s = new ScalerAd_DP3_TusharsBirthdayParty();
        System.out.println(s.solve(
                new ArrayList<>(Arrays.asList(2,4,6)),
                new ArrayList<>(Arrays.asList(2,1,3)),
                new ArrayList<>(Arrays.asList(2,5,3))
        ));
    }
    public int solve(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int N = A.size();
        int mincost = 0;
        for(int i=0; i<N; i++){
            int[][] dp = new int[N+1][A.get(i)+1];

            for(int j=0; j<=N; j++){
                Arrays.fill(dp[j], -1);
            }
            System.out.println("before dp:");
            for(int k=0; k<=N; k++){
                System.out.println(Arrays.toString(dp[k]));
            }
            mincost += minways(N, A.get(i), C, B, dp);
            System.out.println("after dp:");
            for(int k=0; k<=N; k++){
                System.out.println(Arrays.toString(dp[k]));
            }
            System.out.println("mincost:"+mincost);
        }
        return mincost;
    }

    public int minways(int N, int C, List<Integer> cost, List<Integer> wt, int[][] dp){
        if(N == 0 || C == 0){
            return 0;
        }
        if(dp[N][C] != -1){
            System.out.println("here");
            return dp[N][C];
        }
        int ans = minways(N-1, C, cost, wt, dp);

        if(C - wt.get(N-1) >= 0){
            ans =  Math.min(ans, cost.get(N-1) + minways(N, C-wt.get(N-1), cost, wt, dp));
        }
        System.out.println("ans:"+ans);
        return dp[N][C] = ans;
    }

}
