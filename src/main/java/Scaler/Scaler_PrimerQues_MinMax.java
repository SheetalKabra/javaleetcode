package Scaler;

import java.util.Scanner;

public class Scaler_PrimerQues_MinMax {
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



        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for(int i=0; i<N; i++){
            System.out.println("val:"+arr[i]);
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                System.out.println("min:"+arr[i]);
                min = arr[i];
            }
        }
        System.out.println(max+ " "+ min);

    }
}
