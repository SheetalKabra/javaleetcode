import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_TwoPointers_3Sum {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new ArrayList<>(Arrays.asList(2, 1, -9, -7, -8, 2, -8, 2, 3, -8)), -1));
    }
    public static int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int N = A.size();
        int s = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<A.size(); i++){
            int sum = B - A.get(i);
            int l = i+1;
            int r = N-1;
            while(l<=r){
                s = A.get(l)+A.get(r);
                if(s == sum){
                    return B;
                }else if(s < sum){
                    l++;
                    if( ans == Integer.MAX_VALUE ){
                        ans = s + A.get(i);
                    }else{
                        if(s + A.get(i) < ans){
                            ans = s + A.get(i);
                        }
                    }
                }else if(s > sum){
                    r--;
                    if( ans == Integer.MAX_VALUE ){
                        ans = s + A.get(i);
                    }else{
                        if(s + A.get(i) < ans){
                            ans = s + A.get(i);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
