package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArithmeticProgression {
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        Collections.sort(A);
        int diff = A.get(1) - A.get(0);
        for(int i=2; i<N; i++){
            if(A.get(i) - A.get(i-1) != diff){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        ArithmeticProgression a = new ArithmeticProgression();
        System.out.println(a.solve(new ArrayList<>(Arrays.asList(3,5,1))));
        System.out.println(a.solve(new ArrayList<>(Arrays.asList(2,4,1))));
    }
}
