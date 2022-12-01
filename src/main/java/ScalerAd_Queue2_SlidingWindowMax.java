import java.util.*;
import java.util.LinkedList;

public class ScalerAd_Queue2_SlidingWindowMax {
    public static void main(String[] args) {
//        Deque<Integer> d = new LinkedList<>();
//        d.add(1);
//        d.add(2);
//        d.addFirst(3);
//        d.addLast(4);
//
//        System.out.println(d);
//        System.out.println(d.peek());
//        System.out.println(d);
//        System.out.println(d.peekLast());
//        System.out.println(d);
//        System.out.println(d.pop());
//        System.out.println(d);

//        System.out.println(slidingMaximum(new ArrayList<>(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7)), 3));
//        System.out.println(slidingMaximum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 7, 1, 3, 6)), 6));
        System.out.println(slidingMaximum(new ArrayList<>(Arrays.asList(1)), 1));

    }
    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> d = new LinkedList<>();
        //preprocessing
        for(int i=0; i<B-1; i++){
            while(!d.isEmpty() && A.get(i) >= A.get(d.peekLast())){
                d.pollLast();
            }
            d.addLast(i);
        }
        //processing on windows
        for(int i=B-1; i<A.size(); i++){
            //1. check if dequeue has invalid value or not
            if(!d.isEmpty() && d.peekFirst() < i-B+1){
                d.pop();
            }
            while(!d.isEmpty() && A.get(i) >= A.get(d.peekLast())){
                d.pollLast();
            }
            d.addLast(i);
            result.add(A.get(d.peekFirst()));
        }
        return result;
    }
}
