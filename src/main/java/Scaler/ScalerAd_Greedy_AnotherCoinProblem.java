package Scaler;

public class ScalerAd_Greedy_AnotherCoinProblem {
    public static void main(String[] args) {
        ScalerAd_Greedy_AnotherCoinProblem s = new ScalerAd_Greedy_AnotherCoinProblem();
//        System.out.println(s.solve(47));
//        System.out.println(s.solve(9));
        System.out.println(s.solve(35));
    }
    public int solve(int A) {
        int B = A;
        int ans = 0;

        while(B >= 5){
            A = B;
            int exp = 0;
            System.out.println("before: A:"+A);
            while(A >= 5){
                A = A/5;
                exp++;
            }
            System.out.println("A:"+A+", exp:"+exp);
            B = B - (int)Math.pow(5, exp);
            ans++;
        }
        return ans+B;
    }
}
