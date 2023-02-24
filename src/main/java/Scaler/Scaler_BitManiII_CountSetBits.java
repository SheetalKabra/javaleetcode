package Scaler;

public class Scaler_BitManiII_CountSetBits {
    public static void main(String[] args) {
        System.out.println(solve(1));
        System.out.println(solve(2));
        System.out.println(solve(3));
        System.out.println(solve(4));
        System.out.println(solve(5));
        System.out.println(solve(6));
        System.out.println(solve(7));
        System.out.println(solve(8));
        System.out.println(solve(9));
        System.out.println(solve(10));
        System.out.println(solve(11));
        System.out.println(solve(12));
        System.out.println(solve(13));
        System.out.println(solve(14));
        System.out.println(solve(15));
        System.out.println(solve(16));
        System.out.println(solve(17));
        System.out.println(solve(18));
        System.out.println(solve(19));
        System.out.println(solve(20));
    }
    public static int solve(int A) {
        int m = 1000000007;
        long count = 0;
        for(int k=0; k<32 ;k++){
            if(k==0){
                //for 0th bit
                if(A%2 == 0){
                    count += A/2;
                }else{
                    count += A/2 + 1;
                }
                //System.out.println("0th bit:"+count);
            }else {
                count += (int) Math.pow(2, k) * (A / (int) Math.pow(2, k + 1));
                if ((A % (int) Math.pow(2, k + 1)) >= (int) Math.pow(2, k)) {
                    count += (A % (int) Math.pow(2, k + 1)) - (int) Math.pow(2, k) + 1;
                }
                //System.out.println(k+"th bit:"+count);
            }
            count = count%m;
        }
        return (int)count%m;
    }
}
