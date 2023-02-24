package Scaler;

public class ScalerAd_Sorting3_QuickSort {
    public static void main(String[] args) {
        solve(new int[]{1, 4, 10, 2, 1, 5});

    }
    public static int[] solve(int[] A) {
        quickSort(A, 0, A.length-1);
        System.out.println("op:");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+", ");
        }
        return A;
    }

    public static int rearrange(int[] A, int l, int r){
        int left = l+1;
        int right = r;
        while(left<= right){
            if(A[left] <= A[l]){
                left++;
            }else if(A[right] > A[l]){
                right--;
            }else{
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        int tempi = A[l];
        A[l] = A[right];
        A[right] = tempi;
        System.out.println("here:");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+", ");
        }
        System.out.println("");
        return right;
    }

    public static void quickSort(int[] A, int l, int r){
        if(l >= r){
            return;
        }
        int idx = rearrange(A, l, r);
        System.out.println("idx:"+idx);
        quickSort(A, l, idx-1);
        System.out.println("idx:"+idx);
        quickSort(A, idx+1, r);
    }
}
