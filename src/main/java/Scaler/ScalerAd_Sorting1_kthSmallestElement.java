package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScalerAd_Sorting1_kthSmallestElement {
    public static void main(String[] args) {
//        System.out.println(kthsmallest(new ArrayList<>(Arrays.asList(8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92)), 9));
        System.out.println(kthsmallest(new ArrayList<>(Arrays.asList(94, 87, 100, 11, 23, 98, 17, 35, 43, 66, 34, 53, 72, 80, 5, 34, 64, 71, 9, 16, 41, 66, 96)), 19));
    }

        public static int kthsmallest(final List<Integer> A, int B) {
            int[] arr = new int[A.size()];
            for(int i=0; i<A.size(); i++){
                arr[i] = A.get(i);
            }
            int min = Integer.MAX_VALUE;
            for(int i=0; i<B; i++){
                System.out.println("min:"+min);
                min = Integer.MAX_VALUE;
                int ind = 0;
                for(int j=i; j<A.size(); j++){
                    if(arr[j] < min){
                        min = arr[j];
                        ind = j;
                    }
                }
                //swap
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
            }
            for(int i=0; i<A.size(); i++){
                System.out.print(arr[i]+", ");
            }
            System.out.println("out");
            return min;
        }
}
