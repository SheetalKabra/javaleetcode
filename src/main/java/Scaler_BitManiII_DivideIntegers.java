public class Scaler_BitManiII_DivideIntegers {
    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(divide(5,2));
//        System.out.println(divide(7,1));
//        System.out.println(divide(2147483647,1));
        System.out.println(divide(-2147483648,-1));

    }
    public static int divide(int A, int B) {
        System.out.println(B*A);
        int cnt = 0;
        int n = B;
        if(Math.abs(B) == 1){
            System.out.println(B);
            System.out.println(A);
            if(B > Integer.MAX_VALUE || B*A > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            } else {
                if(B > 0){
                    return -A;
                }else{
                    return A;
                }

            }
        }
        while(A>=n){
            n += B;
            cnt++;
            if(cnt > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

        }
        return cnt;
    }
}
