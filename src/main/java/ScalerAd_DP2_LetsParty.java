import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_DP2_LetsParty {

    public static void main(String[] args) {
        ScalerAd_DP2_LetsParty s = new ScalerAd_DP2_LetsParty();
        System.out.println(s.solve(17));
    }
    public int solve(int A) {
        int[] arr = new int[A+1];
        Arrays.fill(arr, -1);
        int res = f(A, arr);

        return res;
    }

    public int f(int A, int[] arr){
        int m = 10003;
        if(A == 0){
            arr[0] = 0;
            return 0;
        }
        if(A == 1){
            arr[1] = 1;
            return 1;
        }
        if(A == 2){
            arr[2] = 2;
            return 2;
        }
        if(arr[A] != -1){
            return arr[A];
        }
        return arr[A] = (f(A-1, arr)%m + (f(A-2, arr)%m*(A-1)%m)%m)%m;
    }
}
