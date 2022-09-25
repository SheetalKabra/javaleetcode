public class KadanesAlgo {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        //using Kadanes
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            max = Math.max(max, sum);
            System.out.println("i:"+i+", max:"+max+", sum:"+sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
