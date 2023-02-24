package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilbriumIndex {

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int totalSum = 0;
        for(int i=0; i<N; i++){
            totalSum = totalSum + A.get(i);
        }
        int left = 0;
        int right = totalSum;
        for(int i=0; i<N; i++){
            right = right - A.get(i);
            if(right == left){
                return i;
            }
            left = left + A.get(i);
        }
        return -1;
    }
//    public int solve(ArrayList<Integer> A) {
//        int N = A.size();
//        ArrayList<Integer> pf = new ArrayList<Integer>(N);
//        pf.add(A.get(0));
//        for(int i=1; i<N; i++){
//            pf.add(pf.get(i-1)+A.get(i));
//        }
//        int left, right;
//        for(int i=0; i<N; i++){
//            left = (i == 0) ? 0 : pf.get(i-1);
//            right = (i == N-1 ) ? 0 : pf.get(N-1) - pf.get(i);
//            if(left == right){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        EquilbriumIndex ei = new EquilbriumIndex();
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        System.out.println(ei.solve(A));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        System.out.println(ei.solve(B));
    }
}
