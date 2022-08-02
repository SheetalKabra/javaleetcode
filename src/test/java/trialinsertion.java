import java.util.ArrayList;
import java.util.Arrays;

public class trialinsertion {

    public static void main(String[] args) {
        trialinsertion t = new trialinsertion();
        System.out.println(t.solve(new ArrayList<>(Arrays.asList(1, 14, 76, 46, 54, 22, 5, 68, 68, 94))));
    }

    public Long solve(ArrayList<Integer> A) {
        int N = A.size();
        boolean isSwap;
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j>0; j--){
                isSwap = false;
                if(A.get(j-1) > A.get(j)){
                    isSwap = true;
                    int temp = A.get(j-1);
                    A.set(j-1, A.get(j));
                    A.set(j, temp);
                }
                if(isSwap == false){
                    break;
                }
            }
        }
        System.out.println("afetr sort");
        System.out.println(A);
        if(N == 1){
            return Long.valueOf(A.get(0));
        }
        long sum = A.get(0) + A.get(1);
        long cost = sum;
        for(int i =2; i<N; i++){
            sum = sum + A.get(i);
            cost = cost + sum;
        }
        return cost;
    }
}
