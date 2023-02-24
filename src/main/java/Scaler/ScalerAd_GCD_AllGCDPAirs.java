package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_GCD_AllGCDPAirs {

    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(2,2,2,2,8,2,2,2,10,15,5,5,1,1,1,1))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(5,5,5,15))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(5,5,5,15))));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> B = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int i_max = 0;
        int count = 0;
        int ind = 0;
        while(true){
            for(int i=0; i<N; i++){
                if(A.get(i) == -1){
                   count++;
                }
            }
            if(count == N){
                break;
            }
            count = 0;
            max = Integer.MIN_VALUE;
            for(int i=0; i<N; i++){
                if(A.get(i) > max){
                    max = A.get(i);
                    i_max = i;
                }
            }

            A.set(i_max, -1);
            B.add(max);
            if(B.size() > 1){
                for(int j=0; j<B.size(); j++){
                    int gcd = gcd(B.get(j), max);
                    for(int k=0; k<2; k++){
                        for(int i=0; i<N; i++){
                            if(A.get(i) == gcd){
                                A.set(i, -1);
                                break;
                            }
                        }
                    }
                }
            }
            ind++;
        }
        return B;
    }

    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
