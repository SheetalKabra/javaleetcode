package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_BinarySearch2_MatrixMedian {

    public static void main(String[] args) {
        ArrayList<Integer> A= new ArrayList<>(Arrays.asList(1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3));
        ArrayList<ArrayList<Integer>> B1 = new ArrayList();
        B1.add( new ArrayList<>(Arrays.asList(1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3)));
        System.out.println(findMedian(B1));


        ArrayList<ArrayList<Integer>> B = new ArrayList();
        B.add(new ArrayList<>(Arrays.asList(1,3,5)));
        B.add(new ArrayList<>(Arrays.asList(2,6,9)));
        B.add(new ArrayList<>(Arrays.asList(3,6,9)));
        //System.out.println(B);
        System.out.println(findMedian(B));
    }
    public static int findMedian(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        int M = A.get(0).size();
        if(N == 1 && M == 1){
            System.out.println("iff");
            return A.get(0).get(0);
        }
        int l = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            l = Math.min(l, A.get(i).get(0));
        }
        int r = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            r = Math.max(r, A.get(i).get(M-1));
        }
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            //System.out.println("mid:"+mid);
            if(elementsSmaller(A, mid) > (N*M)/2){
                r = mid-1;
            }else{
                ans = mid;
                l = mid+1;
            }
        }
        System.out.println("ans:"+ans);
        return ans;
    }

    public static int elementsSmaller(ArrayList<ArrayList<Integer>> A, int val){
        int cnt = 0;
        for(int i=0; i<A.size(); i++){
            cnt += smaller(A.get(i), val);
        }
        //System.out.println("cnt:"+cnt);
        return cnt;
    }

    public static int smaller(ArrayList<Integer> A, int val){
        if(A.get(0) >= val){
            return 0;
        }
        int l=0;
        int r=A.size()-1;
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid) >= val){
                r = mid-1;
            }else{
                l = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
