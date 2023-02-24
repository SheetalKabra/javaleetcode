package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing2_CommonElements {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 2, 2, 1)), new ArrayList<>(Arrays.asList(2, 3, 1, 2))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(2, 1, 4, 10)), new ArrayList<>(Arrays.asList(3, 6, 2, 10, 10))));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        int M = B.size();
        Map<Integer, Integer> hma = new HashMap<>();
        Map<Integer, Integer> hmb = new HashMap<>();
        for(int i=0; i<N; i++){
            if(hma.containsKey(A.get(i))){
                hma.put(A.get(i), hma.get(A.get(i))+1);
            }else{
                hma.put(A.get(i), 1);
            }
        }

        for(int i=0; i<M; i++){
            if(hmb.containsKey(B.get(i))){
                hmb.put(B.get(i), hmb.get(B.get(i))+1);
            }else{
                hmb.put(B.get(i), 1);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(Integer num : hma.keySet()){
            //here key = num, value = hma.get(num);
            if(hmb.containsKey(num)){
                int looptill = Math.min(hma.get(num), hmb.get(num));
                for(int i=0; i<looptill; i++){
                    result.add(num);
                }
            }
        }

        return result;
    }

}
