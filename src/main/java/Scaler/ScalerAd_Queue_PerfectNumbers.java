package Scaler;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ScalerAd_Queue_PerfectNumbers {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    public static String solve(int A) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("11");
        queue.add("22");
        int k=0;
        String ans = null;
        while(k != A){
            ans = queue.poll();
            int mid = ans.length()/2;
            queue.add(ans.substring(0, mid)+"11"+ans.substring(mid,ans.length()));
            queue.add(ans.substring(0, mid)+"22"+ans.substring(mid,ans.length()));
            k++;
        }
        return ans;
    }
}
