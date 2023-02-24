package Scaler;

import java.util.Scanner;

public class RemoveThat {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int deletingPos = sc.nextInt();
        for(int i=0; i<N; i++){
            if(i != (deletingPos - 1)){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
