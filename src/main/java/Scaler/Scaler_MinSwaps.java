package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_MinSwaps {
    public static void main(String[] args) {
        //System.out.println(solve(new ArrayList<>(Arrays.asList(1, 12, 10, 3, 14, 10, 5)), 8));
        System.out.println(solve(new ArrayList<>(Arrays.asList(52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70 )), 19));
        //System.out.println(solve(new ArrayList<>(Arrays.asList(5, 17, 100, 11)), 20));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        //I will use sliding window here
        int N = A.size();
        int countOfNoLessThanEqualsToB = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) <= B){
                countOfNoLessThanEqualsToB++;
            }
        }
        System.out.println("countOfNoLessThanEqualsToB:"+countOfNoLessThanEqualsToB);
        //now we have a fixed sized window of size countOfNoLessThanEqualsToB
        //in this window size we need to calculate the count of number less than equals to B. and store this count to max
        //in whichever window we will have max count, we will shift our elements to that window only because it required less swaps
        //so ans will be  countOfNoLessThanEqualsToB - max;
        int e = 0;
        //int max = Integer.MIN_VALUE;
        int countUnderWindow=0;
        for(int s=0; s<countOfNoLessThanEqualsToB; s++){
            if (A.get(s) <= B) {
                countUnderWindow++;
            }
        }
        int max = countUnderWindow;
        System.out.println("maxfirst:"+max);
        for(int s=1; s<=N-countOfNoLessThanEqualsToB; s++){
            //e-s+1 = countOfNoLessThanEqualsToB;
            //e = countOfNoLessThanEqualsToB - 1 + s;
            e = countOfNoLessThanEqualsToB - 1 + s; // s=1; e=11-1+1=11
            System.out.println("s:"+s+",e:"+e);
            //countUnderWindow = 0;
            if(A.get(s-1) <= B ){
                countUnderWindow--;
            }
            System.out.println("e element:"+A.get(e));
            if(A.get(e) <= B){
                countUnderWindow++;
            }
            System.out.println("countUnderWindow:"+countUnderWindow);
            // for(int i=s; i<=e; i++){
            //     if(A.get(i) <= B){
            //         countUnderWindow++;
            //     }
            // }
            max = Math.max(max, countUnderWindow);
            System.out.println("max:"+max);
        }
        return countOfNoLessThanEqualsToB - max;



//        int e = 0;
//        int max = Integer.MIN_VALUE;
//        int countUnderWindow=0;
//
//        for(int s=0; s<=N-countOfNoLessThanEqualsToB; s++){
//            //e-s+1 = countOfNoLessThanEqualsToB;
//            //e = countOfNoLessThanEqualsToB - 1 + s;
//            e = countOfNoLessThanEqualsToB - 1 + s;
//            System.out.println("s:"+s+", e:"+e);
//            countUnderWindow = 0;
//            for(int i=s; i<=e; i++){
//                if(A.get(i) <= B){
//                    countUnderWindow++;
//                }
//            }
//            System.out.println("countUnderWindow:"+countUnderWindow);
//            max = Math.max(max, countUnderWindow);
//            System.out.println("maxCount:"+max);
//        }
//        return countOfNoLessThanEqualsToB - max;
    }
}
