import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == B){
                System.out.println(A);
            }
            int max = A;
            int min = B;
            if(B > A){
                max = B;
                min = A;
            }
            if (max%A == 0 && max%B == 0) {
                System.out.println(max);
            } else {
                int no = min;
                while(true){
                    if (no%A == 0 && no%B == 0) {
                        System.out.println(no);
                        break;
                    }
                    no = no + min;
                }

            }
        }

    }


}
