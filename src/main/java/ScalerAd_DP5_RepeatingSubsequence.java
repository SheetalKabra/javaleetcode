import java.util.*;

public class ScalerAd_DP5_RepeatingSubsequence {
    public static void main(String[] args) {
        ScalerAd_DP5_RepeatingSubsequence s = new ScalerAd_DP5_RepeatingSubsequence();
//        System.out.println(s.anytwo("QcxJOfXJbd"));
//        System.out.println(s.anytwo("abcfaj"));
//        System.out.println(s.anytwo("abba"));
//        System.out.println(s.anytwo("abab"));
        System.out.println(s.anytwo("wrBqHDrOKyiDSdrMwrsylBFacyEDGxPLRlNPPFkoKCqNNUwSMbUcjiSmKtXXvrbjtsFZfMFdRSFBNVhfSqwQ"));

    }
    public int anytwo(String A) {
        int N = A.length();
        if(N <= 2){
            return 0;
        }

        int[][] dp = new int[N+1][N+1];
        for(int i=0; i<=N; i++){
            Arrays.fill(dp[i], -1);
        }
//        String[] dp = new String[];
        return ways(N, 0, A, A, dp) ? 1 : 0;

    }

    public boolean ways(int N, int i, String orig, String A, int[][] dp){
        N = A.length();
        System.out.println("N:"+N+", i:"+i+", A:"+A);
        if(i == A.length()){
            return false;
        }

        if(A.length() == 4 || A.length() == 3){
            //check
            Set<String> set = new HashSet<>();
            Map<Character, Integer> map= new HashMap<>();
            for(int j=0; j<A.length(); j++){
                if(map.containsKey(A.charAt(j))){
                    map.put(A.charAt(j), map.get(A.charAt(j))+1 );
                }else{
                    map.put(A.charAt(j), 1 );
                }
            }
            for(int j=0; j<A.length(); j++){

                for(int k=j+1; k<A.length(); k++){
                    if(j==0){
                        String first = String.valueOf(A.charAt(j));
                        set.add(first+A.charAt(k));
//                        System.out.println(set);
                    }else{
                        String first = String.valueOf(A.charAt(j));
                        if(set.contains(first+A.charAt(k)) && (map.size() == 2 || map.size() ==1)){
//                            System.out.println("contains string:"+ first+A.charAt(k));
//                            System.out.println(set);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
//        if(dp[N][i] != -1) {
//            System.out.println("dp:"+ Arrays.toString(dp[N]));
//            return dp[N][i] == 1;
//        }

        boolean remove = ways(N, i, orig,A.substring(0, i)+A.substring(i+1, N), dp);
        boolean notremove = ways(N, i+1, orig, A, dp);
        dp[N][i] = remove || notremove ? 1 : 0;
        return dp[N][i] == 1;
    }

}
