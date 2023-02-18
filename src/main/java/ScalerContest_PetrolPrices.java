import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ScalerContest_PetrolPrices {
    public static void main(String[] args) {
        ScalerContest_PetrolPrices s = new ScalerContest_PetrolPrices();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(5,6,3,4,2,1)), 2));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(7,3,3,5,2)), 3));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2,4,8,16,32,64,96)), 3));
    }
    public int solve(ArrayList<Integer> A, int B) {
        System.out.println(A);
        int N = A.size();
        int[] result = new int[N];
        int i=0;
        int k=1;
        while(i<N && k<N){
            System.out.println("i:"+i+", k:"+k);
            if(A.get(i) >= A.get(k)){
                if(result[i] == 0){
                    result[i] = 1;
                    i++;
                    k++;
                }
                System.out.println("if +"+Arrays.toString(result));
            }else{
                k = i+1;
                int j = B;
                while(A.get(i) < A.get(k) && j>0){
                    k++;
                    j--;
                }
                result[i] = k-i;
                System.out.println("else +"+Arrays.toString(result));
                i=k;
                k=k+1;
            }
        }
        while(i<N){
            result[i] = 1;
            i++;
        }
        System.out.println(Arrays.toString(result));
        return 1;
    }
}
