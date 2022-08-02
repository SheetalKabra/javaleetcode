import java.util.ArrayList;
import java.util.Arrays;

public class MatrixSubtraction {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> subtractarray = new ArrayList<>(rows);
        int sub = 0;
        for(int i=0; i<rows; i++){
            ArrayList<Integer> colSub = new ArrayList<>(cols);
            for(int j=0; j<cols; j++){
                sub = A.get(i).get(j) - B.get(i).get(j);
                colSub.add(j, sub);
            }
            subtractarray.add(colSub);
        }
        return subtractarray;
    }

    public static void main(String[] args) {
        MatrixSubtraction c = new MatrixSubtraction();
//        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(4,5,6));
//        ArrayList<Integer> col3A = new ArrayList<>(Arrays.asList(7,8,9));
//        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//        A.add(col1A);
//        A.add(col2A);
//        A.add(col3A);
//        ArrayList<Integer> col1B = new ArrayList<>(Arrays.asList(9,8,7));
//        ArrayList<Integer> col2B = new ArrayList<>(Arrays.asList(6,5,4));
//        ArrayList<Integer> col3B = new ArrayList<>(Arrays.asList(3,2,1));
//        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
//        B.add(col1B);
//        B.add(col2B);
//        B.add(col3B);
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(c.solve(A, B));

        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        ArrayList<Integer> col1B = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(col1B);
        System.out.println(A);
        System.out.println(B);
        System.out.println(c.solve(A, B));
    }

}
