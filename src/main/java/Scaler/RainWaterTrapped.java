package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RainWaterTrapped {
    public static void main(String[] args) {
        System.out.println(trap(new ArrayList<>(Arrays.asList(56, 6, 52, 43, 23, 47, 48, 38, 96, 46, 30, 66, 80, 15, 62, 71, 61, 12, 98, 9, 28, 81, 70, 59, 95, 34, 9, 60, 70, 81, 71, 67, 58, 20, 22, 3, 95, 85, 20, 24, 74, 5, 23, 33, 75, 50, 38, 75, 68, 26, 46, 30, 75, 18, 4, 42, 51, 59, 8, 77))));
    }

    public static int trap(final List<Integer> A) {
        System.out.println("A:"+A);
        int N = A.size();
        //1. create a prefix array from left having left most element should be max
        //2. create a prefix array from right having right most element should be max
        List<Integer> leftMax = new ArrayList<>();
        List<Integer> rightMax = new ArrayList<>();
        leftMax.add(0, A.get(0));
        rightMax.add(0, 0);
        for(int i=1; i<N; i++){
            if(A.get(i) > leftMax.get(i-1)){
                leftMax.add(i, A.get(i));
            }else{
                leftMax.add(i, leftMax.get(i-1));
            }
            rightMax.add(i, 0);
        }

        rightMax.set(N-1, A.get(N-1));
        for(int i=N-2; i>=0; i--){
            if(A.get(i) > rightMax.get(i+1)){
                rightMax.set(i, A.get(i));
            }else{
                rightMax.set(i, rightMax.get(i+1));
            }
        }
        System.out.println("l:"+leftMax);
        System.out.println("r:"+rightMax);
//        System.out.println(A.size());
//        System.out.println(leftMax.size());
//        System.out.println(rightMax.size());
        //now take the min from leftMax and rightMax - current value
        //we will start the loop from 1 to n-2
        //why not from 0 to n-1 -> because there is a sea before the first and last building. So water will not trap there
        int trapWaterSum = 0;
        int sum;
        int minOfMax;
        for(int i=1; i<=N-2; i++){
            if(leftMax.get(i-1) > rightMax.get(i+1)){
                minOfMax = rightMax.get(i+1);
            }else{
                minOfMax = leftMax.get(i-1);
            }
            sum = minOfMax - A.get(i);
            if(sum > 0){
                trapWaterSum += sum;
            }
            //System.out.println(trapWaterSum);
        }
        return trapWaterSum;
    }
}
