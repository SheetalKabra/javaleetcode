import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ScalerAd_Queue2_SumOfMinAndMax {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(2, 5, -1, 7, -3, -1, -2)), 4));
        System.out.println(solve(new ArrayList<>(Arrays.asList(2, -1, 3)), 2));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int m = 1000000007;
        ArrayList<Integer> maxElement = getMax(A, B);
        ArrayList<Integer> minElement = getMin(A, B);
        int N = maxElement.size();
        long sum = 0;
        for(int i=0; i<N; i++){
            sum = sum%m + maxElement.get(i)%m + minElement.get(i)%m;
        }
        return (int)sum;
    }

    public static ArrayList<Integer> getMax(ArrayList<Integer> A, int B){
        int N = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> d = new LinkedList<>();

        //preprocessing
        for(int i=0; i<B-1; i++){
            //check if coming element is greater, than pop last from deque till you get greater in deque
            while(!d.isEmpty() && A.get(i) >= A.get(d.peekLast())) {
                d.pollLast();
            }
            d.addLast(i);
        }

        //processing on windows
        for(int i=B-1; i<N; i++) {
            //1. check if deque has invalid element or not
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

    public static ArrayList<Integer> getMin(ArrayList<Integer> A, int B){
        int N = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> d = new LinkedList<>();

        //preprocessing
        for(int i=0; i<B-1; i++){
            //check if coming element is smaller, than pop last from deque till you get greater in deque
            while(!d.isEmpty() && A.get(i) <= A.get(d.peekLast())) {
                d.pollLast();
            }
            d.addLast(i);
        }
        //processing on windows
        for(int i=B-1; i<N; i++) {
            //1. check if deque has invalid element or not
            if(!d.isEmpty() && d.peekFirst() < i-B+1){
                d.pop();
            }
            while(!d.isEmpty() && A.get(i) <= A.get(d.peekLast())){
                d.pollLast();
            }
            d.addLast(i);
            result.add(A.get(d.peekFirst()));
        }
        return result;
    }
}
