package Scaler;

import java.util.Scanner;

public class Scaler_Primer_VowelsConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String s = sc.nextLine();
        for(int i=0; i<T; i++){
            s = sc.nextLine();
            int vowelsCount = 0;
            int consonentCount = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u'){
                    vowelsCount++;
                }else{
                    consonentCount++;
                }
            }
            System.out.println(vowelsCount+" "+consonentCount);
        }
    }
}
