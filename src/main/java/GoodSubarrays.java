import java.util.ArrayList;
import java.util.Arrays;

public class GoodSubarrays {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int sum = 0;
        int length;
        int count = 0;
        for(int s=0; s<N; s++){
            sum = 0;
            for(int e=s; e<N; e++){
                sum = sum + A.get(e);
                length = e-s+1;
                if(length % 2 == 0 && sum < B){
                    count++;
                }else if(length % 2 != 0 && sum > B){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        GoodSubarrays g = new GoodSubarrays();
        System.out.println(g.solve(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)), 4));
        System.out.println(g.solve(new ArrayList<Integer>(Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9)), 65));
    }
}
