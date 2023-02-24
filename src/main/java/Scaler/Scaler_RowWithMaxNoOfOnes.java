package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_RowWithMaxNoOfOnes {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList(Arrays.asList(0,1,1,1,1,1,1,1)));
        A.add(1, new ArrayList(Arrays.asList(1,1,1,1,1,1,1,1)));
        A.add(2, new ArrayList(Arrays.asList(0,0,0,0,0,1,1,1)));
        A.add(3, new ArrayList(Arrays.asList(1,1,1,1,1,1,1,1)));
        A.add(4, new ArrayList(Arrays.asList(0,0,0,0,0,0,0,0)));
        A.add(5, new ArrayList(Arrays.asList(1,1,1,1,1,1,1,1)));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        int M = A.get(0).size();
        int i=0;
        int j=M-1;
        int mini = -1;
        int maxj = M+2;
        while(i<N && j>=0){
            if(A.get(i).get(j) == 1){
                j--;
                if(j<maxj){
                    maxj = j;
                    mini = i;
                }
            } else {
                i++;
            }
        }
        return mini;
    }
}
