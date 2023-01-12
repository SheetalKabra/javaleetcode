public class ScalerAd_DP2_NDigitNumbers {
    public static void main(String[] args) {
        ScalerAd_DP2_NDigitNumbers s = new ScalerAd_DP2_NDigitNumbers();
        System.out.println(s.solve(3, 8));
        System.out.println(s.solve(3, 7));
        System.out.println(s.solve(3, 6));
        System.out.println(s.solve(3, 5));
        System.out.println(s.solve(3, 4));
        System.out.println(s.solve(3, 3));
        System.out.println(s.solve(3, 2));
        System.out.println(s.solve(3, 1));
        System.out.println(s.solve(4, 8));
    }
    public int solve(int A, int B) {
        if(B > A*9){
            return 0;
        }
        if(A == 2){
            return B;
        }
        int sum = 0;
        for(int i=B-1; i>=1; i--){
            sum = sum + solve(A-1, B-i) + (A-2);


        }
        sum = sum  + 1;
        return sum;
    }
}
