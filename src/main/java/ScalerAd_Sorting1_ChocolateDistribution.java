public class ScalerAd_Sorting1_ChocolateDistribution {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 4, 1, 9, 56, 7, 9, 12}, 5));

    }

    public static int solve(int[] A, int B) {
        mergeSort(A, 0, A.length-1);

        int min = Integer.MAX_VALUE;
        for(int s=0; s<=A.length-B; s++){
            //e-s+1 = k
            int e = B-1+s;
            min = Math.min(min, A[e]-A[s]);
        }
        return min;
    }

    public static void mergeSort(int[] A, int l, int r){
        if(l==r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(A, l, mid);
        mergeSort(A, mid+1, r);
        merge(A, l, mid+1, r);
    }

    public static void merge(int[] A, int l, int y, int r){
        int p1 = l;
        int p2 = y;
        int p3 = 0;
        int[] temp = new int[r-l+1];
        while(p1<y && p2<=r){
            if(A[p1] <= A[p2]){
                temp[p3] = A[p1];
                p1++;
                p3++;
            }else{
                temp[p3] = A[p2];
                p2++;
                p3++;
            }
        }
        while(p1<y){
            temp[p3] = A[p1];
            p1++;
            p3++;
        }

        while(p2<=r){
            temp[p3] = A[p2];
            p2++;
            p3++;
        }
        for(int i=l; i<=r; i++){
            A[i] = temp[i-l];
        }

    }
}
