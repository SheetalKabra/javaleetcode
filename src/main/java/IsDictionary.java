import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsDictionary {
    public int solve(ArrayList<String> A, String B) {
        int N = A.size();
        Map<Character, Integer> dictionaryMap = new HashMap<Character, Integer>();
        for(int i=0; i<B.length(); i++){
            dictionaryMap.put(B.charAt(i), i);
        }
        int l1 = 0;
        int l2 = 0;
        int minl = 0;
        for(int i=1; i<N; i++){
            l1 = A.get(i).length();
            l2 = A.get(i-1).length();
            if(l1>l2){
                minl = l2;
            }else{
                minl = l1;
            }
            int k=0;
            while(dictionaryMap.get(A.get(i).charAt(k)) == dictionaryMap.get(A.get(i-1).charAt(k)) ){
                k++;
                if(minl-1 == k){
                    break;
                }
            }
            if(minl-1 == k){
                if(l2<l1){
                    continue;
                }else{
                    return 0;
                }
            }
            if(dictionaryMap.get(A.get(i).charAt(k)) > dictionaryMap.get(A.get(i-1).charAt(k))){
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        IsDictionary i = new IsDictionary();
        ArrayList<String> s = new ArrayList<>(Arrays.asList("hello", "scaler", "interviewbit"));
        //ArrayList<String> s = new ArrayList<>(Arrays.asList("fine", "none", "no"));
        System.out.println(i.solve(s, "adhbcfegskjlponmirqtxwuvzy"));
    }
}
