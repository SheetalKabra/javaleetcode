import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_BinarySearch1_FindAPeakElement {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(5, 17, 100, 11))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(50,4,3,2,1))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(50,4,3,2,1))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1,2,3,5,4,1))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(10))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 1000000000, 1000000000))));

    }
    public static int solve(ArrayList<Integer> A) {
        int N = A.size();
        if(N == 1){
            return A.get(0);
        }
        //edge cases:
        if(A.get(0) >= A.get(1)){
            return A.get(0);
        }
        if(A.get(N-1) >= A.get(N-2)){
            return A.get(N-1);
        }
        int l = 1;
        int r = N-2;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid) > A.get(mid-1) && A.get(mid) > A.get(mid+1)){
                return A.get(mid);
            }else if(A.get(mid) > A.get(mid-1) && A.get(mid) < A.get(mid+1)){
                //go to right
                l=mid+1;
            }else if(A.get(mid) < A.get(mid-1) && A.get(mid) > A.get(mid+1)){
                //go to left
                r=mid-1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
}
