package Scaler;

import java.util.*;

class TrieNode2{
    char data;
    Map<Character, TrieNode2> map;
    ArrayList<String> list;
    boolean isEnd;
    TrieNode2(char data, boolean isEnd){
        this.data = data;
        this.isEnd = isEnd;
        map = new HashMap<>();
        list = new ArrayList<>();
    }
}
class Words{
    String data;
    int weight;
    public Words(String data){
        this.data = data;
    }
    public Words(int weight){
        this.weight = weight;
    }
}
public class ScalerAd_Tries1_Autocomplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            ArrayList<Words> A = new ArrayList<>();
            for(int j=0; j<N; j++){
                A.add(j, new Words(sc.next()));
            }
            for(int j=0; j<N; j++){
                A.get(j).weight = sc.nextInt();
            }
            ArrayList<String> B = new ArrayList<>();
            for(int j=0; j<M; j++){
                B.add(j, sc.next());
            }
            Collections.sort(A, new Comparator<Words>() {
                @Override
                public int compare(Words o1, Words o2) {
                    if(o1.weight == o2.weight){
                        return 0;
                    }else if(o1.weight < o2.weight){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            });
//            System.out.println("after sorting:");
//            for(int j=0; j<N; j++){
//                System.out.print(A.get(j).data+": "+A.get(j).weight+", ");
//            }
//            System.out.println("");
            TrieNode2 root = new TrieNode2('*', false);
            for(int j=0; j<N; j++){
                insert(root, A.get(j).data);
            }
            for(int j=0; j<M; j++){
                ArrayList<String> result = search(root, B.get(j));
                if(result.size() == 0){
                    System.out.println("-1 ");
                }else{
                    for(int k=0; k<result.size(); k++){
                        System.out.print(result.get(k)+" ");
                    }
                    System.out.println("");
                }
            }
        }
    }

    public static void insert(TrieNode2 root, String word){
        TrieNode2 tmp = root;
        for(char ch: word.toCharArray()){
            if(!tmp.map.containsKey(ch)){
                tmp.map.put(ch, new TrieNode2(ch, false));
                tmp = tmp.map.get(ch);
                if(tmp.list.size() < 5){
                    tmp.list.add(word);
                }
            }else{
                tmp = tmp.map.get(ch);
                if(tmp.list.size() < 5){
                    tmp.list.add(word);
                }

            }

        }

        tmp.isEnd = true;
    }

    public static ArrayList<String> search(TrieNode2 root, String word){
        TrieNode2 tmp = root;
        for(char ch: word.toCharArray()) {
            if(!tmp.map.containsKey(ch)){
                return new ArrayList<>();
            }
            tmp = tmp.map.get(ch);
        }
        return tmp.list;
    }
}
