import java.util.Arrays;

public class ScalerAd_DP5_LongestCommonSubseq {
    public static void main(String[] args) {
        ScalerAd_DP5_LongestCommonSubseq s = new ScalerAd_DP5_LongestCommonSubseq();
//        System.out.println(s.solve("abbcdgf", "bbadcgf"));
//        System.out.println(s.solve("aaaaaa", "ababab"));
        System.out.println(s.solve("bebdeeedaddecebbbbbabebedc", "abaaddaabbedeedeacbcdcaaed"));
    }

    public int solve(String A, String B) {
        int N = A.length();
        int M = B.length();
        int[][] dp = new int[N+1][M+1];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i], -1);
        }
        return LCS(N, M, A, B, dp);
    }

    public int LCS(int N, int M, String A, String B, int[][] dp){
        if(N == 0 || M == 0){
            return 0;
        }
        if(dp[N][M] != -1){
            return dp[N][M];
        }
        if(A.charAt(N-1) == B.charAt(M-1)){
            return dp[N][M] = 1+LCS(N-1, M-1, A, B, dp);
        }
        return dp[N][M] = Math.max(LCS(N-1, M, A, B, dp) , LCS(N, M-1, A, B, dp));
    }
}
