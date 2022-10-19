import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_Sorting2_BClosestToOrigin {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList();
        A.add(new ArrayList<>(Arrays.asList(26, 41)));
        A.add(new ArrayList<>(Arrays.asList(40, 47)));
        A.add(new ArrayList<>(Arrays.asList(47, 7)));
        A.add(new ArrayList<>(Arrays.asList(50, 34)));
        A.add(new ArrayList<>(Arrays.asList(18, 28)));
        System.out.println(A);
        System.out.println(solve(A,5));
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        long min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0; i<B; i++){
            long d1 = (long)Math.pow(A.get(i).get(0), 2);
            long d2 = (long)Math.pow(A.get(i).get(1), 2);
            long d = (long)Math.sqrt(d1+d2);
            System.out.println("d:"+d);
            if(d < min){
                min = d;
                ans = i;
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        result.add(new ArrayList<>(Arrays.asList(A.get(ans).get(0), A.get(ans).get(1))));
        return result;
    }
}
