package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftRotation {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int pos,N;
        ArrayList<ArrayList<Integer>> leftRotatedArrays = new ArrayList<>(B.size());
        for(int j=0; j<B.size(); j++){
            N = A.size();
            //System.out.println("size: "+N);
            ArrayList<Integer> rotated = new ArrayList<>(N);
            //insert with 0 value in the arraylist to initialize its size
            for(int i=0; i<N; i++){
                rotated.add(0);
            }
            //System.out.println("size rotated: "+rotated.size());
            int k = B.get(j)%N;
            for(int i=0;i<N; i++){
                pos = (i-k >= 0) ? i-k : i-k+N;
                //System.out.println("pos:"+pos);
                rotated.set(pos, A.get(i));
            }
            leftRotatedArrays.add(rotated);
        }
        return leftRotatedArrays;
    }

    public static void main(String[] args) {
        LeftRotation lr = new LeftRotation();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5 ));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10));
        ArrayList<ArrayList<Integer>> newArrayList = lr.solve(A, B);
        for(int i=0; i<newArrayList.size(); i++){
            for(int j=0; j<newArrayList.get(i).size(); j++){
                System.out.print(newArrayList.get(i).get(j)+" ");
            }
            System.out.println(" ");
        }
    }

}
