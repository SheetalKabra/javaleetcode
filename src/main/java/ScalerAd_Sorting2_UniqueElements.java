import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_Sorting2_UniqueElements {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,6))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(7,1,2,3,6))));
    }

    public static int solve(ArrayList<Integer> A) {
        int n=A.size();
        if(n==1){
            return 0;
        }
        Collections.sort(A);
        //System.out.println(A);
        int stepCount=0;
        for(int i=1;i<n;i++){
            if(A.get(i)<=A.get(i-1)){
                //System.out.println("i:"+i);
                int difference = A.get(i-1) + 1 - A.get(i);
                A.set(i, A.get(i) + difference);
                //System.out.println("A:"+A);
                stepCount+= difference;

            }
        }
        return stepCount;
    }
    public static int solve1(ArrayList<Integer> A) {
        int N = A.size();
        int count = 0;
        for(int i=1; i<N; i++){
            if(A.get(i-1) == A.get(i)){
                count++;
                A.set(i, A.get(i)+1);
                System.out.println("count:"+count);
                System.out.println("A:"+A);
            }

        }
        return count;
    }
}
