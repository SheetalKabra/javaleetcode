import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScalerAd_DP3_FlipArray {
    int globalfc = Integer.MAX_VALUE;
    int globalSum = Integer.MAX_VALUE;

    public static void main(String[] args) {
        ScalerAd_DP3_FlipArray s = new ScalerAd_DP3_FlipArray();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(14, 10, 4))));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(15, 10, 6))));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(14, 10, 3))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(5, 4, 6, 8, 7, 2, 3))));
    }
    public int solve(final List<Integer> A) {
        int N = A.size();
        int sumOfValues = 0;
        for(int i=0; i<N; i++){
            sumOfValues += A.get(i);
        }
        int[][] dp = new int[N+1][sumOfValues+1];
        dp[0][0] = 0;
        for(int j=1; j<=sumOfValues; j++){
            dp[0][j] = Integer.MAX_VALUE;
        }
        for(int i=1; i<=N; i++){
            for(int j=0; j<=sumOfValues; j++){
                if(j == 0){
                    dp[i][j] = dp[i-1][j];
                }
                dp[i][j] = dp[i-1][j];
                //System.out.println("j - A.get(i-1):"+(j - A.get(i-1)));
                //System.out.println("i:"+i+", j:"+j+", A["+(i-1)+"]:"+A.get(i-1));
//                if(j - A.get(i-1) >= 0){
//                    System.out.println(", dp["+(i-1)+"]["+(j - A.get(i-1))+"]:"+dp[i-1][j - A.get(i-1)]);
//                }
                if(j - A.get(i-1) >=0 && dp[i-1][j - A.get(i-1)] != Integer.MAX_VALUE){
//                    System.out.println("j - A.get(i-1):"+(j - A.get(i-1)) + ", value:"+ dp[i-1][j - A.get(i-1)]);
//                    System.out.println("if::");
//                    System.out.println("j - A.get(i-1):"+(j - A.get(i-1)));
                    dp[i][j] = Math.min(dp[i][j], 1+dp[i-1][j - A.get(i-1)]);
                }
            }
        }
//        for(int i=0; i<=N; i++){
//            System.out.println(Arrays.toString(dp[i]));
//        }
        for(int i=sumOfValues; i>=0; i--){
            if(dp[N][i] != Integer.MAX_VALUE){
                //now T-x = dp[N][i]
                //we want to minimize (x - (T-x)) but its greater than 0
                //here x is +ve part
                //T-x is -ve part
                //so, x = TotalSum - (-ve part)
                int positivePart  = sumOfValues - i;
                int negativePart = i;
                if(positivePart - negativePart >= 0){
                    return dp[N][i];
                }
            }
        }
        return 0;
    }


//    public void ways(int N, int sum, int flipCount, List<Integer> A){
//        if(sum  >= 0){
//            if(sum < globalSum){
//                globalSum = sum;
//                globalfc = flipCount;
//            }else if(sum == globalSum){
//                globalfc = Math.min(globalfc, flipCount);
//            }
//        }
//        if(N < 0 || sum < 0){
//            return;
//        }
//
//        ways(N-1, sum, flipCount, A);
//        if(sum >= 2*A.get(N)){
//            ways(N-1, sum - 2*A.get(N), flipCount+1, A);
//        }
//    }
}
