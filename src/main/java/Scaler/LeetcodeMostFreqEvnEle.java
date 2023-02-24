package Scaler;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeMostFreqEvnEle {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290}));
        System.out.println(mostFrequentEven(new int[]{1,2,2,4,4,1,0,0,0,0}));
        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[]{4,4,4,9,2,4}));
        System.out.println(mostFrequentEven(new int[]{29,47,21,41,13,37,25,7}));
    }
    public static int mostFrequentEven(int[] nums) {
        int N = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            if(nums[i] %2 == 0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i])+1);
                }else{
                    map.put(nums[i], 1);
                }
            }
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;
        int freq = 0;
        int maxElem = -1;
        for(Map.Entry<Integer, Integer> set: map.entrySet()){
            //set.getKey
            //set.getValue
            if (set.getValue() > freq){
                freq = set.getValue();
                maxElem = set.getKey();
            }else if(set.getValue() == freq){
                maxElem = Math.min(set.getKey(), maxElem);
            }

        }

        return maxElem;
    }
}
