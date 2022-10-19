import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_Sorting3_MaxUnsortedArray {
    public static void main(String[] args) {
        System.out.println(subUnsort(new ArrayList<>(Arrays.asList(1,2,3,4,50))));
        System.out.println(subUnsort(new ArrayList<>(Arrays.asList(1,3,2,4,5,8,6,7,9,12,10))));
//        System.out.println(subUnsort(new ArrayList<>(Arrays.asList(1,1))));
//        System.out.println(subUnsort(new ArrayList<>(Arrays.asList(4, 15, 4, 4, 15, 18, 20))));
//        System.out.println(subUnsort(new ArrayList<>(Arrays.asList(4, 15, 4, 5, 15, 18, 20))));
        System.out.println(subUnsort(new ArrayList<>(Arrays.asList(4, 11,15,16,8,9,7,6,5))));
    }

    public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int N = A.size();
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i=1; i<N; i++){
            if(A.get(i) < A.get(i-1)){
                firstIndex = i;
                break;
            }
        }
        if(firstIndex == -1){
            return new ArrayList(Arrays.asList(-1));
        }
        //now find the min element from firstIndex to N-1
        int min = Integer.MAX_VALUE;
        for(int i=firstIndex; i<N; i++){
            min = Math.min(min, A.get(i));
        }

        for(int i=0; i<firstIndex; i++){
            if(A.get(i) > min){
                firstIndex = i;
                break;
            }
        }
        for(int i=N-2; i>=0; i--){
            if(A.get(i) > A.get(i+1)){
                lastIndex = i;
                break;
            }
        }
        //now find the max element from lastIndex to 0
        int max = Integer.MIN_VALUE;
        for(int i=lastIndex; i>=0; i--){
            max = Math.max(max, A.get(i));
        }
        for(int i=N-1; i>=lastIndex; i--){
            if(A.get(i) < max){
                lastIndex = i;
                break;
            }
        }
        return new ArrayList(Arrays.asList(firstIndex, lastIndex));
    }


    public static ArrayList<Integer> subUnsort1(ArrayList<Integer> A) {
        int N = A.size();
        int i = 1;
        while(i<N && A.get(i) >= A.get(i-1)){
            i++;
        }
        int j=N-2;
        while(j>=0 && A.get(j) <= A.get(j+1)){
            j--;
        }
        if(i == N && j == -1){
            return new ArrayList(Arrays.asList(-1));
        }
        return new ArrayList(Arrays.asList(i-1, j+1));
    }
}
