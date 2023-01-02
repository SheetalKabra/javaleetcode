import java.util.*;

class TrieNode1{
    char data;
    boolean isEnd;
    Map<Character, TrieNode1> map;
    TrieNode1(char data, boolean isEnd){
        this.data = data;
        this.isEnd = isEnd;
        map = new HashMap<>();
    }
}

public class ScalerAd_Trie1_ModifiedSearch {
    public static void main(String[] args) {
        ScalerAd_Trie1_ModifiedSearch s = new ScalerAd_Trie1_ModifiedSearch();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList("data", "circle", "cricket")),
//                new ArrayList<>(Arrays.asList("date", "circel", "crikket", "data", "circl"))));
    }
//    public String solve(ArrayList<String> A, ArrayList<String> B) {
//
//        int N = A.size();
//        int M = B.size();
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<M; i++){
//            int count = 0;
//            for(int j=0; j<N; j++){
//
//            }
//        }
//
//    }

    public String solve1(ArrayList<String> A, ArrayList<String> B) {
        TrieNode1 root = new TrieNode1('*', false);
        for(int i=0; i<A.size(); i++){
            insert(root, A.get(i));
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<B.size(); i++){
            sb.append(search(root, B.get(i)));
            System.out.println("result:"+sb.toString());
        }
        return sb.toString();
    }

    public void insert(TrieNode1 root, String word){
        TrieNode1 tmp = root;
        for(char ch: word.toCharArray()){
            if(!tmp.map.containsKey(ch)){
                tmp.map.put(ch, new TrieNode1(ch, false));
            }
            tmp = tmp.map.get(ch);
            System.out.println("insert ch:"+ch);
        }
        tmp.isEnd = true;
    }

    public int search(TrieNode1 root, String word){
        TrieNode1 tmp = root;
        int count = 0;
        for(char ch: word.toCharArray()){
            System.out.println("tmp: "+ch+": "+tmp.map.containsKey(ch));
            if(!tmp.map.containsKey(ch)){
                count++;
                if(count > 1){
                    return 0;
                }

            }
            tmp = tmp.map.get(ch);
            System.out.println("now tmp is:"+tmp.data);
            if(tmp == null){
               return 0;
            }
        }
        System.out.println("count:"+count);
        if(tmp != null && tmp.isEnd){
            return 1;
        }
        return 0;
    }
}
