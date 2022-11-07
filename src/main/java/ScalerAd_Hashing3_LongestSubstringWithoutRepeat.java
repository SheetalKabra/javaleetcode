import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing3_LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("AaaA"));
    }
    public static int lengthOfLongestSubstring(String A) {
        int N = A.length();
        Map<Character,Integer> hm = new HashMap<>();
        int l = 0;
        int r = 0;
        int ans = Integer.MIN_VALUE;
        while(r < N){
//            int ascii = A.charAt(r);
            if(hm.containsKey(A.charAt(r))){
                while(A.charAt(l) != A.charAt(r)){
                    hm.remove(A.charAt(l));
                    l++;
                }
                hm.remove(A.charAt(l));
                l++;
            }
            hm.put(A.charAt(r), 1);
            ans = Math.max(ans, r-l+1);
            r++;

        }
        return ans;
    }
}
