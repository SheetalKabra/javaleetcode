import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i*i<=A; i++){
            if(A%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
