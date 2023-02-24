package Scaler;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=N-i; j>0; j--){
                System.out.print("*");
            }
            for(int k=i; k>0; k--){
                System.out.print(" ");
            }
            for(int k=i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=N-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=N-i; k>0; k--){
                System.out.print(" ");
            }
            for(int k=N-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
