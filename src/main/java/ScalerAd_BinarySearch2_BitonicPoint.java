import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_BinarySearch2_BitonicPoint {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,20,50,40,10)), 5));
        System.out.println(solve(new ArrayList<>(Arrays.asList(3, 9, 10, 20, 23, 5, 1)), 1));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        //A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.
        int bitonicPoint = getBitonicPoint(A);
        //case 1: till Bitonic point we will have the number in sorted order in asc
        int l = 0;
        int r = bitonicPoint;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid) == B){
                return mid;
            }else if(A.get(mid) < B){
                //go to right
                l=mid+1;
            }else if(A.get(mid) > B){
                //goto left
                r=mid-1;
            }
        }
        //case 2: after Bitonic point we will have the number in sorted order in desc
        int l1 = bitonicPoint+1;
        int r1 = N-1;
        while(l1<=r1){
            int mid1 = (l1+r1)/2;
            if(A.get(mid1) == B){
                return mid1;
            }else if(A.get(mid1) < B){
                //go to left
                r1=mid1-1;

            }else if(A.get(mid1) > B){
                //goto right
                l1=mid1+1;
            }
        }
        return -1;
    }

    public static int getBitonicPoint(ArrayList<Integer> A){
        int N = A.size();
        int l = 0;
        int r = N-1;
        int ans = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid) > A.get(mid-1) && A.get(mid) > A.get(mid+1)){
                return mid;
            }else if(A.get(mid-1) < A.get(mid) && A.get(mid+1) > A.get(mid)){
                //this is the small-big case
                ans = mid;
                l=mid+1;
            }else if(A.get(mid-1) > A.get(mid) && A.get(mid+1) < A.get(mid)){
                //this is the big-small case
                r=mid-1;
            }
        }
        return ans;
    }
}
