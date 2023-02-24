package Scaler;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeCharacter {
    public int solve(String A, int B) {
        /**

         */
        int N = A.length();
        ArrayList<Character> ch = new ArrayList<>();
        for(int i=0; i<N; i++){
            ch.add(A.charAt(i));
        }
        Collections.sort(ch);
        System.out.println(ch);
        ArrayList<Integer> freq = new ArrayList<>();
        int count = 1;
        char elem = ch.get(0);
        for(int i=1; i<N; i++ ){
            if(ch.get(i) == elem){
                count++;
            }else{
                freq.add(count);
                count = 1;
                elem = ch.get(i);
            }
            if(i == N-1){
                freq.add(count);
            }
        }
        //System.out.println(freq);
        Collections.sort(freq);
        System.out.println(freq);
        int sum = 0;
        for(int i=0; i<freq.size(); i++){
            sum = sum+freq.get(i);
            if (sum == B) {
                return freq.size() - i - 1;
            }else if(sum > B){
                return freq.size() - i;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        ChangeCharacter c = new ChangeCharacter();
        System.out.println(c.solve("asklbfm", 3));
        System.out.println(c.solve("askbbka", 3));
        System.out.println(c.solve("askbbka", 2));
        System.out.println(c.solve("askbbka", 7));
    }
}
