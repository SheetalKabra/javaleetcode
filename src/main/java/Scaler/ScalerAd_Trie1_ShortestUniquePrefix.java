package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TrieNode{
    char data;
    Map<Character, TrieNode> children;
    boolean isEnd;
    int count;
    TrieNode(char data, boolean isEnd){
        this.data = data;
        this.isEnd = isEnd;
        children = new HashMap<>();
    }
}
public class ScalerAd_Trie1_ShortestUniquePrefix {
    public static void main(String[] args) {
        ScalerAd_Trie1_ShortestUniquePrefix s = new ScalerAd_Trie1_ShortestUniquePrefix();
//        System.out.println(s.prefix(new ArrayList<>(Arrays.asList("zebra", "dog", "duck", "dot"))));
        System.out.println(s.prefix(new ArrayList<>(Arrays.asList("bearcat", "bert"))));
    }

    ArrayList<String> result = new ArrayList<>();
    public ArrayList<String> prefix(ArrayList<String> A) {
        TrieNode root = new TrieNode('*', false);
        //create a trie first
        for(int i=0; i<A.size(); i++){
            insertNode(root, A.get(i));
        }
        //now iterate over the trie, and as soon as you get count=1, then that will be the prefix
        for(int i=0; i<A.size(); i++){
            search(root, A.get(i));
        }
        return result;
    }

    public void insertNode(TrieNode root, String word){
        TrieNode tmp = root;
        for(char ch: word.toCharArray()){
            if(!tmp.children.containsKey(ch)){
                tmp.children.put(ch, new TrieNode(ch, false));
            }
            tmp.count = tmp.count + 1;
            tmp = tmp.children.get(ch);
        }
    }

    public void search(TrieNode root, String word){
        TrieNode tmp = root;
        StringBuilder sb = new StringBuilder();
        for(char ch: word.toCharArray()){
            if(tmp.children.get(ch).count > 1){
                tmp = tmp.children.get(ch);
                sb.append(ch);
            }else{
                sb.append(ch);
                result.add(sb.toString());
                return;
            }
        }
    }
}
