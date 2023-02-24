package Scaler;

import java.util.Map;

class NodeTries{
    char data;
    Map<Character, NodeTries> child;
    boolean isEnd;
    NodeTries(char data){
        this.data = data;
    }
}

public class ScalerAd_Tries {

    public void insert(NodeTries root, String word){
        NodeTries tmp = root;
        for(char ch: word.toCharArray()){
            if(!tmp.child.containsKey(ch)){
                tmp.child.put(ch, new NodeTries(ch));
            }
            tmp = tmp.child.get(ch);
        }
        tmp.isEnd = true;
    }

    public boolean search(NodeTries root, String word){
        NodeTries tmp = root;
        for(char ch: word.toCharArray()){
            if(!tmp.child.containsKey(ch)){
                return false;
            }
            tmp = tmp.child.get(ch);
        }
        return tmp.isEnd;
    }

    public void delete(NodeTries root, String word){
        NodeTries tmp = root;
        for(char ch: word.toCharArray()){
            tmp = tmp.child.get(ch);
        }
        tmp.isEnd = false;
    }
}
