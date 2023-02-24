package Scaler;

import java.util.Scanner;

public class Scaler_Pirimer_LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.nextLine();
        for(int i=0; i<N; i++){
            s = sc.nextLine();
            System.out.println(s.length());
        }
    }
}
