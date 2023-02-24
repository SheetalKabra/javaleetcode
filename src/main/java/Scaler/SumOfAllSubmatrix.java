package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllSubmatrix {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList(Arrays.asList(8,9,9,1,7)));
        A.add(new ArrayList(Arrays.asList(5, 5, 10, 1, 0)));
        A.add(new ArrayList(Arrays.asList(7, 7, 5, 8, 6)));
        A.add(new ArrayList(Arrays.asList(7, 3, 7, 9, 2)));
        A.add(new ArrayList(Arrays.asList(7, 7, 8, 10, 6)));
        System.out.println(A);
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum = sum + (A.get(i).get(j)*(n-i)*(n-j));
                System.out.println((n-i)*(n-j)+" = sum="+sum);
            }
        }
        return sum;
    }
}
