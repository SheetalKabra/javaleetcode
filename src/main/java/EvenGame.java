import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class EvenGame {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str1 = "";
        String str2 = "";
        int i = 1;
        while(i<= Math.floor(N/2)){
            if(i%2 == 0){
                str1 = str1 + i + " ";
            }
            if(i*2 > Math.floor(N/2)){
                str2 = str2 + i*2 + " ";
            }
            i++;
        }
        if(N%2 == 0){
            System.out.println((str1+str2).trim());
        }else{
            System.out.println(str1+str2);
        }



    }
}
