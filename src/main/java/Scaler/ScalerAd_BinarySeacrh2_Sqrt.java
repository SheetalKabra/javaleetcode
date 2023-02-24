package Scaler;

public class ScalerAd_BinarySeacrh2_Sqrt{
    public static void main(String[] args) {
        System.out.println(sqrt(2147483647));
    }
    public static int sqrt(int A) {
        int l = 0;
        int r = A;
        int ans = 0;
        while(l <= r){
            long mid = (l+r)/2;
            if(mid*mid == A) {
                return (int)mid;
            }else if(mid*mid < A) {
                l = (int)mid+1;
                ans = (int)mid;
            }else{
                r = (int)mid-1;
            }
        }
        return ans;
    }
}
