import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerContest_InATrouble {
    public static void main(String[] args) {
        ScalerContest_InATrouble s = new ScalerContest_InATrouble();
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(13,4,10,17,6,16))));
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        operations(A.size(), A);
        return A;

    }

    public void operations(int op, ArrayList<Integer> A){
        if(op == 0){
            return;
        }
        Collections.sort(A);
        System.out.println(A);
        int N = A.size();
        int min = A.get(0);
        int max = A.get(N-1);
        int avg = (min+max)/2;
        System.out.println("min:"+min+", max:"+max+", avg:"+avg);
        A.set(0, min+avg);
        A.set(N-1, max-avg);
        operations(op-1, A);
    }
}
