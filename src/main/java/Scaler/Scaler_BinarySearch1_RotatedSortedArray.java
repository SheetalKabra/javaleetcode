package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scaler_BinarySearch1_RotatedSortedArray {
    public static void main(String[] args) {
//        System.out.println(getPivot(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8))));
//        System.out.println(getPivot(new ArrayList<>(Arrays.asList(8,10,0,1,2,4,6))));
//        System.out.println(getPivot(new ArrayList<>(Arrays.asList(6,8,10,0,1,2,4))));
//        System.out.println(getPivot(new ArrayList<>(Arrays.asList(4,6,8,10,0,1,2))));
//        System.out.println(getPivot(new ArrayList<>(Arrays.asList(2,4,6,8,10,0,1))));
//        System.out.println(getPivot(new ArrayList<>(Arrays.asList(1,2,4,6,8,10,0))));
//        System.out.println(getPivot(new ArrayList<>(Arrays.asList(0,1,2,4,6,8,10))));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 10));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 0));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 1));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 2));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 4));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 6));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 8));
        System.out.println(search(new ArrayList<>(Arrays.asList(10,0,1,2,4,6,8)), 8));
        System.out.println(search(new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3)), 41));
        System.out.println(search(new ArrayList<>(Arrays.asList(1)), 1));
//        System.out.println(search(new ArrayList<>(Arrays.asList(9, 10, 12, 13, 24, 26, 27, 28, 29, 43, 48, 51, 54, 56, 57, 59, 62, 66, 70, 71,
//                72, 74, 75, 77, 78, 81, 83, 85, 87, 88, 89, 90, 91, 92, 93, 97, 98, 99, 101, 102, 104, 105, 107, 112, 113, 115, 123,
//                126, 127, 132, 133, 134, 135, 136, 143, 144, 148, 150, 151, 152, 154, 159, 160, 161, 163, 167, 169, 170, 174, 176, 177,
//                179, 180, 181, 183, 185, 186, 187, 188, 193, 194, 196, 197, 198, 199, 200, 203, 1, 6, 7, 8)), 38));


    }

    public static int search(final List<Integer> A, int B) {

        int pivotIndex = getPivot(A);
//        System.out.println("pivotIndex:"+pivotIndex);

        if(A.get(pivotIndex) == B){
            return pivotIndex;
        }
        int isFound = searchEle(A, B, 0, pivotIndex-1);
        if(isFound == -1){
            return searchEle(A, B, pivotIndex+1, A.size()-1);

        }
        return isFound;

    }

    public static int searchEle(final List<Integer> A, int B, int left, int right){
        int l = left;
        int r = right;
        while(l<=r){
            int mid = (l+r)/2;
            if(A.get(mid) == B){
                return mid;
            }else if(A.get(mid) > B){
                r=mid-1;
            }else if(A.get(mid) < B){
                l=mid+1;
            }
        }
        return -1;
    }

    public static int getPivot(final List<Integer> A){
//        System.out.println("size: "+A.size());
        int l = 0;
        int r = A.size()-1;
        while(l<=r){

            if(r-1 >=0 && A.get(r) < A.get(r-1) && A.get(r) < A.get(l)){
                return r;
            }
            if(l+1 <= r){
                if(A.get(l) < A.get(l+1) && A.get(l) < A.get(r)){
                    return l;
                }
            }else{
                //if(A.get(l) < A.get(l-1) && A.get(l) < A.get(r)){
                    return l;
                //}
            }

            int mid = (l+r)/2;
            if(A.get(mid-1) > A.get(mid) && A.get(mid+1) > A.get(mid) ){
                return mid;
            }else if(A.get(l) > A.get(mid)){
//                System.out.println("goto left, mid:"+mid+", value:"+A.get(mid));
                r = mid-1;
//                System.out.println("continue, r:"+r);
            }else if(A.get(l) < A.get(mid)){
//                System.out.println("goto right, mid:"+mid+", value:"+A.get(mid));
                l = mid+1;
//                System.out.println("continue, l:"+l);
            }
        }
        return -1;
    }
}
