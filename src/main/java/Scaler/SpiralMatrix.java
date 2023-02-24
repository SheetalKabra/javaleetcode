package Scaler;

import java.util.ArrayList;

public class SpiralMatrix {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> spiralMatrix = new ArrayList<>();
        for(int i=0; i<A; i++){
            ArrayList<Integer> spiralMatrixCol = new ArrayList<>();
            for(int j=0; j<A; j++){
                spiralMatrixCol.add(j, 0);
            }
            spiralMatrix.add(i, spiralMatrixCol);
        }

        int upperBound = 0;
        int lowerBound = A-1;
        int leftBound = 0;
        int rightBound=A-1;
        int k=1;

        while(true){
            for(int col=leftBound; col<=rightBound; col++){
                int row = upperBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            upperBound++;

            for(int row=upperBound; row<=lowerBound; row++){
                int col = rightBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            rightBound--;

            for(int col=rightBound; col>=leftBound; col--){
                int row = lowerBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            lowerBound--;

            for(int row=lowerBound; row>=upperBound; row--){
                int col = leftBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            leftBound++;
            //System.out.println(k);
            if(k> A*A){
                break;
            }
        }
        return spiralMatrix;
    }
    public ArrayList<ArrayList<Integer>> generateMatrix1(int A) {
        ArrayList<ArrayList<Integer>> spiralMatrix = new ArrayList<>(A);
        for(int i=0; i<A; i++){
            ArrayList<Integer> spiralMatrixCol = new ArrayList<>(A);
            for(int j=0; j<A; j++){
                spiralMatrixCol.add(j, 0);
            }
            spiralMatrix.add(i, spiralMatrixCol);
        }
        int k=1;
        int upperBound = 0;
        int lowerBound = A-1;
        int leftBound = 0;
        int rightBound = A-1;
        while(true){
            //1. this for loop is to print the
            // col from 0 to A-1 and
            // row = 0
            for(int col=leftBound; col<=rightBound; col++){
                int row = upperBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            //2. this for loop is to print the
            // row from 1 to A-1 and
            // col = N-1
            upperBound++;
            for(int row=upperBound; row<=lowerBound; row++){
                int col = rightBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            //3. this for loop is to print the
            // col from A-2 to 0 and
            // row = A-1
            rightBound--;
            for(int col=rightBound; col>=leftBound; col--){
                int row = lowerBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            //4. this for loop is to print the
            // row from A-2 to 1 and
            // col = 0
            lowerBound--;
            for(int row=lowerBound; row>=upperBound; row--){
                int col = leftBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            leftBound++;
            if(k > A*A ){
                break;
            }
        }
        return spiralMatrix;
    }
    public ArrayList<ArrayList<Integer>> generateMatrix11(int A) {
        ArrayList<ArrayList<Integer>> spiralMatrix = new ArrayList<>(A);
        for(int i=0; i<A; i++){
            ArrayList<Integer> spiralMatrixCol = new ArrayList<>(A);
            for(int j=0; j<A; j++){
                spiralMatrixCol.add(j, 0);
            }
            spiralMatrix.add(i, spiralMatrixCol);
        }
        int k = 1;
        int upperBound = 0;
        int lowerBound = A-1;
        int leftBound = 0;
        int rightBound = A-1;
        while(true){
            //1. this for loop is to print the
            // col from 0 to A-1 and
            // row = 0
            for(int col=leftBound; col<=rightBound; col++){
                int row = upperBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            //2. this for loop is to print the
            // row from 1 to A-1 and
            // col = N-1
            upperBound++;
            for(int row=upperBound; row<=lowerBound; row++){
                int col = rightBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            //3. this for loop is to print the
            // col from A-2 to 0 and
            // row = A-1
            rightBound--;
            for(int col=rightBound; col>=leftBound; col--){
                int row = lowerBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            //4. this for loop is to print the
            // row from A-2 to 1 and
            // col = 0
            lowerBound--;
            for(int row=lowerBound; row>=upperBound; row--){
                int col = leftBound;
                spiralMatrix.get(row).set(col, k);
                k++;
            }
            leftBound++;
            if(k > A*A ){
                break;
            }
        }
        return spiralMatrix;
    }

    public static void main(String[] args) {
        SpiralMatrix s = new SpiralMatrix();
        System.out.println(s.generateMatrix(5));
        //System.out.println(s.generateMatrix1(5));
    }
}
