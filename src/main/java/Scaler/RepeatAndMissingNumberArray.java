package Scaler;

import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumberArray {
    /*
        SUM(Actual) = SUM(1....N) + A - B;
        SUM(A[i]^2 + A[i+1]^2.....) = SUM(1^2 + 2^2 + ..... N^2) + A^2 - B^2;
        SUM(A[i]^2 + A[i+1]^2.....) = SUM(1^2 + 2^2 + ..... N^2) + (A+B)(A-B);
     */
    //public ArrayList<Integer> repeatedAndMissingNumber(List<Integer> A){
    public int repeatedAndMissingNumber(List<Integer> A){
        int sumOfActual = 0;
        int sum = 0;
        int squareSumOfActual = 0;
        int squareSum = 0;
        for(int i=0; i< A.size(); i++){
            sumOfActual = sumOfActual + A.get(i);
            sum = sum + i;
            squareSumOfActual = squareSumOfActual + (A.get(i)*A.get(i));
            squareSum = squareSum + (i*i);
        }
        //A - B = sumOfActual - sum
        //A + B = squareSumOfActual - squareSum

    return 1;






    }
}