package Scaler;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int N = sc.nextInt();
        for(int i=2; i<=N; i++){
            isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.println(i);
            }
        }
    }
}
