package Scaler;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindromII {

    public int solve(String A) {
        Map<Character, Integer> charHashMap = new HashMap<>();
        for(int i=0; i<A.length(); i++){
            if(charHashMap.containsKey(A.charAt(i))){
                charHashMap.put(A.charAt(i), charHashMap.get(A.charAt(i))+1);
            }else{
                charHashMap.put(A.charAt(i), 1);
            }
        }
        int oddCount = 0;
        for(Map.Entry<Character, Integer> mapElement: charHashMap.entrySet()){
            Character c = mapElement.getKey();
            if(mapElement.getValue()%2 != 0){
                oddCount++;
                if(oddCount > 1){
                    return 0;
                }
            }
        }
        //System.out.println(charHashMap);
        return 1;
    }

    public static void main(String[] args) {
        CheckPalindromII c = new CheckPalindromII();
        System.out.println(c.solve("ababde"));
        System.out.println(c.solve("abcde"));
        System.out.println(c.solve("abbaee"));
    }
}
