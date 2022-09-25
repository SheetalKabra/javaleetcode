import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_GCD_Pubg {
    public static void main(String[] args) {
        //System.out.println(solve(new ArrayList<>(Arrays.asList(2,3,4))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(6,4))));
    }
    public static int solve(ArrayList<Integer> A) {
        int x = A.get(0);
        for(int i=1; i<A.size(); i++){
            x = (x>A.get(i)) ?  gcd (A.get(i), x) : gcd (x, A.get(i));
            System.out.println("gcd("+x+","+A.get(i)+"):"+x);
        }
        return x;
    }

    public static int gcd(int A, int B){
        if(A == 0){
            return B;
        }
        return gcd(B%A, A);
    }
}
