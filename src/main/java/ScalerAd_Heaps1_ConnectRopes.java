import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ScalerAd_Heaps1_ConnectRopes {
    public static void main(String[] args) {
        ScalerAd_Heaps1_ConnectRopes s = new ScalerAd_Heaps1_ConnectRopes();
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(16, 7, 3, 5, 9, 8, 6, 15))));
    }

    public int solve(ArrayList<Integer> A) {
        //1. add all elements into min PQ
        //2. now get 2 elements from min PQ, add into cost, and then again add cost into min PQ.
        //3. repeat step 2, untill you get empty PQ
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<A.size(); i++){
            pq.add(A.get(i));
        }
        int cost = 0;
        int c1 = 0;
        int c2 = 0;
        while(pq.size() > 1){
            c1 = pq.poll();
            c2 = pq.poll();
            //System.out.println("c1:"+c1+", c2:"+c2);
            cost += c1 + c2;
            //System.out.println("cost:"+cost);
            pq.add(c1+c2);
        }

        return cost;
    }


}
