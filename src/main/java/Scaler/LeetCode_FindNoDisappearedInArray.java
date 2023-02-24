package Scaler;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_FindNoDisappearedInArray {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> B = new ArrayList<>();
        int N = nums.length;
        for(int i=0; i<N; i++){
            //System.out.println(nums[i]-1);
            nums[Math.abs(nums[i]) - 1] = -(Math.abs(nums[Math.abs(nums[i])-1]));
        }

        for(int i=0; i<N; i++){
            if(nums[i] >0 ){
                B.add(i+1);
            }
        }
        return B;
    }
}
