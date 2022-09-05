import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DistinctNumbersInWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int N = A.size();
        ArrayList<Integer> dnums = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<B; i++){
            if(freq.containsKey(A.get(i))){
                freq.put(A.get(i), freq.get(A.get(i))+1);
            }else{
                freq.put(A.get(i), 1);
            }
        }
//        System.out.println(A);
//        System.out.println(freq);
        dnums.add(freq.size());
        int removingElem = 0;
        int insertingElem = B;
        while(insertingElem<N){
            freq.put(A.get(removingElem), freq.get(A.get(removingElem))-1);

            if(freq.get(A.get(removingElem)) == -1 || freq.get(A.get(removingElem)) == 0 ){
                freq.remove(A.get(removingElem));
            }
            if(freq.containsKey(A.get(insertingElem))){
                freq.put(A.get(insertingElem), freq.get(A.get(insertingElem))+1);
            }else{
                freq.put(A.get(insertingElem), 1);
            }
            //System.out.println("freq:"+freq);
            dnums.add(freq.size());
            removingElem++;
            insertingElem++;
        }
        return dnums;
    }

    public static void main(String[] args) {
        DistinctNumbersInWindow d = new DistinctNumbersInWindow();
        System.out.println(d.dNums(new ArrayList<>(Arrays.asList(1, 2, 1, 3, 4, 3)), 3));
        System.out.println(d.dNums(new ArrayList<>(Arrays.asList(1,1,2,2)), 1));
        System.out.println(d.dNums(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)), 3));
    }
}
