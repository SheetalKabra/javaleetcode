import java.util.Scanner;

public class SummationGame {

    //througn recursion
   /* public int sum(int N){
        if(N <= 1){
            return  1;
        }
        return N + sum(N-1);
    } */

    public static void main(String[] args) {
        /*SummationGame sg = new SummationGame();
        System.out.println(sg.sum(1000)); */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
