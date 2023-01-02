import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class NodeTrie{
    char data;
    Map<Character, NodeTrie> map;
    boolean isEnd;
    NodeTrie(char data, boolean isEnd){
        this.data = data;
        this.isEnd = isEnd;
        map = new HashMap<>();
    }
}

public class ScalerAd_Tries2_MaximmumXor {
    public static void main(String[] args) {
        ScalerAd_Tries2_MaximmumXor s = new ScalerAd_Tries2_MaximmumXor();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(5, 17, 100, 11))));
    }
    public int solve(ArrayList<Integer> A) {
        int mx = findmxbit(A);
        //System.out.println("mx:"+mx);
//        for(int i=0; i<A.size(); i++){
//            System.out.println(convertIntoBinary(A.get(i), mx));
//        }
        NodeTrie root = new NodeTrie('*', false);
        for(int i=0; i<A.size(); i++){
            insertNode(root, A.get(i), mx);
        }
        int result = Integer.MIN_VALUE;
        for(int i=0; i<A.size(); i++){
            int xor = findMax(root, A.get(i), mx);
//            System.out.println("xor:"+xor);
            result = Math.max(result, xor);
        }

        return result;
    }

    public int findMax(NodeTrie root, int X, int mx){
//        System.out.println("for:" +X);
        NodeTrie tmp = root;
        int ans = 0;
        for(int j=mx-1; j>=0; j--){
           if((X&(1<<j)) != 0) { //check jth bit is set or not
//               System.out.println(j+"th bit is 1");
               //if jth bit is set, then go for 0
               if(tmp.map.containsKey('0')){
//                   System.out.println("0 found");
                   tmp = tmp.map.get('0');
                   ans |= (1<<j);
               }else{
//                   System.out.println("0 not found");
                   tmp = tmp.map.get('1');
               }

           }else{
//               System.out.println(j+"th bit is 0");
               //if jth bit is unset, then go for 1
               if(tmp.map.containsKey('1')){
//                   System.out.println("1 found");
                   tmp = tmp.map.get('1');
                   ans |= (1<<j);
               }else{
//                   System.out.println("1 not found");
                   tmp = tmp.map.get('0');
               }
           }
        }
//        System.out.println("ans:"+ans);
        return ans;
    }

    public void insertNode(NodeTrie root, int X, int mx){
//        System.out.println("insert for :"+X);
        NodeTrie tmp = root;
        for(int i=mx-1; i>=0; i--){
//            System.out.println("tmp:"+tmp.data);
//            System.out.println("insert:"+i);
            if((X & (1<<i)) != 0){
                //that means bit is 1
//                System.out.println(i+"th bit is 1");
                if(!tmp.map.containsKey('1')){
//                    System.out.println("1 not found");
                    tmp.map.put('1', new NodeTrie('1', false));
                }else{
//                    System.out.println("1 found");
                }
                tmp = tmp.map.get('1');
            }else{
//                System.out.println(i+"th bit is 0");
                //that means bit is 0
                if(!tmp.map.containsKey('0')) {
//                    System.out.println("0 not found");
                    tmp.map.put('0', new NodeTrie('0', false));
                }else{
//                    System.out.println("0 found");
                }
                tmp = tmp.map.get('0');
            }
        }
        tmp.isEnd = true;
    }

    public String convertIntoBinary(int decimal, int mx){
        //initialize all the values to 0 first
        int[] binary = new int[mx];
        for(int i=0; i<mx; i++){
            binary[i] = 0;
        }
        int i = mx-1;
        while(decimal != 0){
            binary[i] = (decimal % 2);
            decimal = decimal/2;
            i--;
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<mx; j++){
            sb.append(String.valueOf(binary[j]));
        }
        return sb.toString();
    }

    public int findmxbit(ArrayList<Integer> A){
        int mxBit = 0;
        for(int i=0; i<A.size(); i++){
            mxBit = Math.max(mxBit, (int)(Math.log(A.get(i)) / Math.log(2))+1);
        }
        return mxBit;
    }
}