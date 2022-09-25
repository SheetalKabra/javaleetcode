import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_GCD_DeleteOne {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(3,9,6,8,3))));
    }
    public static int solve(ArrayList<Integer> A) {
        //firstly create the prefix gcd and suffix gcd
        int N = A.size();
        ArrayList<Integer> prefixgcd = new ArrayList<>(N);
        ArrayList<Integer> suffixgcd = new ArrayList<>(N);
        prefixgcd.add(0, A.get(0));
        suffixgcd.add(0, 0);
        for(int i=1; i<N; i++){
            prefixgcd.add(i,(A.get(i) > prefixgcd.get(i-1)) ? gcd(prefixgcd.get(i-1), A.get(i)) : gcd(A.get(i), prefixgcd.get(i-1)));
            suffixgcd.add(i, 0);
        }

        suffixgcd.set(N-1, A.get(N-1));
        for(int i=N-2; i>=0; i--){
            suffixgcd.set(i, (A.get(i) > suffixgcd.get(i+1)) ? gcd(suffixgcd.get(i+1), A.get(i)) : gcd(A.get(i), suffixgcd.get(i+1)));
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(i == 0){
                max = Math.max(max, suffixgcd.get(i+1));
            }else if(i == N-1){
                max = Math.max(max, prefixgcd.get(i-1));
            }else{
                max = Math.max(max, gcd(prefixgcd.get(i-1), suffixgcd.get(i+1)));
            }
        }
        return max;
    }
    public static int gcd(int a, int b){
        while(a>0){
            int temp = a;
            a = b%a;
            b = temp;
        }
        return b;
    }
}
