import java.util.*;
import java.util.LinkedList;

public class ScalerAd_Queue2_FirstNonRepeatingChar {
    public static void main(String[] args) {
//        System.out.println(solve("abadbc"));
//        System.out.println(solve("abcabc"));
        System.out.println(solve("jyhrcwuengcbnuchctluxjgtxqtfvrebveewgasluuwooupcyxwgl"));
    }
    public static String solve(String A) {
        int N = A.length();
        Deque<Character> d = new LinkedList<>();
        Map<Character, Integer> hm = new HashMap<>();
        ArrayList<Character> result = new ArrayList<>();
        for(int i=0; i<N; i++){
            if(hm.containsKey(A.charAt(i))){
                hm.put(A.charAt(i), hm.get(A.charAt(i))+1);
                if(d.peekFirst() == A.charAt(i)){
                    d.pop();
                    while(hm.containsKey(d.peekFirst()) && hm.get(d.peekFirst())>1){
                        d.pop();
                    }
                }

            }else{
                hm.put(A.charAt(i), 1);
                d.addLast(A.charAt(i));
            }
            if(!d.isEmpty()){
                result.add(d.peekFirst());
            }else{
                result.add('#');
            }

        }
        StringBuilder sb = new StringBuilder();
        // Appends characters one by one
        for (Character ch : result) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
