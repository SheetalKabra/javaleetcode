package Scaler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing1_ColorfulNumber {
    public static void main(String[] args) {
        System.out.println(colorful(3245));
        System.out.println(colorful(23));
        System.out.println(colorful(236));
    }

    public static int colorful(int A) {
        Map<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        while(A > 0){
            int rem = A%10;
            A = A/10;
            arr.add(rem);
        }
//        System.out.println(arr);
        int N = arr.size();
        for(int i=0; i<N; i++){
            int product = 1;
            for(int j=i; j<N; j++){
                product *= arr.get(j);
                if(hm.containsKey(product)){
//                    System.out.println(product);
//                    System.out.println(hm);
                    return 0;
                }else{
//                    System.out.println("insert product:"+product);
                    hm.put(product,i);
                }
            }
        }

        return 1;
    }
}
