public class Scaler_RecursionAd_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solve(123));
    }
    public static int solve(int A) {
        if(A==0){
            return 0;
        }
        int rem = A%10;
        System.out.println(A/10);
        return solve(A/10)+rem;
    }
}
