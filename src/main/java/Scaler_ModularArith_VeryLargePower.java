public class Scaler_ModularArith_VeryLargePower {
    public static void main(String[] args) {
        System.out.println(solve(2, 27));
    }
    public static int solve(int A, int B) {
        long m = 1000000007L;
        long x = 1L;
        for(long i=1; i<=B; i++){
            x = (x*i)%(m-1);
        }
        long a = (long)A;
        int res = (int)pow(a, x, m);
        return res;
    }

    public static long pow(long A, long B, long mod) {
        if (A == 0 && B == 0) {
            return 0;
        }
        if (B == 0) {
            return 1;
        }
        long val = pow(A, B / 2, mod);
        if (B % 2 == 0) {
            return (((val % mod * val % mod) + mod) % mod);
        } else {
            return (((val % mod * val % mod) * A % mod + mod) % mod);
        }
    }
}
