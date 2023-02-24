package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing2_CountRightTriangles {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,1,2)), new ArrayList<>(Arrays.asList(1,2,1))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,1,2,3,3)), new ArrayList<>(Arrays.asList(1,2,1,2,1))));
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        int M = B.size();
        Map<Integer, Integer> hmx = new HashMap<>();
        Map<Integer, Integer> hmy = new HashMap<>();
        for(int i=0; i<N; i++){
            if(hmx.containsKey(A.get(i))){
                hmx.put(A.get(i), hmx.get(A.get(i))+1);
            }else{
                hmx.put(A.get(i), 1);
            }
        }
        for(int i=0; i<M; i++){
            if(hmy.containsKey(B.get(i))){
                hmy.put(B.get(i), hmy.get(B.get(i))+1);
            }else{
                hmy.put(B.get(i), 1);
            }
        }
        int countx = 0;
        int county = 0;
        int ans = 0;
        int mod = 1000000007;
        for(int i=0;i<N;i++){
            countx = hmx.get(A.get(i))-1;
            county = hmy.get(B.get(i))-1;
            ans = (ans%mod + (countx*county)%mod)%mod;
        }
        return ans;
    }
}
