package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_TwoPointer_ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new ArrayList<>(Arrays.asList(1,5,4,3))));
        System.out.println(maxArea(new ArrayList<>(Arrays.asList(1))));
    }

    public static int maxArea(ArrayList<Integer> A) {
        int N = A.size();
        int l = 0;
        int r = N - 1;
        int max = Integer.MIN_VALUE;
        int h = 0;
        int w = 0;
        if(N == 1){
            return 0;
        }
        while (l < r) {
            h = Math.min(A.get(l), A.get(r));
            w = Math.abs(r - l);
            if (A.get(l) < A.get(r)) {
                max = Math.max(max, h * w);
                l++;
            } else if (A.get(r) < A.get(l)) {
                max = Math.max(max, h * w);
                r--;
            } else {
                max = Math.max(max, h * w);
                l++;
            }
        }
        return max;
    }
}
