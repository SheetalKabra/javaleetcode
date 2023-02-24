package Scaler;

import java.util.Scanner;

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<N ; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
