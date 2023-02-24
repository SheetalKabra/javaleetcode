package Scaler;

import java.lang.*;
import java.util.*;
import java.math.BigInteger;


public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        int i = 0;
        BigInteger sum = BigInteger.valueOf(0), remainder = BigInteger.valueOf(0), base = BigInteger.valueOf(2);
        while(A.compareTo(BigInteger.valueOf(0)) != 0){
            remainder = A.remainder(BigInteger.valueOf(10));
            A = A.divide(BigInteger.valueOf(10));
            sum = sum.add((base.pow(i)).multiply(remainder));
            i++;
        }
        System.out.println(sum);
    }
}
