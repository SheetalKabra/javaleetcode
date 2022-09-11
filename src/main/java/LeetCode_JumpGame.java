public class LeetCode_JumpGame {
    public static void main(String[] args) {
        Boolean answer = false;
        //System.out.println(solve(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}, 0, 12));
        System.out.println(solve(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}, 0));
        System.out.println(solve(new int[]{3, 2, 1, 0, 4}, 0));
        System.out.println(solve(new int[]{0, 3, 1, 1, 4}, 0));
        System.out.println(solve(new int[]{2, 3, 1, 1, 4}, 0));
        System.out.println(solve(new int[]{4,3,2,1,0,0,0,1,2,3}, 0));
        System.out.println(solve(new int[]{3,0,8,2,0,0,1}, 0));
//        System.out.println(solve2(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}, 0, 1, 12));
//        System.out.println(solve2(new int[]{3, 2, 1, 0, 4}, 0, 1, 5));
        //System.out.println(solve2(new int[]{0, 3, 1, 1, 4}, 0, 1, 5));
//        System.out.println(solve2(new int[]{4,3,2,1,0,0,2,3,3}, 0, 1, 9));
    }

    public static boolean canJump(int[] nums) {
        return solve(nums, 0);
    }

    public static boolean solve(int[] nums, int index) {
        int N = nums.length;
        if (nums[index] + index >= N - 1) {
            System.out.println("terminal condition");
            return true;
        }
        System.out.println("out: index:" + index + ", a[" + index + "]:" + nums[index]);
        for (int i = 1; i <= nums[index]; i++) {
            if (i + index < N/** && nums[i + index] != 0 **/) {
                boolean ans = solve(nums, i + index);
                if(ans == true){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solve1(int[] nums, int index, int N) {
        boolean answer = false;
        if (nums[index] + index >= N - 1) {
            System.out.println("terminal condition");
            answer = true;
        } else {
            System.out.println("out: index:" + index + ", a[" + index + "]:" + nums[index]);
            for (int i = 1; i <= nums[index]; i++) {
                if (i + index < N/** && nums[i + index] != 0 **/) {
                    answer = solve1(nums, i + index, N);
                }
            }
        }
        if (answer) {
            return answer;
        }
        return false;
    }


    public static boolean solve2(int[] nums, int index, int subIndex, int N) {
        System.out.println("index: " + index + "SubIndex: " + subIndex);
        if (index >= N - 1) {
            return false;
        }
        if (subIndex >= nums[index]) {
            index++;
            subIndex = 1;
            return solve2(nums, index, subIndex, N);
        }

        int sum = nums[subIndex] + subIndex;
        System.out.println("sum : "+sum);
        if (sum >= N-1) {
            System.out.println("nums[index]: " + nums[index] + "subIndex: " + subIndex);
            return true;
        }

        return solve2(nums, index, ++subIndex, N);
    }

//    public static boolean solve3(int[] nums, int N) {
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//        System.out.println("index: " + index + "SubIndex: " + subIndex);
//        if (index >= N - 1) {
//            return false;
//        }
//        if (subIndex >= nums[index]) {
//            subIndex = 1;
//            return solve3(nums, index, subIndex, N);
//        }
//
//        int sum = nums[subIndex] + subIndex;
//        System.out.println("sum : "+sum);
//        if (sum >= N-1) {
//            System.out.println("nums[index]: " + nums[index] + "subIndex: " + subIndex);
//            return true;
//        }
//
//        return solve3(nums, index, ++subIndex, N);
//    }


}
