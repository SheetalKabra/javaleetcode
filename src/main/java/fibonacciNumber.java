import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] f = new int[A+1];
        f[0] = 0;
        if(A == 0){
            System.out.print(f[0]);
        }else if(A == 1){
            f[1] = 1;
            System.out.print(f[1]);
        }else if(A>1){
            f[1] = 1;
            for(int i=2;i<=A;i++){
                f[i] = f[i-1] + f[i-2];
            }
            System.out.print(f[A]);
        }

    }
}
