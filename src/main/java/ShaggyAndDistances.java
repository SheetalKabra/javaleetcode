import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShaggyAndDistances {
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        Map<Integer, Integer> elementIndex = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<N; i++){
            if(elementIndex.containsKey(A.get(i))){
                sum = i - elementIndex.get(A.get(i));
                if(sum < min){
                    min = sum;
                }
            }
            elementIndex.put(A.get(i), i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        ShaggyAndDistances s = new ShaggyAndDistances();
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(7,2,3,4,1,5))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,1))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1))));
    }
}
