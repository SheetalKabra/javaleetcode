import java.util.ArrayList;
import java.util.Arrays;

public class MagicNumber {
    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
//        int max = A.get(0);
//        for(int i=1; i<N; i++){
//            if(A.get(i) > max){
//                max = A.get(i);
//            }
//        }
        boolean isAllEqual = true;
        for(int i=1; i<N; i++){
            if(A.get(i-1) != A.get(i)){
                isAllEqual = false;
                break;
            }
        }
        if(isAllEqual){
            return 0;
        }
        int rem = A.get(0)%B;
        for(int i=1; i<N; i++){
            if(A.get(i) % B != rem){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        MagicNumber m = new MagicNumber();
//        System.out.println(m.solve(new ArrayList<>(Arrays.asList(5,10,15,20,25)), 5));
//        System.out.println(m.solve(new ArrayList<>(Arrays.asList(5,10,15,20,25)), 4));
//        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,1,11)), 9923));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,1,1)), 999930));
//        System.out.println(m.solve(new ArrayList<>(Arrays.asList(201)), 341));
    }
}
