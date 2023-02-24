package Scaler;

public class Scaler_RecursionAd1_IsMagic {
    public static void main(String[] args) {
        System.out.println(solve(1291));
    }
    public static int solve(int A) {
        if(A/10 == 0){
            if(A == 1) return 1;
            else return 0;
        }
        return solve(sumOfDigits(A));
    }

    public static int sumOfDigits(int A){
        if (A == 0) return 0;
        return sumOfDigits(A/10) + A%10;
    }
}
