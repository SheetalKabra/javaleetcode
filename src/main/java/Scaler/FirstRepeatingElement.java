package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<N; i++){
            if(freq.containsKey(A.get(i))){
                freq.put(A.get(i), freq.get(A.get(i))+1);
            }else{
                freq.put(A.get(i), 1);
            }
        }
        for(int i=0; i<N; i++){
            if(freq.get(A.get(i)) > 1){
                return A.get(i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstRepeatingElement f = new FirstRepeatingElement();
        System.out.println(f.solve(new ArrayList<>(Arrays.asList(10,5,3,4,3,5,6))));
        System.out.println(f.solve(new ArrayList<>(Arrays.asList(6, 10, 5, 4, 9, 120))));
    }
}
