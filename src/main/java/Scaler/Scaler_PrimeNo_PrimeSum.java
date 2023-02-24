package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_PrimeNo_PrimeSum {
    public static void main(String[] args) {
//        int A = 1048574;
//        int i = 46349;
//        System.out.println((long)i*i <= A);
//        if((long)i*i <= A){
//            System.out.println("if");
//        }else{
//            System.out.println("else");
//        }
//        System.out.println(primesum(20));
        System.out.println(primesum(1048574));
        System.out.println(primesum(16777214));
    }
    public static ArrayList<Integer> primesum(int A) {
        int[] isPrime = new int[A+1];
        for(int i=0;i<=A;i++){
            isPrime[i] = 1;
        }
        isPrime[1] = 0;
        isPrime[0] = 0;
        for(int i=2; i<=A; i++){
                if(isPrime[i] == 1 && (long)i*i <= A){
                for(int j=i*i; j<=A; j+=i){
                    isPrime[j] = 0;
                }
            }
        }
        int i = A;
        int e = -1;
        ArrayList<Integer> result = new ArrayList<>();
        while(i>=0){
            if(isPrime[i] == 1){
                if (e == -1) {
                    if(isPrime[A-i] == 1){
                        e = i;
                        result.add(0,A-i);
                        result.add(1,e);
                        return result;
                    }
                    i--;
                }
            }else{
                i--;
            }

        }
        return result;
    }
}
