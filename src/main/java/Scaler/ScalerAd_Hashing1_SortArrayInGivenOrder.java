package Scaler;

import java.util.*;

public class ScalerAd_Hashing1_SortArrayInGivenOrder {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,2,3,4,5)), new ArrayList<>(Arrays.asList(5,4,2))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(5, 17, 100, 11)), new ArrayList<>(Arrays.asList(1,100))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(3, 20, 17, 17)), new ArrayList<>(Arrays.asList(5, 9, 20, 11, 6, 18, 7, 13))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(10, 2, 18, 16, 16, 16)), new ArrayList<>(Arrays.asList(3, 13, 2, 16, 4, 19))));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        int M = B.size();
        ArrayList<Integer> op = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        Collections.sort(A);
        for(int i=0; i<N; i++){
            if(hm.containsKey(A.get(i))){
                hm.put(A.get(i), hm.get(A.get(i))+1);
            }else{
                hm.put(A.get(i), 1);
            }
        }
        for(int i=0;i<M;i++){
            if(hm.containsKey(B.get(i))){
                int freq = hm.get(B.get(i));
                for(int j=0; j<freq; j++){
                    op.add(B.get(i));
                    hm.put(B.get(i), hm.get(B.get(i))-1);
                }
                if(hm.get(B.get(i)) == 0){
                    hm.remove(B.get(i));
                }
            }
        }
        for(int i=0;i<N;i++){
            if(hm.containsKey(A.get(i))){
                op.add(A.get(i));
                hm.put(A.get(i), hm.get(A.get(i))-1);
                if(hm.get(A.get(i)) == 0){
                    hm.remove(A.get(i));
                }
            }
        }
        return op;
    }
}
