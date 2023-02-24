package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_BinarySearch3_PaintersPartititon {
    public static void main(String[] args) {
//        System.out.println(paint(10, 1, new ArrayList<>(Arrays.asList(1,8,11, 3))));
//        System.out.println(paint(2, 5, new ArrayList<>(Arrays.asList(1,10))));
        System.out.println(paint(1, 1000000, new ArrayList<>(Arrays.asList(1000000,1000000))));
    }

    public static int paint(int A, int B, ArrayList<Integer> C) {
        int m = 10000003;
        int l = Collections.max(C);
        long r = 0;
        for(int i=0; i<C.size(); i++){
            r += C.get(i);
        }
        if(A == 1){
            return (int) ((r%m * B%m)%m);
        }
        long ans = -1;
        while(l <= r) {
            int mid = (int) ((l+r)/2);
            if (finish(C, mid, A)) {
                ans = mid%m;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)(ans%m * B%m)%m;
    }

    public static boolean finish( ArrayList<Integer> C, int hrs, int w){
        int timepassed = 0;
        if(hrs<Collections.max(C)){
            return false;
        }
        for(int i=0; i<C.size(); i++){
            if(w == 0){
                return false;
            }
            if(timepassed + C.get(i) <= hrs){
                timepassed += C.get(i);
            }else{
                w--;
                timepassed = C.get(i);
                if(w == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
