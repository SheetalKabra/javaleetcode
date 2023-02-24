package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Hashing2_CountRectangles {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 1, 2, 2)), new ArrayList<>(Arrays.asList(1, 2, 1, 2))));
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        int M = B.size();
        Map<String,Integer> points = new HashMap<>();
        for(int i=0; i<N; i++){
            String pointValue = A.get(i)+","+B.get(i);
            if(points.containsKey(pointValue)){
                points.put(pointValue, points.get(pointValue)+1);
            }else{
                points.put(pointValue, 1);
            }
        }

        int count=0;
        for(int i=0; i<N; i++){
            int x1 = A.get(i);
            int y1 = B.get(i);
            for(int j=i+1; j<M; j++){
                int x2 = A.get(j);
                int y2 = B.get(j);
                if(x1 == x2 || y1 == y2){
                    continue;
                }
                String coordinate1 = x1+","+y2;
                String coordinate2 = x2+","+y1;
                //we have (x1,y1) and (x2,y2)
                //we need to check for (x1,y2) and (x2,y1)
                if(points.containsKey(coordinate1) && points.containsKey(coordinate2)){
                    count++;
                }
            }
        }
        return count/2;
    }
}
