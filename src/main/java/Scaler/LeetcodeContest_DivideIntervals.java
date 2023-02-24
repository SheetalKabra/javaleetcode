package Scaler;

import java.util.Arrays;
import java.util.HashSet;

public class LeetcodeContest_DivideIntervals {
    public static void main(String[] args) {
        System.out.println(minGroups(new int[][]{{5,10},{6,8},{1,1},{2,3},{1,10}}));
    }
    public static int minGroups(int[][] intervals) {
        int[] arr = new int[intervals.length];
        Arrays.fill(arr, 0);
        int group = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ;i<intervals.length; i++){
            if(arr[i] != -1){
                set.add(intervals[i][0]);
                set.add(intervals[i][1]);
                arr[i] = -1;
            }

            for(int j=i+1; j<intervals.length;j++){
                if(arr[j] != -1){
                    if(set.contains(intervals[j][0]) && set.contains(intervals[j][1])){
                        set.clear();
                        arr[j] = -1;
                        set.add(intervals[j][0]);
                        set.add(intervals[j][1]);
                        group++;
                    }else{
                        arr[j] = -1;
                        set.add(intervals[j][0]);
                        set.add(intervals[j][1]);

                    }
                }
            }


        }
        System.out.println("final set:"+set);
        return group;
    }
}
