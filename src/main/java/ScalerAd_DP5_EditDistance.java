import java.util.Arrays;

public class ScalerAd_DP5_EditDistance {
    public static void main(String[] args) {
        ScalerAd_DP5_EditDistance s  = new ScalerAd_DP5_EditDistance();
        System.out.println(s.minDistance(
                "baababaabababbaaabbbbbbababaaabbbbbbbabbabbababaaaabbbbabbbabaaababbabbbbabbabaaaabababaaabbaababbababbaabbabaabaaabaaaaaabbaaababbabbbaababbbbbbbababaaabaabbabbaaba",
                "aaabababbbaaabaaaabbaabababbbababbabaabbbbbaabbabbabaaababbaaaabaaababaabaabaaaaabbbaababbabaabaaaaabbaabaaabbbbbbbabbbababaabaaaabaabaaabbbbbbabbbbbabaaababbaaabbbabbabbaabaaababaaaabbbbabaababbbaabbbbaabbbbbaaabbbbaaababbbaaaabbbbbbbbabbbabaabbabbbabaabbbbbbaabbabaabbbbbabbabbabbaabbbabbaaabaaababbaabaababbaabbaaabababbbaabbbbabaabbaababbabbabbabbbababaaaaaaaaaaaaaaaaabbaababbaaaabbbaaabbbbaabaaaaabaaabbbaabaaaababbaaba"));
    }
    public int minDistance(String A, String B) {
        int N = A.length();
        int M = B.length();
        int[][] dp = new int[N+1][M+1];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i], -1);
        }
        return mincost(N, M, A, B, dp);

    }

    public int mincost(int N, int M, String A, String B, int[][] dp){
        if(N == 0 && M == 0){
            return 0;
        }
        if(N == 0 && M != 0){
            //we need to insert M characters into A String, and we have insert cost is 1, so M*1;
            return M*1;
        }
        if(N != 0 && M == 0){
            //we need to delete the remaining characters from A string, and delete code is 1, so N*1:
            return N*1;
        }
        if(dp[N][M] != -1){
            return dp[N][M];
        }
        //if characters of A[N-1] and B[M-1] is equal, then we shift to N-1 and M-1 without applying any cases/operations:
        if(A.charAt(N-1) == B.charAt(M-1)){
            return dp[N][M] = mincost(N-1, M-1, A, B, dp);
        }
        //if characters of of A[N-1] and B[M-1] is not equal, then we have 3 cases on this:
        //1. either insert -> it will become the (N, M-1) case, also we need to add 1(because insertion cost is 1)
        //2. or update -> it will become the (N-1,M-1) case, also we need to add 1(because updation cost is 1)
        //3. or delete -> it will become the (N-1, M) case, also we need to add 1(because deletion cost is 1)
        return dp[N][M] = Math.min(1+mincost(N, M-1, A, B, dp), Math.min(1+mincost(N-1, M-1, A, B, dp), 1+mincost(N-1, M, A, B, dp)));
    }
}
