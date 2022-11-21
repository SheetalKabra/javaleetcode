import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_BinarySearch3_FoodPacketDist {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList(Arrays.asList(8, 7, 1, 5, 5, 10, 10, 1, 5, 3)), 17));
//        System.out.println(solve(new ArrayList(Arrays.asList(10000, 20000, 30000)), 6));
//        System.out.println(solve(new ArrayList(Arrays.asList(1,1,1)), 4));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int l = 1;
        int r = Collections.min(A);
        long sum = sum(A);
        if(sum < B){
            return 0;
        }

        int ans = 0;
        while(l <= r){
            int mid = (l+r)/2;
            System.out.println("l:"+l+", r:"+r+", mid:"+mid);
            if(isDistribution(A, mid, B)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }

    public static boolean isDistribution(ArrayList<Integer> A, int mid, int B){
        int count = 0;
        for(int i=0; i<A.size(); i++){
            count += Math.max(1, A.get(i)/mid);
        }
        System.out.println("mid:"+mid+", count:"+count);
        if(count >= B){
            return true;
        }
        return false;
    }

    public static long sum(ArrayList<Integer> A){
        long sum = 0;
        for(int i=0; i<A.size(); i++){
            sum = sum + A.get(i);
        }
        return sum;
    }
}
