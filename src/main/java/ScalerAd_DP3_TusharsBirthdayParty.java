import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        int maxCap = Collections.max(A);
        int i = B.size();
        int j = maxCap;
        long[][] dp = new long[i+1][j+1];
        for(long[] row: dp){
            Arrays.fill(row, -1);
        }
        long ans = 0;
        for(int k=0 ; k<A.size(); k++){
            ans += find(i, A.get(k), dp, B, C);
        }
        return (int)ans;
    }

    public long find(int i, int j, long[][] dp, List<Integer> B, List<Integer> C){
        if(j == 0){
            return 0;
        }
        if(i == 0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if (j >= B.get(i - 1)) {
            dp[i][j] = Math.min(find(i - 1, j, dp, B, C), C.get(i - 1) + find(i, j - B.get(i - 1), dp, B, C));
        } else {
            dp[i][j] = find(i - 1, j, dp, B, C);
        }
        return dp[i][j];
    }

}
