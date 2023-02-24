package Scaler;

public class EvenProduct {
    public int solve(int[] A) {
        int product = 1;
        int m = 1000000007;
        for(int i=0;i<A.length;i++){
            product = ( product * 2 ) % m;
        }
        return product - 1;
    }
}
