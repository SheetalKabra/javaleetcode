package Scaler;

import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for(int i=0;i<T;i++){
            arr[i] = sc.nextInt();
        }
        int rem = 0, sum = 0, div =  arr[0];
        for(int i=0;i<T;i++){
            rem = 0;
            sum = 0;
            div = arr[i];
            while(div > 0){
                rem = div % 10;
                div = div / 10;
                sum = sum + rem;
            }
            System.out.println(sum);
        }
    }
}
