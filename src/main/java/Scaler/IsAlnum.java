package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class IsAlnum {
    public int solve(ArrayList<Character> A) {
        /**
         the ascii value of A-Z => 65 to 90
         the ascii value of a-z => 97 to 122
         the ascii value of 0-9 => 48 to 57
         */
        int ascii;
        for(int i=0; i<A.size(); i++){
            ascii = A.get(i);
            if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || (ascii >=48 && ascii<=57)){
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        IsAlnum a = new IsAlnum();
        System.out.println(a.solve(new ArrayList<>(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'))));
        System.out.println(a.solve(new ArrayList<>(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0', 'm', 'y', '2', '0', '2', '0'))));
    }
}
