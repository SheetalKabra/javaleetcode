import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ScalerAd_TwoPointers_PairsWithGivenDiff {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 5, 3, 4, 2)), 3));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(8, 12, 16, 4, 0, 20)), 4));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2)), 0));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3)), 3));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int count = 0;
        Collections.sort(A);
        System.out.println(A);
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<N; i++){
            if(i+1!= N && A.get(i) != A.get(i+1) && Math.abs(A.get(i+1) - A.get(i)) == B){
                count++;
                hs.add(A.get(i));
                break;
            }
        }
        return count;
    }
}
