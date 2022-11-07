public class ScalerAd_BinarySearch2_AthMagicalNumber {
    public static void main(String[] args) {
//        System.out.println(solve(6, 2, 3));
//        System.out.println(solve(1, 2, 3));
//        System.out.println(solve(33488383, 565, 29473));
        System.out.println(solve(807414236, 3788, 38141));
    }
    public static int solve(int A, int B, int C) {
        //range of A is min(B, C) to min(B,C)*A
        int m = 1000000007;
        long l = Math.min(B, C);
        long r = (long) A *Math.min(B,C);
//        System.out.println("l:"+l);
//        System.out.println("r:"+r);
        while(l <= r){
            long mid = (r-l)/2 + l;
//            long lcm = 1;
//            if(B > C){
//                lcm = (B*C)/gcd(C,B);
//            }else{
//                lcm = (B*C)/gcd(B,C);
//            }
//            System.out.println("mid:"+mid);
//            System.out.println("lcm:"+lcm);
//            System.out.println("mid/B:"+(mid/B));
//            System.out.println("mid/C:"+(mid/C));
//            System.out.println("mid/lcm:"+(mid/lcm));
//            long x = ((mid/B) + (mid/C) - (mid/lcm));
//            System.out.println("x:"+x);
            long x = countMultiples(B, C, mid);
            if(x == A){
//                System.out.println("equals:mid:"+mid);
                if(mid%B == 0 || mid%C == 0){
                    long result = mid%m;

                    return (int)result;
                }
                r=mid-1;
            }else if(x > A){
                r = mid-1;
            }else if(x < A){
                l = mid+1;
            }
        }
        return 0;
    }

    public static int gcd(int A, int B){
        if(A == 0){
            return B;
        }
        return gcd(B%A, A);
    }

    public static long countMultiples(int B, int C, long mid){
        long lcm;
        if(B > C){
            lcm = (long)(B*C)/gcd(C,B);
        }else{
            lcm = (long)(B*C)/gcd(B,C);
        }
        return ((mid/B) + (mid/C) - (mid/lcm));
    }

}
