import java.util.ArrayList;
import java.util.Arrays;

public class toUpper {
    public ArrayList<Character> to_upper(ArrayList<Character> A) {
        int ascii;
        for(int i=0; i<A.size(); i++){
            ascii = A.get(i);
            if(ascii >= 97 && ascii <= 122){
                ascii = ascii^32;
                A.set(i, (char)ascii);
            }
        }
        return A;
    }

    public static void main(String[] args) {
        toUpper t = new toUpper();
        System.out.println(t.to_upper(new ArrayList<Character>(Arrays.asList('S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'))));
    }
}
