public class ScalerAd_DP4_DistinctSubsequences {
    public static void main(String[] args) {
        ScalerAd_DP4_DistinctSubsequences s = new ScalerAd_DP4_DistinctSubsequences();
//        System.out.println(s.numDistinct("abc", "abc"));
        System.out.println(s.numDistinct("rabbbit", "rabbit"));
    }
    public int numDistinct(String A, String B) {
        int N = A.length();
        if(A.equals(B)){
            return 1;
        }
        int count = 0;
        for(int i=N-1; i>=0; i--){
            String C = A.substring(0, i)+A.substring(i+1, N);
            if(C.equals(B)){
                count++;
            }
        }
        return count;
    }
}
