package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KPMG {
    public static void main(String[] args) {
        int[] arr= {-6,1,2,3,4,5};
        int len = arr.length;
        int[] result = new int[len];
        for(int i=0; i<len; i++){
            result[i] = arr[i]*arr[i];
        }
        System.out.println(Arrays.asList(result));
        merge(0, len-1, result);
        System.out.println(Arrays.asList(result));
    }


    public static void merge(int l, int r, int[] arr){
        if(l==r){
            return;
        }
        int mid = (l+r)/2;
        merge(l, mid, arr);
        merge(mid+1, r, arr);
        mergeSort(l, mid, r, arr);
    }

    public static void mergeSort(int l, int y, int r, int[] arr){
        int p1= l;
        int p2 = y;
        int p3 = 0;
        int[] resultarr = new int[r-l+1];
        while(p1<y && p2<=r){
            if (arr[p1] < arr[p2]) {
                resultarr[p3] = arr[p1];
                p1++;
                p3++;
            }else if(arr[p2] < arr[p1]){
                resultarr[p3] = arr[p2];
                p2++;
                p3++;
            }
        }
        if(p1<y){
            while(p1<y){
                resultarr[p3] = arr[p1];
                p1++;
                p3++;
            }
        }

        if(p2<=r){
            while(p2<=r){
                resultarr[p3] = arr[p2];
                p2++;
                p3++;
            }
        }
        for(int i=l; i<=r; i++){
            arr[l] = resultarr[i-l];
            l++;
        }
        //return resultarr;
    }




}
