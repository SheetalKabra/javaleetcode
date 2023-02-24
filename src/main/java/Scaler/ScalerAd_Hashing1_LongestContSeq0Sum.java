package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing1_LongestContSeq0Sum {
    public static void main(String[] args) {
        System.out.println(lszero(new ArrayList<>(Arrays.asList(1,2,-2,4,-4))));
    }
    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int N = A.size();
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int seq = 0;
        int start = -1;
        int end = -1;
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for(int i=0; i<N; i++){
            sum += A.get(i);
            if(hm.containsKey(sum)){
                seq = i - hm.get(sum);
                if(seq>ans){
                    ans = seq;
                    start = hm.get(sum);
                    end = i;
                }
            }else{
                hm.put(sum, i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=start+1; i<=end; i++){
            result.add(A.get(i));
        }
        return result;
    }
}
