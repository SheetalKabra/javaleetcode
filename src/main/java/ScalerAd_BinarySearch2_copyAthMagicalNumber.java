public class ScalerAd_BinarySearch2_copyAthMagicalNumber {
    public static void main(String[] args) {
//        System.out.println(solve(6, 2, 3));
//        System.out.println(solve(1, 2, 3));
//        System.out.println(solve(33488383, 565, 29473));
        System.out.println(solve(807414236, 3788, 38141));
    }
    public static int solve(int A, int B, int C) {

        long l = Math.min(B,C);
        long r = (long) A *Math.max(B,C);
        int mod = 1000000007;
        System.out.println("l:"+l);
        System.out.println("r:"+r);
        while(l<=r){
            long mid = (l+r)/2;
            long ans = ((mid/B) + (mid/C)-(mid/lcm(C,B)));
            System.out.println("mid:"+mid);
            System.out.println("lcm:"+lcm(C,B));
            System.out.println("mid/B:"+(mid/B));
            System.out.println("mid/C:"+(mid/C));
            System.out.println("mid/lcm:"+(mid/lcm(C,B)));
            System.out.println("ans:"+ans);



            if(ans<A) l = mid+1;
            if(ans>A) r = mid-1;
            if(ans==A){
                System.out.println("equals:mid:"+mid);
                if((mid%B==0) || (mid%C==0)) {

                    long result = mid%mod;

                    return (int)result;

                }
                r = mid-1;
            }
        }

        return 0;
    }


    static long lcm(int A, int B){
        int max = Math.max(A,B);

        long val = max;

        while(true) {
            if( val % A == 0 && val % B == 0 ) {
                return val;
            }
            val+=max;
        }
    }
}
