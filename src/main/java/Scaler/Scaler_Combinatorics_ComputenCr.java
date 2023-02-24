package Scaler;

import java.util.ArrayList;

public class Scaler_Combinatorics_ComputenCr {
    public static void main(String[] args) {
        System.out.println(solve(5,2,13));
        System.out.println(solve(6,2,13));
    }
    public static int solve(int A, int B, int C) {
        //A = n, B = r, and C is mod
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        for(int i=0; i<=A; i++){
            ArrayList<Integer> col = new ArrayList<>();
            for(int j=0; j<=B; j++){
                col.add(j, 0);
            }
            mat.add(col);
        }
        for(int i=0; i<=A; i++){
            for(int j=0; j<=B; j++){
                //EdgeCase: r>n, then 0
                if(j>i){
                    mat.get(i).set(j,0);
                }else if(j == 0){
                    //EdgeCase: r==0, then 1
                    mat.get(i).set(j,1);
                }else{
                    int val = (mat.get(i-1).get(j)%C + mat.get(i-1).get(j-1)%C)%C;
                    mat.get(i).set(j, val);
                }
            }
        }
        System.out.println(mat);
        return mat.get(A).get(B);
    }
}
