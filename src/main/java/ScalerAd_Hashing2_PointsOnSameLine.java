import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing2_PointsOnSameLine {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(-1, 0, 1, 2, 3, 3)), new ArrayList<>(Arrays.asList(1, 0, 1, 2, 3, 4))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(3, 1, 4, 5, 7, -9, -8, 6)), new ArrayList<>(Arrays.asList(4, -8, -3, -2, -1, 5, 7, -4))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(2, 1, -7, 4, 1, -2, -7, 5)), new ArrayList<>(Arrays.asList(-6, -7, 3, -10, 7, -10, 1, 2))));
    }
    public static int solve1(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        float m = 0;
        float c = 0;
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0; i<N-1; i++){
            int x1 = A.get(i);
            int y1 = B.get(i);
            for(int j=i+1; j<N; j++){
                int x2 = A.get(j);
                int y2 = B.get(j);
                m = (x2-x1 == 0) ? 0 : (float)(y2-y1)/(x2-x1);
                c = y1 - m*x1;
                String key = m+","+c;
                System.out.println("("+x1+","+y1+"),("+x2+","+y2+"), key:"+key);
                if(hm.containsKey(key)){
                    hm.put(key, hm.get(key)+1);
                }else{
                    hm.put(key, 1);
                }
            }
        }
        System.out.println("hashmap:"+hm);
        int freq = Integer.MIN_VALUE;
        for (String key : hm.keySet())
        {
            // search  for value
            freq = Math.max(freq, hm.get(key));
        }
        return freq;
    }

    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        double m = 0;
        double c = 0;

        int totalCount = 0;
        Map<String, Integer> hm = new HashMap<>();
        for(int i=0; i<N-1; i++){
            int curMax = 0;
            int overlapCount = 0;
            int x1 = A.get(i);
            int y1 = B.get(i);
            for(int j=i+1; j<N; j++){
                int x2 = A.get(j);
                int y2 = B.get(j);
                if(x1 == x2 && y1 == y2) {
                    overlapCount++;
                } else {
                    // m = (x2-x1 == 0) ? 0 : (double)(y2-y1)/(x2-x1);
                    // c = y1 - m*x1;
                    // String key = m+","+c;
                    // System.out.println("("+x1+","+y1+"),("+x2+","+y2+"), key:"+key);
                    int xDiff = x2 - x1;
                    int yDiff = y2 - y1;
                    int g = getGCD(xDiff, yDiff);
                    xDiff = xDiff/g;
                    yDiff = yDiff/g;
                    String key = xDiff+","+yDiff;
                    if(hm.containsKey(key)){
                        hm.put(key, hm.get(key)+1);
                    }else{
                        hm.put(key, 1);
                    }
                    curMax = Math.max(curMax, hm.get(key));
                }
            }
            totalCount = Math.max(totalCount, curMax + overlapCount + 1);
            hm.clear();
        }
        return totalCount;

        //System.out.println("hashmap:"+hm);
        //int freq = Integer.MIN_VALUE;
        // for (String key : hm.keySet())
        // {
        //     // search  for value
        //     freq = Math.max(freq, hm.get(key));
        // }
        // return freq;
    }
    public static int getGCD(int x, int y){
        if(x==0) return y;
        return getGCD(y%x,x);
    }
}
