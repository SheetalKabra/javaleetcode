package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Scaler_BinarySearch2_KthPrice {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(2,1,4,3,2)), 1));
    }
    public static int solve(final List<Integer> A, int B) {
        int max = Collections.max(A);
        int min = Collections.min(A);
        int l = min;
        int r = max;
        while(l<=r){
            int mid = (l+r)/2;
            int countSmaller = getCountSmaller(A, mid);
            int countEqual = getCountEqual(A, mid);
            if(countSmaller < B && countEqual+countSmaller >= B){
                return mid;
            }else if(countSmaller < B){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;

    }

    public static int getCountSmaller(final List<Integer> A, int B){
        int N = A.size();
        int countSmaller = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) < B){
                countSmaller++;
            }
        }
        return countSmaller;
    }

    public static int getCountEqual(final List<Integer> A, int B){
        int N = A.size();
        int countEqual = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) == B){
                countEqual++;
            }
        }
        return countEqual;
    }
}
