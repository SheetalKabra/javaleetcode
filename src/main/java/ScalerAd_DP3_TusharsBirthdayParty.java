import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScalerAd_DP3_TusharsBirthdayParty {
    public static void main(String[] args) {
        ScalerAd_DP3_TusharsBirthdayParty s = new ScalerAd_DP3_TusharsBirthdayParty();
//        System.out.println(s.solve(
//                new ArrayList<>(Arrays.asList(2,4,6)),
//                new ArrayList<>(Arrays.asList(2,1,3)),
//                new ArrayList<>(Arrays.asList(2,5,3))
//        ));
//        System.out.println(s.solve(
//                new ArrayList<>(Arrays.asList(2)),
//                new ArrayList<>(Arrays.asList(1)),
//                new ArrayList<>(Arrays.asList(2))
//        ));
//        System.out.println(s.solve(
//                new ArrayList<>(Arrays.asList(2, 3, 1, 5, 4)),
//                new ArrayList<>(Arrays.asList(3, 2, 4, 1)),
//                new ArrayList<>(Arrays.asList(1, 2, 5, 10))
//        ));
        System.out.println(s.solve(
                new ArrayList<>(Arrays.asList(2, 3, 1, 5, 4)),
                new ArrayList<>(Arrays.asList(3, 2, 3, 4, 1, 1)),
                new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 10))
        ));
    }
    public int solve(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int N = A.size();
        int M = B.size();
        int mincost = 0;
        for(int i=0; i<N; i++){
            int[][] dp = new int[M+1][A.get(i)+1];
            for(int j=0; j<=M; j++){
                Arrays.fill(dp[j], -1);
            }
            mincost += minways(M, A.get(i), C, B, dp);
        }
        return mincost;
    }

    public int minways(int N, int C, List<Integer> cost, List<Integer> wt, int[][] dp){
        if(N == 0){
            return Integer.MAX_VALUE;
        }
        if(C == 0){
            return 0;
        }
        if(dp[N][C] != -1){
            return dp[N][C];
        }
        int ans = minways(N-1, C, cost, wt, dp);

        if(C - wt.get(N-1) >= 0){
            int pick = minways(N, C-wt.get(N-1), cost, wt, dp);
            if(pick != Integer.MAX_VALUE){
                pick += cost.get(N-1);
            }
            //int pick = cost.get(N-1) + minways(N, C-wt.get(N-1), cost, wt, dp) ;
            ans =  Math.min(ans, pick);
        }
        return dp[N][C] = ans;
    }

}
