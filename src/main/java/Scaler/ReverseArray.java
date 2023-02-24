package Scaler;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i< N; i++){
            arr[i] = sc.nextInt();
        }
        //to reverse the array
        int temp = 0;
        for(int i=0; i<N/2; i++){
            temp = arr[N-i-1];
            arr[N-i-1] = arr[i];
            arr[i] = temp;
        }

        //print the array
        for(int i=0; i<N; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
