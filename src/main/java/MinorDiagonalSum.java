import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinorDiagonalSum {
    public int solve(final List<ArrayList<Integer>> A) {
        int M = A.size();
        int N = A.get(0).size();
        int sum = 0;
        int c;
        for(int r=0; r<M; r++){
            c = M - r; // c = M+1-(r+1);
            sum = sum + A.get(r).get(c-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        MinorDiagonalSum c = new MinorDiagonalSum();
//        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(1,-2,-3));
//        ArrayList<Integer> col2 = new ArrayList<>(Arrays.asList(-4,5,-6));
//        ArrayList<Integer> col3 = new ArrayList<>(Arrays.asList(-7,-8,9));
//        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
//        row.add(col1);
//        row.add(col2);
//        row.add(col3);
        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(3,2));
        ArrayList<Integer> col2 = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
        row.add(col1);
        row.add(col2);
        System.out.println(row);
        System.out.println(c.solve(row));
    }
}
