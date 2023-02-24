package Scaler;

import java.util.ArrayList;

public class AlteringSubArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        ArrayList<Integer> returnArray = new ArrayList<>(N);
        boolean isValid = true;
        for(int s=B; s<=N-B-1; s++){
            isValid = true;
            for(int i=s-B; i< s+B; i++){
                if(A.get(i) == A.get(i+1)){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                returnArray.add(s);
            }
        }
        return returnArray;
    }
    public ArrayList<Integer> solve1(ArrayList<Integer> A, int B) {
        int N = A.size();
        ArrayList<Integer> returnArray = new ArrayList<>(N);
        boolean isValid = true;
        for(int s=B; s<=N-B-1; s++){
            isValid = true;
            for(int i=s-B; i< s+B; i++){
                if(A.get(i) == A.get(i+1)){
                    isValid = false;
                }
            }
            if(isValid){
                returnArray.add(s);
            }
        }
        return returnArray;
    }
}
