package Scaler;

public class Scaler_Combinatorics_ComputenCrmodP {
    public static void main(String[] args) {
//        System.out.println(solve(5,2,13));
//        System.out.println(solve(281,174,47681));
        System.out.println(solve(89138,65616,3275381));
    }
    public static int solve(int A, int B, int C) {
//        long A = (long)a;
//        long B = (long)b;
//        long C = (long)c;
//        long[] fact = new long[A+1L];
//        fact[0] = 1;
//        fact[1] = 1;
//        for(long i=2; i<=A; i++){
//            fact[i] = fact[i-1]*i;
//            fact[i] %= C;
//        }
        long num = factorial(A, C);
        long denom1 = inverseModulo(factorial(B, C), C);
        long denom2 = inverseModulo(factorial(A-B, C), C);
        long ans = num * denom1;
        ans %= C;
        ans *= denom2;
        ans %= C;
        return (int)ans;
    }

    public static long factorial(long n, long M){
        long result = 1l;
        for (long i = 1l; i <= n; i++)
            result = (result * i) % M;
        return result;
    }

    public static long pow(long A, long B, long C){
        if(A == 0 && B == 0){
            return 0;
        }else if(B == 0){
            return 1;
        }
        long val = pow(A, B/2, C);
        long ans = val * val;
        ans %= C;
        if(B%2 == 1) {
            ans *= A;
            ans %= C;
            return ans;
        }
        return ans;
    }

    public static long inverseModulo(long A, long P){
        return pow(A, P-2, P);
    }
}
