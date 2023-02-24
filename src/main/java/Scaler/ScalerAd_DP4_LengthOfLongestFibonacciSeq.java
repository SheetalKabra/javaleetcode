package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ScalerAd_DP4_LengthOfLongestFibonacciSeq {
    public static void main(String[] args) {
        ScalerAd_DP4_LengthOfLongestFibonacciSeq s = new ScalerAd_DP4_LengthOfLongestFibonacciSeq();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,3,7,11,12,14,18))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(8, 11, 20, 27, 33, 36))));
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            set.add(A.get(i));
        }
        int ans = 0;
        boolean matches = false;
        for(int i=0; i<N; i++){

            for(int j=i+1; j<N; j++){
                int prev = A.get(i);
                int curr = A.get(j);
                int sum = prev + curr;
                int length = 2;

                while(set.contains(sum)){
                    matches = true;
                    length++;
                    prev = curr;
                    curr = sum;
                    sum = prev + curr;
                }
                ans = Math.max(ans, length);
            }
        }
        return matches ? ans : 0;
    }
}
