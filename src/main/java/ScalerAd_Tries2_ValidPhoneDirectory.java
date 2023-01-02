import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class PhoneDirTrie{
    char data;
    boolean isEnd;
    Map<Character, PhoneDirTrie> map;
    PhoneDirTrie(char data, boolean isEnd){
        this.data = data;
        this.isEnd = isEnd;
        map = new HashMap<>();
    }
}

public class ScalerAd_Tries2_ValidPhoneDirectory {
    public static void main(String[] args) {
        ScalerAd_Tries2_ValidPhoneDirectory s = new ScalerAd_Tries2_ValidPhoneDirectory();
        System.out.println(s.solve(new ArrayList<>(Arrays.asList("1234", "2342", "567"))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList("00121", "001"))));
    }
    public int solve(ArrayList<String> A) {
        PhoneDirTrie root = new PhoneDirTrie('*', false);
        for(int i=0; i<A.size(); i++){
            int isValid = insert(root, A.get(i));
            if(isValid == 0){
                return 0;
            }
        }
        return 1;
    }

    public int insert(PhoneDirTrie root, String word){
        PhoneDirTrie tmp = root;
        for(char ch: word.toCharArray()){
            if(!tmp.map.containsKey(ch)){
                tmp.map.put(ch, new PhoneDirTrie(ch, false));
            }else{
                return 0;
            }
            tmp = tmp.map.get(ch);
        }
        tmp.isEnd = true;
        return 1;
    }
}
