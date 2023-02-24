package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerContest_Maxsprod {

    public static void main(String[] args) {
        ScalerContest_Maxsprod s = new ScalerContest_Maxsprod();
        System.out.println(s.maxSpecialProduct(new ArrayList<>(Arrays.asList(1,5,2,3,2))));
    }
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int N = A.size();
        //int maxj = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for (int i = N - 1; i >= 0; i--) {
            int maxj = 0;
            int minj = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (A.get(j) > A.get(i)) {
                    System.out.println("hetete");
                    maxj = Math.max(maxj, A.get(j));
                }
            }
            System.out.println("maxj:" +maxj);
            for (int k = 0; k < i; k++) {
                if (A.get(i) > A.get(k)) {
                    System.out.println("shjshhs");
                    minj = Math.min(minj, A.get(i));
                }
            }
            System.out.println("minj:"+minj);
            ans = Math.max(ans, minj * maxj);
        }
        return ans;
    }
}
