package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScalerAd_DP1_Fibonacci {
    public static ArrayList<Integer> f = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<=N; i++){
            if(i == 0){
                f.add(i, 0);
            }else if(i == 1){
                f.add(i, 1);
            }else{
                f.add(i, -1);
            }
        }
        fib(N);
        System.out.print(f.get(N));
    }

    public static int fib(int N){
        if(f.get(N) != -1){
            return f.get(N);
        }
        int ans = fib(N-1)+fib(N-2);
        f.set(N, ans);
        return ans;
    }


}
