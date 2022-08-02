public class TwoSum {
    public static void main(String[] args) {
        TwoSum t = new TwoSum();
//        int[] op = t.twoSum(new int[]{2,7,11,15}, 9);
        int[] op = t.twoSum(new int[]{3,2,4}, 6);
        for(int i=0; i<op.length; i++){
            System.out.print(op[i]+", ");
        }

    }
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        for(int i=0; i<=N-2; i++){
            for(int j=i+1; j<=N-1; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
