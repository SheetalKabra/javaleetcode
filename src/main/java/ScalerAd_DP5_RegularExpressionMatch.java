import java.util.Arrays;

public class ScalerAd_DP5_RegularExpressionMatch {
    public static void main(String[] args) {
        ScalerAd_DP5_RegularExpressionMatch s = new ScalerAd_DP5_RegularExpressionMatch();
//        System.out.println(s.isMatchTopDown("aaa", "a*"));
//        System.out.println(s.isMatchTopDown("acz", "a?a"));
//        System.out.println(s.isMatchTopDown("abcdef", "ab*"));
        System.out.println(s.isMatch("aaa", "a*"));
    }

    public int isMatch(final String A, final String B) {
        int N = A.length();
        int M = B.length();
        int[] prev = new int[M+1];
        int[] curr = new int[M+1];
        for(int i=0; i<=M; i++){
            if(B.charAt(i-1) == '*'){
                prev[i] = 1;
            }else{
                break;
            }
        }
        prev[0] = 1;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(B.charAt(j-1) == '?' || A.charAt(i-1) == B.charAt(j-1)){
                    curr[j] = prev[j-1];
                }else if(B.charAt(j-1) == '*'){
                    curr[j] = prev[j] == 1 || curr[j-1] == 1 ? 1 : 0;
                }else{
                    curr[j] = 0;
                }
            }
            prev[0] = 0;
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[M];
    }
    public int isMatchTopDown(final String A, final String B) {
        int N = A.length();
        StringBuilder B_optimised = new StringBuilder();
        B_optimised.append(B.charAt(0));
        for(int i=1;i<B.length();++i){
            if(B.charAt(i) == '*' && B.charAt(i-1)== '*' ){ continue; }
            B_optimised.append(B.charAt(i));
        }
        int M = B_optimised.length();
        int[][] dp = new int[N+1][M+1];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i], -1);
        }
        matches(N, M, A, String.valueOf(B_optimised), dp);
        return dp[N][M];
    }

    public boolean matches(int N, int M, String S, String P, int[][] dp){
        if(N == 0 && M == 0){
            return true;
        }
        if(N != 0 && M == 0){
            return false;
        }
        if(N == 0 && M != 0){
            //check for M if it has all *
            for(int i=0; i<M; i++){
                if(P.charAt(i) != '*'){
                    return false;
                }
            }
            return true;
        }
        if(dp[N][M] != -1){
            return dp[N][M] == 1;
        }
        if(P.charAt(M-1) == '?' || S.charAt(N-1) == P.charAt(M-1)){
            dp[N][M] = matches(N-1, M-1, S, P, dp) ? 1 : 0;
            return dp[N][M] == 1;
        }
        if(P.charAt(M-1) == '*'){
            dp[N][M] = (matches(N-1, M, S, P, dp) || matches(N, M-1, S, P, dp)) ? 1 : 0;
            return dp[N][M] == 1;
        }
        if(S.charAt(N-1) != P.charAt(M-1)){
            dp[N][M] = 0;
            return false;
        }
        return false;
    }
}
