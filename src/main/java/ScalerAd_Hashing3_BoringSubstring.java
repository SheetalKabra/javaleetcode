import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing3_BoringSubstring {
    public static void main(String[] args) {
//        System.out.println(solve("abcd"));
//        System.out.println(solve("cabd"));
//        System.out.println(solve("aab"));
//        System.out.println(solve("ddb"));
//        System.out.println(solve("ddbc"));
//        System.out.println(solve("ddbce"));
//        System.out.println(solve("aaacccc"));
//        System.out.println(solve("aaabb"));
        System.out.println(solve("oqpopqoopoppo"));
    }
    public static int solve(String A) {
        A = sortString(A);
        System.out.println(A);
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<A.length();i++){
            if(hm.containsKey(A.charAt(i))){
                hm.put(A.charAt(i), hm.get(A.charAt(i))+1);
            }else{
                hm.put(A.charAt(i), 1);
            }
        }
        System.out.println("hm:"+hm);
        if(hm.size() == A.length()){
            return 1;
        }
        if(hm.size() == 1){
            return 1;
        }
        if(hm.size()>3){
            return 1;
        }
        if(hm.size() == 2){
            int[] ascii = new int[2];
            int  i =0;
            for(Character ch : hm.keySet()){
                ascii[i] = ch;
                i++;
            }
            if(Math.abs(ascii[0] - ascii[1]) > 1 ){
                return 1;
            }else{
                return 0;
            }
        }


        if(hm.size() == 3){
            int[] ascii = new int[3];
            int  i =0;
            for(Character ch : hm.keySet()){
                ascii[i] = ch;
                i++;
            }
            Arrays.sort(ascii);
            if(Math.abs(ascii[0] - ascii[1]) == 1 && Math.abs(ascii[1] - ascii[2]) == 1){
                return 0;
            }else{
                return 1;
            }
        }
        return 1;
    }

    public static String sortString(String A){
        char tempArr[] = A.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }
}
