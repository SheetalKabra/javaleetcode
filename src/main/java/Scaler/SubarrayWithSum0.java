package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarrayWithSum0 {
    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        Map<Long, Integer> pf = new HashMap<>();
        Long ps = Long.valueOf(0);
        pf.put(Long.valueOf(0), -1);
        for(int i=0; i<N; i++){
            ps += A.get(i);
            if(pf.containsKey(ps)){
                return 1;
            }
            pf.put(ps, i);
        }
        return 0;
    }

    public static void main(String[] args) {
        SubarrayWithSum0 s = new SubarrayWithSum0();
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1, -1))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(5,4,-6,1,-2,3,7,-10,5))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2,-3,4))));
    }
}
