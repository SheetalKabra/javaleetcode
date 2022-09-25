import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_PrimeNo_CountDivisors {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(2,3,4,5))));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<N; i++){
            result.add(i, countFactors(A.get(i)));
        }
        return result;
    }

    public static int countFactors(int N){
        int count = 0;
        for(int i=1; i*i<=N; i++){
            if(N%i == 0){
                if(i == N/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }
}
