package Scaler;

import java.util.ArrayList;

public class EvenSubarrays {

    public String solve(ArrayList<Integer> A) {
        int N = A.size();
        if(N%2 != 0){
            return "NO";
        }
        if(A.get(0) %2 == 0 && A.get(N-1) % 2 == 0){
            return "YES";
        }
        return "NO";
    }
}
