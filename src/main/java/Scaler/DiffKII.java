package Scaler;

import java.util.*;

public class DiffKII {
    public int diffPossible(final List<Integer> A, int B) {
        int N = A.size();
        Map<Integer, Integer> valueMap = new HashMap<>();
        for(int i=0; i<N; i++){
            if( (valueMap.containsKey(A.get(i) - B)) || (valueMap.containsKey(A.get(i) + B)) ){
                return 1;
            }
            valueMap.put(A.get(i), i);
        }
        return 0;
    }

    public static void main(String[] args) {
        DiffKII d = new DiffKII();
        System.out.println(d.diffPossible(new ArrayList<>(Arrays.asList(1,5,3)), 2));
        System.out.println(d.diffPossible(new ArrayList<>(Arrays.asList(3,5,1)), 2));
        System.out.println(d.diffPossible(new ArrayList<>(Arrays.asList(3,1,5)), 2));
        System.out.println(d.diffPossible(new ArrayList<>(Arrays.asList(3,1,2)), 2));
        System.out.println(d.diffPossible(new ArrayList<>(Arrays.asList(1,3,2)), 2));
        System.out.println(d.diffPossible(new ArrayList<>(Arrays.asList(1,5,2)), 2));
    }
}
