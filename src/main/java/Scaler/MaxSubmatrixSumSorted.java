package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubmatrixSumSorted {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<>(Arrays.asList(-5,-4,-3)));
        A.add(1, new ArrayList<>(Arrays.asList(-1,2,3)));
        A.add(2, new ArrayList<>(Arrays.asList(2,2,4)));

//        A.add(0, new ArrayList<>(Arrays.asList(1,2,3)));
//        A.add(1, new ArrayList<>(Arrays.asList(4,5,6)));
//        A.add(2, new ArrayList<>(Arrays.asList(7,8,9)));
        System.out.println(solve(A));
    }
    public static Long solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Long>> pf = new ArrayList<>();
        for(int i=0; i<N; i++){
            pf.add(new ArrayList<Long>());
        }
        long sum = 0;
        pf.get(0).add(0, (long)A.get(0).get(0));
        //pf for 0th row
        for(int i=1; i<M; i++){
            sum = pf.get(0).get(i-1) + A.get(0).get(i);
            pf.get(0).add(i, sum);
        }
        //pf for 0th col
        for(int i=1; i<N; i++){
            sum = pf.get(i-1).get(0) + A.get(i).get(0);
            pf.get(i).add(0, sum);
        }
        //pf for rest of the col
        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                sum = pf.get(i-1).get(j) + pf.get(i).get(j-1) - pf.get(i-1).get(j-1) + A.get(i).get(j);
                pf.get(i).add(j, sum);
            }
        }

        //now we have fixed bottom right i and j as this is the sorted matrix, so max value will be always at (n-1, m-1)
        //so take all the possible sub matrix having bottom right = n-1,m-1
        long max = Integer.MIN_VALUE;
        long submatrixSum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                submatrixSum = pf.get(N-1).get(M-1);
                if(i != 0){
                    submatrixSum -= pf.get(i-1).get(M-1);
                }
                if(j != 0){
                    submatrixSum -= pf.get(N-1).get(j-1);
                }
                if(i!= 0 && j!=0){
                    submatrixSum += pf.get(i-1).get(j-1);
                }
                max = Math.max(max, submatrixSum);
            }
        }
        return max;
    }
}
