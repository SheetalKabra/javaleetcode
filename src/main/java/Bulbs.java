import java.util.ArrayList;

public class Bulbs {
    public int bulbs(ArrayList<Integer> A) {
        int N = A.size();
        int lastState = 0;
        int elem;
        for(int i=0; i<N; i++){
            elem = (lastState%2 == 0) ? A.get(i) : (A.get(i) == 0 ? 1 : 0);
            if(elem == 0){
                lastState++;
            }
        }
        return lastState;
    }
}
