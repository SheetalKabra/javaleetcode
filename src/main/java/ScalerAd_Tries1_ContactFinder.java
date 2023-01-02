import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ContactFinderTrie{
    char data;
    boolean isEnd;
    int count;
    Map<Character, ContactFinderTrie> map;
    ContactFinderTrie(char data, boolean isEnd){
        this.data = data;
        this.isEnd = isEnd;
        map = new HashMap<>();
    }
}

public class ScalerAd_Tries1_ContactFinder {
    public static void main(String[] args) {
        ScalerAd_Tries1_ContactFinder s = new ScalerAd_Tries1_ContactFinder();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(0, 0, 1, 1)), new ArrayList<>(Arrays.asList("hack", "hacker", "hac", "hak"))));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(0, 1)), new ArrayList<>(Arrays.asList("abcde", "abc"))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1)), new ArrayList<>(Arrays.asList("s", "ss", "sss", "ssss", "sssss", "s", "ss", "sss", "ssss", "sssss", "ssssss"))));
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<String> B) {
        ArrayList<Integer> result = new ArrayList<>();
        ContactFinderTrie root = new ContactFinderTrie('*', false);
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == 0){
                //insert
                insert(root, B.get(i));
            }else{
                //search
                result.add(search(root, B.get(i)));
            }
        }
        return result;
    }

    public int search(ContactFinderTrie root, String word){
        ContactFinderTrie tmp = root;
        for(char ch : word.toCharArray()){
            if(!tmp.map.containsKey(ch)){
                return 0;
            }
            tmp = tmp.map.get(ch);
        }
        return tmp.count;
    }

    public void insert(ContactFinderTrie root, String word){
        System.out.println("======================insert====================== "+ word);
        ContactFinderTrie tmp = root;
        for(char ch : word.toCharArray()){
            if(!tmp.map.containsKey(ch)){
                System.out.println(ch+" not found tmp:"+tmp.data);
                tmp.map.put(ch, new ContactFinderTrie(ch, false));
            }
            tmp = tmp.map.get(ch);
            tmp.count = tmp.count+1;
            System.out.println("count "+tmp.count+", tmp:"+tmp.data);

        }
        tmp.isEnd = true;
    }
}
