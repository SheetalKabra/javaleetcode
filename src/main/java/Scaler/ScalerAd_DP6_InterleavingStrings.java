package Scaler;

public class ScalerAd_DP6_InterleavingStrings {
    public static void main(String[] args) {
        ScalerAd_DP6_InterleavingStrings s = new ScalerAd_DP6_InterleavingStrings();
//        System.out.println(s.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
//        System.out.println(s.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        System.out.println(s.isInterleave("x", "y", "x"));
    }
    public int isInterleave(String A, String B, String C) {
        int i = A.length();
        int j = B.length();
        int k = C.length();
        return ways(i-1, j-1, k-1, A, B, C) ? 1 : 0;
    }

    public boolean ways(int i, int j, int k, String A, String B, String C){
        if(k<0 && (i>=0 || j>=0)){
            return false;
        }
        if(i < 0 && j < 0 && k < 0){
            return true;
        }
        if(i < 0 && j < 0){
            //System.out.println("false: i:"+i+", j:"+j+", k:"+k);
            return false;
        }
        if(i < 0){
            //System.out.println("i less tha 0");
            if(B.charAt(j) != C.charAt(k)){
                return false;
            }else{
                return ways(i, j-1, k-1, A, B, C);
            }
        }else if(j<0){
            //System.out.println("j less tha 0: i " + i+", k:"+k);
            if(A.charAt(i) != C.charAt(k)){
                //System.out.println("false:");
                return false;
            }else{
                //System.out.println("else:");
                return ways(i-1, j, k-1, A, B, C);
            }
        }

        if(A.charAt(i) != C.charAt(k) && B.charAt(j) != C.charAt(k)){
            //System.out.println("straight forward false;");
            return false;
        }
        if(A.charAt(i) == C.charAt(k) && B.charAt(j) != C.charAt(k)){
            //System.out.println("A equals: i:" + i +", k:"+k);
            return ways(i-1, j, k-1, A, B, C);
        }
        if(A.charAt(i) != C.charAt(k) && B.charAt(j) == C.charAt(k)){
            //System.out.println("B equals: j:" + j +", k:"+k);
            return ways(i, j-1, k-1, A, B, C);
        }
//        if(A.charAt(i) == C.charAt(k) && B.charAt(j) == C.charAt(k)){
//
//        }
        //System.out.println("Both equals: i:" + i +", j: "+j+", k:"+k);
        return ways(i-1, j, k-1, A, B, C) || ways(i, j-1, k-1, A, B, C);
    }

}
