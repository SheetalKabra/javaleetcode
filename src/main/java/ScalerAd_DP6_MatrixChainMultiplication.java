import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ScalerAd_DP6_MatrixChainMultiplication {
    public static void main(String[] args) {
        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);
        ScalerAd_DP6_MatrixChainMultiplication s1 = new ScalerAd_DP6_MatrixChainMultiplication();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(10,20,30))));
        System.out.println(s1.solve(new ArrayList<>(Arrays.asList(40, 20, 30, 10, 30))));
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int[][] dp = new int[N][N];
        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], -1);
        }
        return minops(A, 0, N-2, dp);
    }

    public int minops(ArrayList<Integer> A, int left, int right, int[][] dp){
        if(left == right){
            return 0;
        }
        if(dp[left][right] != -1){
            return dp[left][right];
        }
        int ans = Integer.MAX_VALUE;
        for(int p=left+1; p<=right; p++){
            int cl = minops(A, left, p-1, dp);
            int cr = minops(A, p, right, dp);
            int cost = A.get(left)*A.get(p)*A.get(right+1);
            dp[left][right] = ans = Math.min(ans, cl+cr+cost);
        }
        return ans;
    }



}


