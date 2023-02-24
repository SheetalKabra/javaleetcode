package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_BinarySearch2_SpecialInteger {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList(Arrays.asList(1,1000000000)), 1000000000));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int l = 0;
        int r = A.size();
        int ans = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(boolCheck(A, B, mid)){
                ans = mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }

    public static boolean boolCheck(ArrayList<Integer> A, int B, int k){
        int N = A.size();
        long sum = 0;
        for(int i=0; i<k; i++){
            sum += A.get(i);
        }
        if(sum > B){
            return false;
        }
        for(int i=k; i<N; i++){
            sum -= A.get(i-k);
            sum += A.get(i);
            System.out.println("sum:"+sum);
            if(sum > B){
                return false;
            }
        }
        return true;
    }
}
