package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductArrayPuzzle {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,1,3,2));
        ProductArrayPuzzle t = new ProductArrayPuzzle();
        System.out.println(t.solve(input));

        ArrayList<Integer> input1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ProductArrayPuzzle t1 = new ProductArrayPuzzle();
        System.out.println(t1.solve(input1));

        ArrayList<Integer> input2 = new ArrayList<>(Arrays.asList(5,1,10,1));
        ProductArrayPuzzle t2 = new ProductArrayPuzzle();
        System.out.println(t2.solve(input2));

        ArrayList<Integer> input3 = new ArrayList<>(Arrays.asList(5,1,10,0));
        ProductArrayPuzzle t3 = new ProductArrayPuzzle();
        System.out.println(t3.solve(input3));
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> productArray = new ArrayList();
        int N = A.size();
        int mul = 1;
        for(int i=0; i<N; i++){
            mul = mul*A.get(i);
        }
        for(int i=0; i<N; i++){
            if(mul == 0){
                productArray.add(0);
            }else{
                productArray.add(mul/A.get(i));
            }
        }
        return productArray;
    }
}
