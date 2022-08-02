import java.util.ArrayList;
import java.util.Arrays;

public class MatrixTranspose {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>(cols);
        for(int i=0; i<cols; i++){
            ArrayList<Integer> transposecols = new ArrayList<>(rows);
            for(int j=0; j<rows; j++){
                transposecols.add(j, A.get(j).get(i));
            }
            transpose.add(i, transposecols);
        }
        return transpose;
    }

    public static void main(String[] args) {
        MatrixTranspose m = new MatrixTranspose();
        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        ArrayList<Integer> col3A = new ArrayList<>(Arrays.asList(11,12,13,14,15));
        ArrayList<Integer> col4A = new ArrayList<>(Arrays.asList(16,17,18,19,20));
        ArrayList<Integer> col5A = new ArrayList<>(Arrays.asList(21,22,23,24,25));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        A.add(col2A);
        A.add(col3A);
        A.add(col4A);
        A.add(col5A);
        System.out.println(A);
        System.out.println(m.solve(A));

        ArrayList<Integer> col1B = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> col2B = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> col3B = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(col1B);
        B.add(col2B);
        B.add(col3B);
        System.out.println(B);
        System.out.println(m.solve(B));

    }
}
