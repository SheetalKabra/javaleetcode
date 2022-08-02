import java.util.ArrayList;
import java.util.Arrays;

public class TimeToEquality {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,4,1,3,2));
        TimeToEquality t = new TimeToEquality();
        System.out.println(t.solve(input));
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(A.get(0));
        int max = A.get(0);
        for(int i=1; i<N;i++){
            prefixSum.add(prefixSum.get(i-1) + A.get(i));
            if(A.get(i) > max){
                max = A.get(i);
            }
        }
        return max*N - prefixSum.get(N-1);
    }
}
