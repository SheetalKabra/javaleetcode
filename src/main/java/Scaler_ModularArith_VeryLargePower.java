public class Scaler_ModularArith_VeryLargePower {
    public static void main(String[] args) {
        System.out.println(solve(2, 27));
    }
    public static int solve(int A, int B) {
        int m = 1000000009;
        int x = A;
        for(int i=2; i<=B; i++){
            x = pow(x, i, m);
            System.out.println("i="+i+", "+x);
        }
        return x;
    }

    public static int pow(int A, int B, int mod){
        if(A==0 && B==0){
            return 0;
        }
        if(B == 0 ){
            return 1;
        }
        long val = pow(A, B/2, mod);
        if(B%2 == 0){
            return (int)(( (val%mod * val%mod) + mod )%mod);
        }else{
            return (int)(( (val%mod * val%mod) * A%mod + mod )%mod);
        }
    }
}
