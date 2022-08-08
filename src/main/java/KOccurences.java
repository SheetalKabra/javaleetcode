import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KOccurences {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<A; i++){
            if(freq.containsKey(C.get(i))){
                freq.put(C.get(i), freq.get(C.get(i))+1);
            }else{
                freq.put(C.get(i), 1);
            }
        }
        System.out.println(2^3+7);
        System.out.println((int)Math.pow(10,9) + 7);
        System.out.println((2^3)+7);
        int count = 0;
        int mod = (int)Math.pow(10,9) + 7;
        boolean isExists = false;
        for(Map.Entry<Integer, Integer> freqMapTraverse: freq.entrySet()){
            if(freqMapTraverse.getValue() == B){
                isExists = true;
                count = (count + freqMapTraverse.getKey())%(mod);
            }
        }
        return isExists == false ? -1 : count%(mod);
    }

    public static void main(String[] args) {
        KOccurences k = new KOccurences();
//        System.out.println(k.getSum(5,2, new ArrayList<>(Arrays.asList(1,2,2,3,3))));
//        System.out.println(k.getSum(5,2, new ArrayList<>(Arrays.asList(1,2,2,3,4))));
//        System.out.println(k.getSum(5,2, new ArrayList<>(Arrays.asList(1,2,6,3,4))));
//        System.out.println(k.getSum(3,2, new ArrayList<>(Arrays.asList(0,0,1))));
        System.out.println(k.getSum(6, 2, new ArrayList<>(Arrays.asList(1000000000, 1000000000, 999999999, 999999999, 999999998, 1))));
    }

}
