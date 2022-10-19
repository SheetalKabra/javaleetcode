import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_Sorting3_MaxAndMinMagic {

    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(5,1,4,7,10,9,8,0))));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int m = 1000000007;
        int N = A.size();
        Collections.sort(A);
        long sumMin = 0;
        long sumMax = 0;
        for(int i=0; i<N; i+=2){
            sumMin = (sumMin%m + A.get(i+1)%m - A.get(i)%m)%m;
            sumMin %= m;
        }
        int s = 0;
        int e = N-1;
        while(s<e){
            sumMax = (sumMax%m + A.get(e)%m - A.get(s)%m)%m;
            sumMax %= m;
            s++;
            e--;
        }
        return new ArrayList(Arrays.asList((int)sumMax, (int)sumMin));
    }
}
