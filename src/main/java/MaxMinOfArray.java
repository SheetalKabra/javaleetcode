import java.util.Scanner;

public class MaxMinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int max;
        int min;
        if(arr[0] > arr[1]){
            max = arr[0];
            min = arr[1];
        }else{
            max = arr[1];
            min = arr[0];
        }
        for(int i=2; i<N; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(max+" "+min);
    }
}
