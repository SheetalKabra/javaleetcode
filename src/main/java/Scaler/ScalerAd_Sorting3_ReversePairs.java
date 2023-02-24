package Scaler;

public class ScalerAd_Sorting3_ReversePairs {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 3, 2, 3, 1}));
//        System.out.println(solve(new int[]{4,1,2}));

    }
    public static int solve(int[] A) {
        return invCount(A, 0, A.length-1);
    }
    public static int invCount(int[] A, int l, int r){
        if(l == r){
            return 0;
        }
        int mid = (l+r)/2;
        int x = invCount(A, l, mid);
        int y = invCount(A, mid+1, r);
        int z = countImpInversionCount(A, l, mid, r);
        merge(A, l, mid, r);
        return x+y+z;
    }

    public static int countImpInversionCount(int[] A, int l, int mid, int r){
        int p1=l;
        int p2=mid+1;
        int p3=0;
        int cnt = 0;
        while(p1<=mid && p2<=r){
            if(A[p1] > 2*A[p2]){
                cnt += mid-p1+1;
                p2++;
            }else{
                p1++;
            }
        }
        return cnt;
    }

    public static void merge(int[] A, int l, int mid, int r){
        int p1=l;
        int p2=mid+1;
        int p3=0;
        int[] B = new int[r-l+1];
        while(p1<=mid && p2<=r){
            if(A[p1]<=A[p2]){
                B[p3] = A[p1];
                p1++;
                p3++;
            }else{
                B[p3] = A[p2];
                p2++;
                p3++;
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
        }
        for(int i=0; i<B.length; i++){
            A[i+l] = B[i];
        }
    }
}
