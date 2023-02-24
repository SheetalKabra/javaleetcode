package Scaler;

public class Scaler_BitManiII_DivideIntegers {
    public static void main(String[] args) {
        System.out.println(divide(5,2));
        System.out.println(divide(7,1));
        System.out.println(divide(2147483647,1));
        System.out.println(divide(-2147483648,1));
        System.out.println(divide(-2147483648,-10000000));
        System.out.println(divide(-2147483648,10000000));

    }
    public static int divide(int A, int B) {
        long cnt = 0;
        long n = Math.abs(B);
        if(Math.abs(B) == 1) {
            if (A > Integer.MAX_VALUE || (long) A * B > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return A;
            }
        }

        while(Math.abs((long)A)>=n){
            n = n + Math.abs(B);
           // System.out.println("n:"+n);
            cnt++;
            if(cnt > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        if((A>0 && B>0) || (A<0 && B<0)){
            return (int)cnt;
        }else{
            return -(int)cnt;
        }


    }
}
