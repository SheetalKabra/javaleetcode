package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerString {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<>(Arrays.asList(2,8,8,8)));
        A.add(1, new ArrayList<>(Arrays.asList(2,8,8,8)));
        A.add(2, new ArrayList<>(Arrays.asList(2,8,8,8)));
        System.out.println(solve(A, 8));
    }
    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int N = A.size();
        int M = A.get(0).size();
        int i=0;
        int j=M-1;
        int min = Integer.MAX_VALUE;
        while(i<N && j>=0){
            if(A.get(i).get(j) > B){
                //go to left;
                j--;
            }else if(A.get(i).get(j) < B){
                //go down
                i++;
            }else if(A.get(i).get(j) == B){
                min = Math.min(min, (i+1)*1009+(j+1));
                //return (i+1)*1009+(j+1);
                j--;
            }
        }
        if(min != Integer.MAX_VALUE ){
            return min;
        }
        return -1;
    }
}
