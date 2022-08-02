import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ElementsRemoval {

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        //sort the array in desc order
        Collections.sort(A, Collections.reverseOrder());
        int cost = 0;
        for(int i=0; i<N; i++){
            cost = cost + (i+1)*A.get(i);
        }
        return cost;
    }

    public static void main(String[] args) {
        ElementsRemoval e = new ElementsRemoval();
        System.out.println(e.solve(new ArrayList<>(Arrays.asList())));
    }
}
