package Scaler;

import java.util.*;

public class ScalerAd_Queue2_MaxFrequencyStack {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 11)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 92)));
        arr.add(new ArrayList<>(Arrays.asList(1, 73)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 97)));
        arr.add(new ArrayList<>(Arrays.asList(1, 70)));
        arr.add(new ArrayList<>(Arrays.asList(1, 10)));
        arr.add(new ArrayList<>(Arrays.asList(1, 79)));
        arr.add(new ArrayList<>(Arrays.asList(1, 39)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 16)));
        arr.add(new ArrayList<>(Arrays.asList(1, 5)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 82)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 80)));
        arr.add(new ArrayList<>(Arrays.asList(1, 32)));
        arr.add(new ArrayList<>(Arrays.asList(1, 100)));
        arr.add(new ArrayList<>(Arrays.asList(1, 100)));
        arr.add(new ArrayList<>(Arrays.asList(1, 9)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 18)));
        arr.add(new ArrayList<>(Arrays.asList(1, 97)));
        arr.add(new ArrayList<>(Arrays.asList(1, 61)));
        arr.add(new ArrayList<>(Arrays.asList(1, 10)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 81)));
        arr.add(new ArrayList<>(Arrays.asList(1, 10)));
        arr.add(new ArrayList<>(Arrays.asList(1, 21)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
        arr.add(new ArrayList<>(Arrays.asList(1, 73)));
        arr.add(new ArrayList<>(Arrays.asList(1, 60)));
        arr.add(new ArrayList<>(Arrays.asList(1, 15)));
        arr.add(new ArrayList<>(Arrays.asList(1, 93)));
        arr.add(new ArrayList<>(Arrays.asList(1, 53)));
        arr.add(new ArrayList<>(Arrays.asList(2, 0)));
//        arr.add(new ArrayList<>(Arrays.asList(1,5)));
//        arr.add(new ArrayList<>(Arrays.asList(1,7)));
//        arr.add(new ArrayList<>(Arrays.asList(1,5)));
//        arr.add(new ArrayList<>(Arrays.asList(1,7)));
//        arr.add(new ArrayList<>(Arrays.asList(1,4)));
//        arr.add(new ArrayList<>(Arrays.asList(1,5)));
//        arr.add(new ArrayList<>(Arrays.asList(2,0)));
//        arr.add(new ArrayList<>(Arrays.asList(2,0)));
//        arr.add(new ArrayList<>(Arrays.asList(2,0)));
//        arr.add(new ArrayList<>(Arrays.asList(2,0)));
//        arr.add(new ArrayList<>(Arrays.asList(2,0)));
        System.out.println(solve(arr));
    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Stack<Integer>> stackshm = new HashMap<>();
        int maxFreq = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            System.out.println("before::");
            System.out.println("freq:"+freq);
            System.out.println("stackshm:"+stackshm);
            System.out.println("maxfreq:"+maxFreq);
            //A.get(i).get(0) == 1; that means push
            if(A.get(i).get(0) == 1){
                System.out.println("push:");
                //1. make the entry in freq hash map
                if(freq.containsKey(A.get(i).get(1))){
                    freq.put(A.get(i).get(1), freq.get(A.get(i).get(1))+1);
                }else{
                    freq.put(A.get(i).get(1), 1);
                }
                //2. maintain the maxfreq variable
                int frequency = freq.get(A.get(i).get(1));
                maxFreq = Math.max(maxFreq, frequency);
                //3. make the entry in stackshm hashmap
                if(stackshm.containsKey(frequency)){
                    Stack<Integer> tmp = stackshm.get(frequency);
                    tmp.push(A.get(i).get(1));
                    stackshm.put(frequency, tmp);
                }else{
                    Stack<Integer> tmp = new Stack<>();
                    tmp.push(A.get(i).get(1));
                    stackshm.put(frequency, tmp);
                }
                result.add(-1);
            }else{
                System.out.println("pop:");
//                System.out.println("freq:"+freq);
//                System.out.println("stackshm:"+stackshm);
                //A.get(i).get(0) == 2; that means pop
                Stack<Integer> s = stackshm.get(maxFreq);
//                System.out.println("s:"+s);
//                System.out.println("maxfreq:"+maxFreq);
                int popElem = s.peek();
                result.add(popElem);
                s.pop();
                if(s.isEmpty()){
                    maxFreq--;

                }
                freq.put(popElem, freq.get(popElem)-1);
            }
            System.out.println("after::");
            System.out.println("freq:"+freq);
            System.out.println("stackshm:"+stackshm);
            System.out.println("maxfreq:"+maxFreq);

        }

        return  result;
    }
}
