package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class toLower {
    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        /**
         As we know upper case limits are A-Z i.e, 65 to 90
         and a-z => 90 to 122
         so if any Character ascii value is in b/w 65 to 90, then we need to convert it into lower case that is in b/w 97 to 122
         So, from A to a => i need to do 65 +32 = 97, so every upper to lower case having diff of 32
         so you can either add 32 or use xor, xor will automatically toggle the bit if its 0 or 1
         */
        int ascii;
        for(int i=0; i<A.size(); i++){
            ascii = A.get(i);
            if(ascii >= 65 && ascii <= 90){
                ascii = ascii^32;
                A.set(i, (char)ascii);
            }
        }
        return A;
    }
    public static void main(String[] args) {
        toLower t = new toLower();
        System.out.println(t.to_lower(new ArrayList<Character>(Arrays.asList('S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'))));
    }
}
