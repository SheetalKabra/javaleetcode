import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ScalerAd_BackTracking_RemoveInvalidParanthesis {
    private int oc;
    private int cc;

    public static void main(String[] args) {
        ScalerAd_BackTracking_RemoveInvalidParanthesis s = new ScalerAd_BackTracking_RemoveInvalidParanthesis();
//        System.out.println(s.solve("()())()"));
        System.out.println(s.solve("()"));
//        System.out.println(s.solve("())"));
    }
    public ArrayList<String> solve(String A) {
        counts(A);
        HashSet<String> set = new HashSet<>();
        solver(0, oc, cc, A, new ArrayList<Character>(), set);
        ArrayList<String> result = new ArrayList<>();
        for(String s : set){
            result.add(s);
        }
        return result;
    }

    public void solver(int i, int oc, int cc, String str, ArrayList<Character> curr, HashSet<String> set){
        if(i == str.length()){
            //convert character arraylist into string
            StringBuilder sb = new StringBuilder(curr.size());
            for(Character ch: curr){
                sb.append(ch);
            }
            if(oc == 0 && cc == 0 && isValid(sb.toString())){
                set.add(sb.toString());
            }
            return;
        }
        curr.add(str.charAt(i));
        solver(i+1, oc, cc, str, curr, set);
        curr.remove(curr.size()-1);

        if(str.charAt(i) == '('){
            solver(i+1, oc-1, cc, str, curr, set);
        }

        if(str.charAt(i) == ')'){
            solver(i+1, oc, cc-1, str, curr, set);
        }
    }

    public void counts(String A){
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '('){
                oc++;
            }else if(A.charAt(i) == ')'){
                if(oc != 0){
                    oc--;
                }else{
                    cc++;
                }
            }
        }
        return;
    }

    public boolean isValid(String A){
        int cnt = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '('){
                cnt++;
            }else if(A.charAt(i) == ')'){
                if(cnt == 0){
                    return false;
                }else{
                    cnt--;
                }
            }
        }
        return cnt == 0;
    }
}
