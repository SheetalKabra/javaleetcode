import java.util.ArrayList;

public class Scaler_PrimeNo_NoOfOpenDoors {
    public static void main(String[] args) {
        System.out.println(solve(978125));
        System.out.println(solve(554039));
        System.out.println(solve(100));

    }
    public static int solve(int A) {
        ArrayList<Integer> state  = new ArrayList<>();
        //int[] state = new int[A+1];
        //initially I kept al doors are open
        for(int i=0;i<A; i++){
            state.add(i, 1);
        }
        //System.out.println("i:1, "+state);
        for(int i=1; i<A; i++){
            for(int j=i; j<A; j=j+i+1){
                //System.out.println("i:");
                state.set(j, 1-state.get(j));
            }
            //System.out.println("i:"+i+", "+state);
        }
        int count = 0;
        for(int i=0; i<A; i++){
            if(state.get(i) == 1){
                count++;
            }

        }
        return count;
    }
}
