package Scaler;

public class Scaler_GCD_DivisorGame {
    public static void main(String[] args) {
//        System.out.println(solve(12,3,2));
//        System.out.println(solve1(12,3,2));
//        System.out.println(solve(6,1,4));
//        System.out.println(solve1(6,1,4));
//        System.out.println(solve(81991, 2549, 7));
//        System.out.println(solve1(81991, 2549, 7));
//        System.out.println(solve(52503, 9013, 2254));
//        System.out.println(solve1(52503, 9013, 2254));
//        System.out.println(solve(50, 2, 6));
        System.out.println(solve1(10, 2, 6));
    }
    public static int solve(int A, int B, int C) {
        //Scooby calls a positive integer special if it is divisible by B and it is divisible by C:
        //that means I can say X%B = 0, and X%C = 0
        int gcdVal = (B > C) ? gcd(C, B) : gcd(B, C);
        long lcm = (B*C)/gcdVal;
        return (int)(A/lcm);
    }

    public static int solve1(int A, int B, int C) {

        int max = Math.max(B,C);
        //System.out.println("max:"+max);
        int i=1;
        int count=0;
        int val = max;
        while(val<=A){
            val = max*i;
            System.out.println("val:"+val);
            if(val%B==0 && val%C==0) count++;
            i++;
        }

        return count;
    }

    public static int gcd(int A, int B){
        if(A==0){
            return B;
        }
        return gcd(B%A, A);
    }
}
