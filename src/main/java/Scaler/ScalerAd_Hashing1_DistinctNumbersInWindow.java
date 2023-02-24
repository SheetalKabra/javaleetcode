package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing1_DistinctNumbersInWindow {
    public static void main(String[] args) {
        System.out.println(dNums(new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3)), 3));
        System.out.println(dNums(new ArrayList<>(Arrays.asList(1, 1, 2, 2)), 1));
        System.out.println(dNums(new ArrayList<>(Arrays.asList(1, 1, 2, 2)), 6));
    }
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int N = A.size();
        ArrayList<Integer> op = new ArrayList<>();
        if(B>N){
            return op;
        }
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<B; i++){
            if(hm.containsKey(A.get(i))){
                hm.put(A.get(i), hm.get(A.get(i))+1);
            }else{
                hm.put(A.get(i), 1);
            }
        }
        op.add(hm.size());
        int l=0;
        for(int i=B; i<N; i++){
            hm.put(A.get(l), hm.get(A.get(l))-1);
            if(hm.get(A.get(l)) == 0){
                hm.remove(A.get(l));
            }
            if(hm.containsKey(A.get(i))){
                hm.put(A.get(i), hm.get(A.get(i))+1);
            }else{
                hm.put(A.get(i), 1);
            }
            op.add(hm.size());
            l++;
        }
        return op;
    }
}
