import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_Sorting2_InversionCount {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(10,3,8,15,6,12,2,18,7,1))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(28, 18, 44, 49, 41, 14))));
        System.out.println(solve(new int[]{45, 10, 15, 25, 50}));
    }

    public static int solve(int[] A) {
        return invCount(A, 0, A.length-1);
    }

    public static int invCount(int[] A, int l, int r){
        int m = 1000000007;
        if(l == r){
            return 0;
        }
        int mid = (l+r)/2;
        int x = invCount(A, l, mid);
        int y = invCount(A, mid+1, r);
        int z = merge(A, l, mid, r);
        return (x%m+y%m+z%m)%m;
    }

    public static int merge(int[] A, int l, int mid, int r){
        int m = 1000000007;
        int p1=l, p2=mid+1, p3=0;
        int[] B = new int[r-l+1];
        int cnt = 0;
        while(p1<=mid && p2<=r){
            if(A[p1] <= A[p2]){
                B[p3] = A[p1];
                p1++;
                p3++;
            }else{
                B[p3] = A[p2];
                p2++;
                p3++;
                cnt += mid-p1+1;
            }
        }
        while(p1<=mid){
            B[p3] = A[p1];
            p1++;
            p3++;
        }
        while(p2<=r){
            B[p3] = A[p2];
            p2++;
            p3++;
            cnt += mid-p1+1;
        }
        for(int i=0; i<B.length; i++){
            A[i+l] = B[i];
        }
        return cnt%m;
    }
}
