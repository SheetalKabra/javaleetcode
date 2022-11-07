import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing1_ShaggyAndDis {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(7, 1, 3, 4, 1, 7))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,1))));
    }
    public static int solve(ArrayList<Integer> A) {
        int N = A.size();
        Map<Integer,Integer> hm = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(hm.containsKey(A.get(i))){
                ans = Math.min(ans, i-hm.get(A.get(i)));
                hm.put(A.get(i), i);
            }else{
                hm.put(A.get(i), i);
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
