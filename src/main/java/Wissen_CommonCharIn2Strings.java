import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Wissen_CommonCharIn2Strings {
    public static void main(String[] args) {
        String first = "abcbcd";
        String second = "cdefef";
        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");
    }

    private static String commonCharacters(String A, String B){
        Set<Character> setA = createSet(A);
        Set<Character> setB = createSet(B);
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : setA){
            map.put(c, 1);
        }
        String common = "";
        for(Character c : setB){
            if(map.containsKey(c)){
                common = common+c;
            }
        }
        return common;
    }

    private static Set<Character> createSet(String A){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<A.length(); i++){
            set.add(A.charAt(i));
        }
        return set;
    }
}
