import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scaler_ModuloArith_PairSumDivisibleByM {

    public static void main(String[] args) {
        //System.out.println(solve(new ArrayList<>(Arrays.asList(13,14,22,3,32,19,16)), 4));
        //System.out.println(solve(new ArrayList<>(Arrays.asList(1,2,3,4,5)), 2));
        //System.out.println(solve(new ArrayList<>(Arrays.asList(13,14,22,3,32,19,16)), 4));
        //System.out.println(solve(new int[]{13,14,22,3,32,19,16}, 4));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        //convert the A[i] = A[i]%B
        int N = A.size();
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<N; i++){
            A.set(i, A.get(i)%B);
            if(freq.containsKey(A.get(i))){
                freq.put(A.get(i), freq.get(A.get(i))+1);
            }else{
                freq.put(A.get(i), 1);
            }
        }
        int ans = 0;
        for(int i=0; i<N; i++){
            freq.put(A.get(i), freq.get(A.get(i))-1);
            if(freq.containsKey((B-A.get(i))%B)){
                ans += Math.max(0, freq.get((B-A.get(i))%B));
            }
        }
        return ans;
    }

}
