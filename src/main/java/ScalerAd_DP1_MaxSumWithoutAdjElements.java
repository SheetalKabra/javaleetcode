import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP1_MaxSumWithoutAdjElements {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

//        arr.add(new ArrayList<>(Arrays.asList(1)));
//        arr.add(new ArrayList<>(Arrays.asList(2)));

        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        arr.add(new ArrayList<>(Arrays.asList(2, 3, 4, 5)));


        System.out.println(arr);
        ScalerAd_DP1_MaxSumWithoutAdjElements a = new ScalerAd_DP1_MaxSumWithoutAdjElements();
        System.out.println(a.adjacent(arr));
    }
    public int adjacent(ArrayList<ArrayList<Integer>> A) {
        int N = A.get(0).size();
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        dp[0] = Math.max(A.get(0).get(0), A.get(1).get(0));
        if(N > 1){

            int maxele1 = Math.max(A.get(0).get(0), A.get(1).get(0));
            int maxele2 = Math.max(A.get(0).get(1), A.get(1).get(1));
            dp[1] = Math.max(maxele1, maxele2);
        }
        return maxSum(N-1, A, dp);
    }

    public int maxSum(int N, ArrayList<ArrayList<Integer>> A, int[] dp){
        if(N <= 0){
            return dp[N];
        }
        if(dp[N] != -1){
            return dp[N];
        }
        int elem1 = maxSum(N-2, A, dp) + Math.max(A.get(0).get(N), A.get(1).get(N));
        int elem2 = maxSum(N-1, A, dp);
        int ans = Math.max(elem1, elem2);
        dp[N] = ans;

        return ans;
    }

}
