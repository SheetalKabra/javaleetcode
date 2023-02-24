package Scaler;

import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing3_WindowString {
    public static void main(String[] args) {
//        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
//        System.out.println(minWindow("Aa91b", "ab"));
        System.out.println(minWindow("w", "o"));
    }
    public static String minWindow(String A, String B) {
        Map<Character,Integer> hma = new HashMap<>();
        Map<Character,Integer> hmb = new HashMap<>();
        for(int i=0; i<B.length(); i++){
            if(hmb.containsKey(B.charAt(i))){
                hmb.put(B.charAt(i), hmb.get(B.charAt(i))+1);
            }else{
                hmb.put(B.charAt(i), 1);
            }
        }
//        System.out.println("hmb:"+hmb);
        int l=0, r=0;
        int ans = Integer.MAX_VALUE;
        int minl=-1, minr = -1;
        while(r<=A.length() && l<A.length()){
            while(!isHasmMapBSubsetOfHMA(hma, hmb)){
                if(r>=A.length()){
//                    System.out.println("sdfsdsfdf");
                    if(minl==-1 && minr == -1){
                        return "";
                    }
                    return A.substring(minl, minr);
                }
                if(hma.containsKey(A.charAt(r))){
                    hma.put(A.charAt(r), hma.get(A.charAt(r))+1);
                }else{
                    hma.put(A.charAt(r), 1);
                }
//                System.out.println("hma:"+hma);
                r++;
            }
//            System.out.println("r:"+r+", l:"+l);
            if(r-l+1 < ans){
               minl = l;
               minr = r;
            }
//            System.out.println("minr:"+minr+", minl:"+minl);
            ans = Math.min(ans, r-l+1);
            hma.put(A.charAt(l), hma.get(A.charAt(l))-1);
            if(hma.get(A.charAt(l)) == 0){
                hma.remove(A.charAt(l));
            }
            l++;
//            System.out.println("ans:"+ans);
        }
        if(minl==-1 && minr == -1){
            return "";
        }
        return A.substring(minl, minr);
    }

    public static boolean isHasmMapBSubsetOfHMA(Map<Character, Integer> hma, Map<Character, Integer> hmb){
        for(Character ch : hmb.keySet()){
            Integer freq = hmb.get(ch);
            if(hma.containsKey(ch)){
                if(freq <= hma.get(ch)){
                    continue;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
