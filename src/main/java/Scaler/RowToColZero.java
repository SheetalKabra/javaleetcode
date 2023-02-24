package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class RowToColZero {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int rowSize = A.size();
        int colSize = A.get(0).size();
        ArrayList<Integer> rowsZero = new ArrayList<>();
        ArrayList<Integer> colZero = new ArrayList<>();
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                if(A.get(i).get(j) == 0){
                    //make entire ith row and jth col to 0
                    //1. make entire col = 0, and row = i
                    rowsZero.add(i);
                    colZero.add(j);
                }
            }
        }
        //make all the col value to zero of rows
        for(int i=0; i<rowsZero.size(); i++){
            for(int j=0; j<colSize; j++){
                int index = rowsZero.get(i);
                A.get(index).set(j, 0);
            }
        }

        for(int i=0; i<colZero.size(); i++){
            for(int j=0; j<rowSize; j++){
                int index = colZero.get(i);
                A.get(j).set(index, 0);
            }
        }
        return A;
    }

    public static void main(String[] args) {
        RowToColZero r = new RowToColZero();
        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(5,6,7,0));
        ArrayList<Integer> col3A = new ArrayList<>(Arrays.asList(0,2,9,4));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        A.add(col2A);
        A.add(col3A);
        System.out.println(A);
        System.out.println(r.solve(A));
    }
}
