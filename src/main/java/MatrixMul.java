import java.util.ArrayList;
import java.util.Arrays;

public class MatrixMul {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        //A = M*N
        //B = N*P
        //MatrixMul = M*P
        int M = A.size();
        int N = A.get(0).size();
        int P = B.get(0).size();
        ArrayList<ArrayList<Integer>> MatrixMul = new ArrayList<>(M);
        int sum = 0;
        for(int i=0; i<M; i++){
            ArrayList<Integer> MatrixMulCol = new ArrayList<>(P);
            for(int j=0; j<P; j++){
                sum = 0;
                for(int k=0; k<N; k++){
                    sum = sum + (A.get(i).get(k) * B.get(k).get(j));
                }
                MatrixMulCol.add(j, sum);
            }
            MatrixMul.add(i, MatrixMulCol);
        }
        return MatrixMul;
    }

    public static void main(String[] args) {
        MatrixMul m = new MatrixMul();
        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(col1);
        System.out.println(a);
        ArrayList<Integer> colb1 = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> colb2 = new ArrayList<>(Arrays.asList(3));
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(colb1);
        b.add(colb2);
        System.out.println(b);
        System.out.println(m.solve(a, b));
    }
}
