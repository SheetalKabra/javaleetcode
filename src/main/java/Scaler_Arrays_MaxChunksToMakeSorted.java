import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_Arrays_MaxChunksToMakeSorted {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(2,0,1,3))));
    }
    public static int solve(ArrayList<Integer> A) {
        int max = -1;
        int chunks = 0;
        for(int i=0;i<A.size();i++){
            max = Math.max(max, A.get(i));
            if(max == i){
                chunks++;
            }
        }
        return chunks;
    }

}
