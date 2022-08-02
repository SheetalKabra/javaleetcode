import java.util.ArrayList;
import java.util.Arrays;

public class rowSumMatrix {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();
        int sum = 0;
        ArrayList<Integer> rowSumMatrix = new ArrayList<>(row);
        for(int i=0; i<row; i++){
            sum = 0;
            for(int j=0; j<col; j++){
                sum = sum + A.get(i).get(j);
            }
            rowSumMatrix.add(i, sum);
        }
        return rowSumMatrix;
    }

    public static void main(String[] args) {
        rowSumMatrix r = new rowSumMatrix();
        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(5,6,7,8));
        ArrayList<Integer> col3A = new ArrayList<>(Arrays.asList(9,2,3,4));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        A.add(col2A);
        A.add(col3A);
        System.out.println(A);
        System.out.println(r.solve(A));
    }
}
