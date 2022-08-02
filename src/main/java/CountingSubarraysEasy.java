import java.util.ArrayList;
import java.util.Arrays;

public class CountingSubarraysEasy {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum = 0;
        int count = 0;
        for(int s=0; s<N; s++){
            sum = 0;
            if(A.get(s) > B){
                continue;
            }
            for(int e=s; e<N; e++){
                sum = sum + A.get(e);
                if(sum < B){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountingSubarraysEasy c = new CountingSubarraysEasy();
        System.out.println(c.solve(new ArrayList<Integer>(Arrays.asList(1, 11, 2, 3, 15)), 10));
    }
}
