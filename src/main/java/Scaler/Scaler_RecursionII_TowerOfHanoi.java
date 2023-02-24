package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_RecursionII_TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3));
    }
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arr1 = TOH(1,3,2, A, arr);
        return arr1;
    }

    public static ArrayList<ArrayList<Integer>> TOH(int src, int trgt, int mid, int n, ArrayList<ArrayList<Integer>> A){
        if(n == 0){
            return A;
        }
        TOH(src, mid, trgt, n-1, A);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(n);
        B.add(src);
        B.add(trgt);
        A.add(B);
        TOH(mid, trgt, src, n-1, A);
        return A;
    }
}
