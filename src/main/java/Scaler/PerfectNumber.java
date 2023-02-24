package Scaler;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            int sum = 0;
            for(int j=1; j*j<=arr[i]; j++){
                if(arr[i] % j == 0){
                    if(j == arr[i]/j){
                        sum = sum + j;
                    }else{
                        if(arr[i]/j == arr[i]){
                            sum = sum + j;
                        }else{
                            sum = sum + j + arr[i]/j;
                        }
                    }
                }
            }
            if(sum == arr[i]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
