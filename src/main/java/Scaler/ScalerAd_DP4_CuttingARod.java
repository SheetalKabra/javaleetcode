package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP4_CuttingARod {
    public static void main(String[] args) {
        ScalerAd_DP4_CuttingARod s = new ScalerAd_DP4_CuttingARod();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(3,4,1,6,2))));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1, 5, 2, 5, 6))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(2,5))));
    }
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int[] prev = new int[N+1];
        int[] curr = new int[N+1];
        //fill first row of prev
        prev[0] = 0;
        for(int i=1; i<=N;i ++){
            prev[i] = prev[i-1] + A.get(0);
        }
        System.out.println("prev initial :"+Arrays.toString(prev));
        for(int i=2; i<=N; i++){
            curr[0] = 0;
            for(int j=1; j<=N; j++){
                if(j-i >=0){
//                    System.out.println("here: i"+i +", j:"+j +", ==="+(A.get(i) + curr[j-i])+"===, prev"+prev[j]);
                    curr[j] = Math.max(prev[j], A.get(i-1) + curr[j-i]);
                }else{
                    curr[j] = prev[j];
                }
            }
            System.out.println("prev:"+Arrays.toString(prev));
            System.out.println("curr:"+Arrays.toString(curr));
            //now assign prev = curr, and curr back to -1
            for(int k=0; k<N+1; k++){
                prev[k] = curr[k];
                curr[k] = -1;
            }
        }
        return prev[N];
    }
}
