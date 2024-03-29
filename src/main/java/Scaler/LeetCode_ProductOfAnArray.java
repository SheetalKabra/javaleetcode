package Scaler;

public class LeetCode_ProductOfAnArray {
    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
    }
    public static int arraySign(int[] nums) {
        int countnegative = 0;
        for(int i=0; i < nums.length; i++){
            if(nums[i] < 0){
                countnegative++;
            }else if(nums[i] == 0){
                return 0;
            }
        }
        if(countnegative % 2 != 0){
            return -1;
        }
        return 1;
    }
}
