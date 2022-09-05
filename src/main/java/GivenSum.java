public class GivenSum {

    public static void main(String[] args) {
//        System.out.println( missingNumber(new int[]{3,0,1}));
//        System.out.println( missingNumber(new int[]{1,2}));
//        System.out.println( missingNumber(new int[]{1,3,0,4}));

        System.out.println( missingNumberXOR(new int[]{3,0,1}));
        System.out.println( missingNumberXOR(new int[]{1,2}));
        System.out.println( missingNumberXOR(new int[]{1,3,0,4}));
    }
    public static int missingNumber(int[] nums) {
        //1. get the sum of n numbers i.e, totalsum = n(n+1)/2
        //2. givenSum = Do the sum of given numbers.
        //3. to get the missing number: subtract totalSum - givenSum
        int givenSum = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            givenSum =  (givenSum + nums[i]) ;
            sum += i;
        }
        return sum+nums.length - givenSum ;
    }
    public int missingNumber1(int[] nums) {
        //1. get the sum of n numbers i.e, totalsum = n(n+1)/2
        //2. givenSum = Do the sum of given numbers.
        //3. to get the missing number: subtract totalSum - givenSum
        int givenSum = 0;
        for(int i=0; i<nums.length; i++){
            givenSum = givenSum + nums[i];
        }
        return (nums.length*(nums.length+1)/2) - givenSum;
    }
    public static int missingNumberXOR(int[] nums) {
        //1. get the sum of n numbers i.e, totalsum = n(n+1)/2
        //2. givenSum = Do the sum of given numbers.
        //3. to get the missing number: subtract totalSum - givenSum
        int givenSum = 0;
        for(int i=1; i<=nums.length; i++){
            givenSum =  givenSum ^ i ^ nums[i-1];
        }
        return givenSum;
    }


    class Solution {
        public int missingNumber(int[] nums) {
            //1. get the sum of n numbers i.e, totalsum = n(n+1)/2
            //2. givenSum = Do the sum of given numbers.
            //3. to get the missing number: subtract totalSum - givenSum
            int givenSum = 0;
            for(int i=0; i<nums.length; i++){
                givenSum = (givenSum + nums[i]) - i;
            }
            //givenSum -1;
            return (nums.length*(nums.length+1)/2) - givenSum;
        }
    }
}