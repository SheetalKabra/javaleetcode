package Scaler;

import java.util.Scanner;

public class InsertThat {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        arr[N] = 0;
        for(int i=0;i<=N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("=============");
        int insertingPos = sc.nextInt();
        int insertingElement = sc.nextInt();
        for(int i=N; i>insertingPos-1; i--){
            arr[i] = arr[i-1];
        }
        arr[insertingPos-1] = insertingElement;
        for(int i=0;i<=N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
