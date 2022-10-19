public class ScalerAd_BinarySearch2_AthMagicalNumber {
    public static void main(String[] args) {
//        System.out.println(solve(6, 2, 3));
//        System.out.println(solve(1, 2, 3));
        System.out.println(solve(33488383, 565, 29473));
    }
    public static int solve(int A, int B, int C) {
        //range of A is min(B, C) to min(B,C)*A
        int m = 1000000009;
        long l = Math.min(B, C);
        long r = Math.min(B, C)*A;
        System.out.println("l:"+l+", r:"+r);
        while(l <= r){
            long mid = (l+r)/2;
            System.out.println("mid:"+mid);
            int x = countMultiples(B, C, mid);
            System.out.println("x:"+x);
            if(x == A){
                if(mid%B == 0 || mid%C == 0){
                    return (int)mid%m;
                }
                r=mid-1;
            }else if(x > A){
                r = mid-1;
            }else if(x < A){
                l = mid+1;
            }
        }
        return (int)r;
    }

    public static int gcd(int A, int B){
        if(A == 0){
            return B;
        }
        return gcd(B%A, A);
    }

    public static int countMultiples(int B, int C, long mid){
        int lcm = (B*C)/gcd(B,C);
        if(B > C){
            lcm = (B*C)/gcd(C,B);
        }
        return (int)(mid/B) + (int)(mid/C) - (int)(mid/lcm);
    }
}
