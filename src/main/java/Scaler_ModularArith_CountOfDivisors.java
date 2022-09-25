import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_ModularArith_CountOfDivisors {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(2,3,4,5))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(8,9,10))));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        int N = A.size();
        int count = 0;
        for(int i=0; i<N; i++){
            count = 0;
            for(int j=1; j*j<= A.get(i); j++){
                if(A.get(i) % j == 0){
                    if(j == A.get(i)/j){
                        //System.out.println("iff");
                        count++;
                    }else{
                        count += 2;
                    }
                    //System.out.println(A.get(i)+", "+j);
                }
            }
            B.add(i, count);
        }
        return B;
    }
}
