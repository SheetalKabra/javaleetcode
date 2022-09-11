public class InterviewBit_TrailingZeroesInFactorial {
    public static void main(String[] args) {
        System.out.println(solve(100));
        System.out.println(trailingZeroes(4300));
//        System.out.println(solve(5));
//        System.out.println(solve(8));
//        System.out.println(solve(10));
//        System.out.println(solve(12));
//        System.out.println(solve(15));
//        System.out.println(solve(20));
    }
    public static int trailingZeroes(int A) {
        int count = 0;
        long num = 5;
        while (num <= 1L * A) {
            count += ((int) (A / num));
            num *= 5;
        }
        return count;

    }
    public static int solve(int A) {
        int num = 5;
        int sum = 0;
        int count = 0;
        while(A >= num) {
            sum += A/num;
            num *= 5;
        }
        return sum;
    }
}
