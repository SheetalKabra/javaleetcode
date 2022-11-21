import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ScalerAd_Queue_NIntegersCont123 {
    public static void main(String[] args) {
        System.out.println(solve(7));
    }
    public static ArrayList<Integer> solve(int A) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        int k=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(k != A){
            int ans = queue.poll();
            result.add(ans);
            queue.add(ans*10+1);
            queue.add(ans*10+2);
            queue.add(ans*10+3);
            k++;
        }
        return result;
    }
}
