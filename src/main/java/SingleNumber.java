import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int N = A.size();
        int ans = 0;
        for(int i=0; i<N; i++){
            ans = ans^A.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(new ArrayList<>(Arrays.asList(1,2,2,3,1))));
        System.out.println(s.singleNumber(new ArrayList<>(Arrays.asList(1,2,2,1))));
    }
}
