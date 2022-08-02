import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDiagonalSum {
    public int solve(final List<ArrayList<Integer>> A) {
        int N = A.size();
        int sum = 0;
        for(int i=0; i<N; i++){
            sum = sum + A.get(i).get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        MainDiagonalSum r = new MainDiagonalSum();
        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(3,2));
        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(2,3));
        List<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        A.add(col2A);
        System.out.println(A);
        System.out.println(r.solve(A));
    }
}
