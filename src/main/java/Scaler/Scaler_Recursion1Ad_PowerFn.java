package Scaler;

public class Scaler_Recursion1Ad_PowerFn {
    public static void main(String[] args) {
        System.out.println(pow(213, 231, 1));
    }
    public static int pow(int A, int B, int C) {
        if(A == 0){
            return 0;
        }else if(B == 0){
            return 1;
        }
        long val = pow(A, B/2, C);
        long ans = val*val;
        ans %= C;
        if(B%2 == 1){
            ans *= A;
            ans %= C;
        }
        if(ans<0){
            ans += C;
        }

        return (int)ans;
    }
}
