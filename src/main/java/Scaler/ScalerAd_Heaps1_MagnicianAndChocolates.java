package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ScalerAd_Heaps1_MagnicianAndChocolates {
    public static void main(String[] args) {
        ScalerAd_Heaps1_MagnicianAndChocolates s = new ScalerAd_Heaps1_MagnicianAndChocolates();
//        System.out.println(s.nchoc(3, new ArrayList<>(Arrays.asList(6,5))));
//        System.out.println(s.nchoc(5, new ArrayList<>(Arrays.asList(2,4,6,8,10))));
        System.out.println(s.nchoc(10, new ArrayList<>(Arrays.asList(2147483647, 2000000014, 2147483647))));
    }
    public int nchoc(int A, ArrayList<Integer> B) {
        int m = 1000000007;
        //use reverse of min priority Scaler.queue using lambda expression
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0; i<B.size(); i++){
            pq.add(B.get(i));
        }
        int sum = 0;
        int noOfChoc = 0;
        for(int i=0; i<A; i++){
            noOfChoc = pq.poll();
            sum = (sum%m + noOfChoc%m)%m;
            sum = sum%m;
            pq.add(noOfChoc/2);
        }
        return sum < 0 ? (sum + m) : sum%m;
    }
}
