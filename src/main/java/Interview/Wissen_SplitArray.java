package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wissen_SplitArray {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7};
        int splitSize = 5;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

//        List<int[]> list = splitArray(original, splitSize);
//        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitarray -> System.out.println(Arrays.toString(splitarray)));
    }

    private static List<int[]> splitArray(int[] original, int splitSize) {
        List<int[]> myList = new ArrayList<>();
        int N = original.length;
        int i = 0;
        while(i<N){
            if(N-i < splitSize){
                splitSize = N-i;
            }
            int[] splitArray = new int[splitSize];
            int k = i;
            for(int j=0; j<splitSize; j++){
                if(N == k){
                    break;
                }
                splitArray[j] = original[k];
                k++;
            }
            i=k;
            myList.add(splitArray);
        }
        return myList;
    }

    private static List<int[]> splitArray1(int[] original, int splitSize){
        List<int[]> myList = new ArrayList<>();
        int N = original.length;
        int i=0;
        while(i<N){
            if(N-i<splitSize){
                splitSize = N-i;
            }
            int[] splitarr = new int[splitSize];
            int k= i;
            for(int j=0; j<splitSize; j++){
                if(k == N){
                    break;
                }
                splitarr[j] = original[k];
                k++;
            }
            i=k;
            myList.add(splitarr);
        }
        return myList;
    }
}
