import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ScalerAd_TwoPointers_SortByColor {
    public static void main(String[] args) {
        System.out.println(sortColors(new ArrayList(Arrays.asList(0,1,2,0,1,2))));
        System.out.println(sortColors(new ArrayList(Arrays.asList(0))));
    }
    public static ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        if(A.size() == 1){
            return A;
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<3; i++){
            freq.put(i,0);
        }
        int N = A.size();
        for(int i=0; i<N; i++){
            freq.put(A.get(i), freq.get(A.get(i))+1);
        }
//        System.out.println(freq);
        int k = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<freq.get(i); j++){
                A.set(k, i);
                k++;
            }
        }
        return A;
    }
}
