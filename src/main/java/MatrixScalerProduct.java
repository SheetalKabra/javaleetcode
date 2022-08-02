import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixScalerProduct {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int row = A.size();
        int col = A.get(0).size();
        ArrayList<ArrayList<Integer>> scalerMatrix = new ArrayList<>(row);
        for(int i=0; i<row; i++){
            ArrayList<Integer> colMatrix = new ArrayList<>(col);
            for(int j=0; j<col; j++){
                colMatrix.add(j, (A.get(i).get(j))*B);
            }
            scalerMatrix.add(i, colMatrix);
        }
        return scalerMatrix;
    }

    public static void main(String[] args) {
        MatrixScalerProduct r = new MatrixScalerProduct();
        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> col3A = new ArrayList<>(Arrays.asList(7,8,9));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        A.add(col2A);
        A.add(col3A);
        System.out.println(A);
        System.out.println(r.solve(A, 2));
    }
}
