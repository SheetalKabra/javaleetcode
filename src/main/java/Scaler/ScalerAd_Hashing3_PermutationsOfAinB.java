package Scaler;

import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing3_PermutationsOfAinB {
    public static void main(String[] args) {
        System.out.println(solve("Scaler.abc", "abcbacabc"));//5
        System.out.println(solve("aca", "acaa"));
        System.out.println(solve("docp", "aoapeooeoapcpaocecddoocdcqqapeapccc"));//0
        System.out.println(solve("ebbp", "qaoedpcebeaqocbacoccqoebpqdoqcpbdbqcecdoqcpebqpebbabqdpepcpbqbepbabocpc"));//2
    }

    public static int solve(String A, String B) {
        Map<Character,Integer> hma = new HashMap<>();
        Map<Character,Integer> hmb = new HashMap<>();
        for(int i=0; i<A.length(); i++){
            if(hma.containsKey(A.charAt(i))){
                hma.put(A.charAt(i), hma.get(A.charAt(i))+1);
            }else{
                hma.put(A.charAt(i), 1);
            }
        }
//        System.out.println("hma:"+hma);
        for(int i=0; i<A.length(); i++){
            if(hmb.containsKey(B.charAt(i))){
                hmb.put(B.charAt(i), hmb.get(B.charAt(i))+1);
            }else{
                hmb.put(B.charAt(i), 1);
            }
        }
//        System.out.println("hmb:"+hmb);
        int count = 0;
        int l = 0;
        if(hma.equals(hmb)){
            count++;
        }
        for(int i=A.length(); i<B.length(); i++){
            hmb.put(B.charAt(l), hmb.get(B.charAt(l))-1);
            if(hmb.get(B.charAt(l)) == 0){
                hmb.remove(B.charAt(l));
            }
            if(hmb.containsKey(B.charAt(i))){
                hmb.put(B.charAt(i), hmb.get(B.charAt(i))+1);
            }else{
                hmb.put(B.charAt(i), 1);
            }
            if(hma.equals(hmb)){
                count++;
            }
            l++;
        }
        return count;
    }
}
