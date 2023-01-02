import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MapTrieNode{
    char data;
    boolean isEnd;
    int sum;
    Map<Character, MapTrieNode> map;
    MapTrieNode(char data, boolean isEnd){
        this.data = data;
        this.isEnd = false;
        map = new HashMap<>();
    }
}

public class ScalerAd_Tries2_MapSumPairs {
    Map<String, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        ScalerAd_Tries2_MapSumPairs a = new ScalerAd_Tries2_MapSumPairs();
        System.out.println(a.solve(new ArrayList<>(Arrays.asList("apple", "ap", "app", "ap")),
                                    new ArrayList<>(Arrays.asList(3, -1, 2, -1))));

//        System.out.println(a.solve(new ArrayList<>(Arrays.asList("ban", "banana", "ba")),
//                new ArrayList<>(Arrays.asList(10, -1, -1))));

//        System.out.println(a.solve(new ArrayList<>(Arrays.asList("aaac", "aaca", "babb", "ccca", "ccbc", "ccac", "bcbb", "abbb", "bbca", "cbba", "ccaa", "ccbb", "baac", "bbaa", "caaa", "aaca", "cbcb", "abaa", "accb", "abcb", "bb", "cb", "ab", "ba", "aa", "cc", "aa", "aa", "bc", "aa")),
//                new ArrayList<>(Arrays.asList(42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1))));
    }

    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<Integer> B) {
        int N = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        MapTrieNode root = new MapTrieNode('*', false);
        for(int i=0; i<N; i++){
            if(B.get(i) == -1){
                //go for search
                result.add(search(root, A.get(i)));
            }else{
                //go for insert
                //insert into hashmap as well
                insertNode(root, A.get(i), B.get(i));
            }
        }
        return result;
    }

    public int search(MapTrieNode root, String word){
        //System.out.println("==================search::::=================="+word);
        int totalSum = 0;
        MapTrieNode tmp = root;
        for(char ch : word.toCharArray()){
            if(!tmp.map.containsKey(ch)){
                return 0;
            }
            tmp = tmp.map.get(ch);
            totalSum = tmp.sum;
            //System.out.println(tmp.data+ ", total sum:"+totalSum);
        }
        return totalSum;
    }

    public void insertNode(MapTrieNode root, String word, int sum){
        //System.out.println("================== insert for word:"+word+", sum:"+sum+"==================");
        MapTrieNode tmp = root;
        int oldSum = 0;
        if(hm.containsKey(word)){
            oldSum = hm.get(word);
            hm.put(word, sum);
        }else{
            hm.put(word, sum);
        }
        for(char ch: word.toCharArray()){
            if(!tmp.map.containsKey(ch)){
                //System.out.println("char "+ch+", not exits" );
                tmp.map.put(ch, new MapTrieNode(ch, false));
                //tmp = tmp.map.get(ch);
            }
            tmp = tmp.map.get(ch);
            //System.out.println(tmp.data+", existing tmp sum:"+tmp.sum);
            int totalSum = tmp.sum + sum - oldSum;
            tmp.sum = totalSum;
            //System.out.println("for "+tmp.data+", final sum:"+tmp.sum);
            //tmp = tmp.map.get(ch);
        }
        tmp.isEnd = true;
    }
}
