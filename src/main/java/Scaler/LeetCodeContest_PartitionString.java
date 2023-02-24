package Scaler;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeContest_PartitionString {
    public static void main(String[] args) {
        //System.out.println(partitionString("abacaba"));
        System.out.println(partitionString("ssssss"));
    }

    public static int partitionString(String s) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int ascii = s.charAt(i);
            if(!hm.containsKey(ascii)){
                hm.put(ascii, 1);
            }else{
                System.out.println(hm);
                System.out.println(ascii);
                hm.clear();
                hm.put(ascii, 1);
                count++;
                System.out.println("count="+count);
            }
        }
        System.out.println(hm);
        if(hm.isEmpty()){
            return count;
        }else{
            return count+1;
        }

    }
}
