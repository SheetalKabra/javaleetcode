package Scaler;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] f = new int[A+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=A;i++){
            f[i] = f[i-1] + f[i-2];
            System.out.println(f[i]);
        }

    }
}
