import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] isElementPresent = new int[T];
        int B;
        for(int i=0; i<T; i++){
            isElementPresent[i] = 0;
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int k=0; k<N; k++){
                arr[k] = sc.nextInt();
            }
            B = sc.nextInt();
            for(int j=0; j<N; j++){
                if(arr[j] == B){
                    isElementPresent[i] = 1;
                    break;
                }
            }
        }

        for(int i=0; i<T; i++){
            System.out.println(isElementPresent[i]);
        }
    }
}
