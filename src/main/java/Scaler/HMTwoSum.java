package Scaler;

import java.util.*;

public class HMTwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        int N = A.size();
        Map<Integer, Integer> elem = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<N; i++){
            if(elem.containsKey(B-A.get(i))){
                result.add(1+(elem.get(B-A.get(i))));
                result.add(i+1);
                System.out.println("before return:"+elem);
                return result;
            }else{
                if(!elem.containsKey(A.get(i))){
                    elem.put(A.get(i), i);
                }
                System.out.println(elem);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        HMTwoSum h = new HMTwoSum();
        //System.out.println(h.twoSum(new ArrayList<>(Arrays.asList(2,7,11,15)), 9));
        System.out.println(h.twoSum(new ArrayList<>(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8)), -3));

    }
}
