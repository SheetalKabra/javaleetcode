package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PAirsWithGivenXor {
    public int solve(ArrayList<Integer> A, int B) {
        /**
         As we can say (a^b = c) ===> or (a^c = b) ====> or (b^c = a)
         */
        int N = A.size();
        Map<Integer, Integer> elem = new HashMap<>();
        for(int i=0; i<N; i++){
            elem.put(A.get(i), 0);
        }
        for(int i=0; i<N; i++){
            if(elem.containsKey((A.get(i)^B)) && elem.get(A.get(i)^B) == 0){
                elem.put(A.get(i), 1);
                elem.put((A.get(i)^B), 1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> xorelem: elem.entrySet()){
            if(xorelem.getValue() == 1){
                count++;
            }
        }
        System.out.println(elem);
        return count/2;
    }

    public static void main(String[] args) {
        PAirsWithGivenXor p = new PAirsWithGivenXor();
        System.out.println(p.solve(new ArrayList<>(Arrays.asList(5,4,10,15,7,6)), 5));
        System.out.println(p.solve(new ArrayList<>(Arrays.asList(3,6,8,10,15,50)), 5));
        System.out.println(p.solve(new ArrayList<>(Arrays.asList(3,6,8,10,15,6)), 5));
        System.out.println(p.solve(new ArrayList<>(Arrays.asList(3,7,3,10,5,3,8)), 5));
        System.out.println(p.solve(new ArrayList<>(Arrays.asList(17, 18, 8, 13, 15, 7, 11, 5, 4, 9, 12, 6, 10, 14, 16, 3)), 9));

    }
}
