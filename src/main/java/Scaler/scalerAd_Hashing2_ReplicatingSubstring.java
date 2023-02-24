package Scaler;

import java.util.HashMap;
import java.util.Map;

public class scalerAd_Hashing2_ReplicatingSubstring {
    public static void main(String[] args) {
        System.out.println(solve(2, "bbaabb"));
        System.out.println(solve(1, "bbaabb"));
        System.out.println(solve(4, "bbaabb"));
    }
    public static int solve(int A, String B) {
        int N = B.length();
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<N; i++){
            if(freq.containsKey(B.charAt(i))){
                freq.put(B.charAt(i), freq.get(B.charAt(i))+1);
            }else{
                freq.put(B.charAt(i), 1);
            }
        }
        for(Character ch: freq.keySet()){
            int charCount = freq.get(ch);
            if(charCount%A != 0){
                return -1;
            }
        }
        return 1;
    }
}
