package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_BinarySearch3_AggressiveCows {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 3));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(5, 17, 100, 11)), 2));
        System.out.println(solve(new ArrayList<>(Arrays.asList(82, 61, 38, 88, 12, 7, 6, 12, 48, 8, 31, 90, 35, 5, 88, 2, 66, 19, 5, 96, 84, 95)), 8));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        Collections.sort(A);
        System.out.println(A);
        int l = 1;
        int r = A.get(N - 1) - A.get(0);
        int ans = 1;
        while (l <= r) {
            int mid = (l + r) / 2;
//            System.out.println("mid:"+mid);
//            System.out.println("accomodateCows:"+accomodateCows(A, mid, B));
            if (accomodateCows(A, mid, B) == true) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static boolean accomodateCows(ArrayList<Integer> A, int distance, int B) {
        System.out.println("distance:"+distance);
        int N = A.size();
        int lastCow = A.get(0);
        B -= 1;
        System.out.println("lastCow:"+lastCow);
        for (int i = 1; i < N; i++) {
            if ((A.get(i) - lastCow) >= distance) {
                lastCow = A.get(i);
                System.out.println("lastCow:"+lastCow);
                B -= 1;
                if (B == 0) {
                    return true;
                }
            }
        }
        if (B <= 0) {
            return true;
        }
        return false;
    }
}
