import java.util.Scanner;

public class PrintRevString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        PrintRevString p = new PrintRevString();
        p.reverse(str);

    }

    public String reverse(String str){
        int N = str.length();
        if(N==0){
            return "";
        }
        System.out.print(str.charAt(N-1));
        return  reverse(str.substring(0,N-1));
    }
}
