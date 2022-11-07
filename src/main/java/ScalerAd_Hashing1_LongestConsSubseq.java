import java.util.*;

public class ScalerAd_Hashing1_LongestConsSubseq {
    public static void main(String[] args) {
//        System.out.println(longestConsecutive(new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2))));
//        System.out.println(longestConsecutive(new ArrayList<>(Arrays.asList(2,1))));
        System.out.println(longestConsecutive(new ArrayList<>(Arrays.asList(97, 86, 67, 19, 107, 9, 8, 49, 23, 46, -4, 22, 72, 4, 57,
                111, 20, 52, 99, 2, 113, 81, 7, 5, 21, 0, 47, 54, 76, 117, -2, 102, 34, 12, 103, 69, 36, 51, 105, -3, 33, 91, 37,
                11, 48, 106, 109, 45, 58, 77, 104, 60, 75, 90, 3, 62, 16, 119, 85, 63, 87, 43, 74, 13, 95, 94, 56, 28, 55, 66, 92,
                79, 27, 42, 70))));
    }
    public static int longestConsecutive(final List<Integer> A) {
        int N = A.size();
        Map<Integer, Integer> hm = new HashMap<>();
        int cnt = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            hm.put(A.get(i), i);
        }
        for(int i=0; i<N; i++){
            if(hm.containsKey(A.get(i)-1)){
                continue;
            }
            cnt = 0;
            int x = A.get(i);
            while(hm.containsKey(x)){
                x++;
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
