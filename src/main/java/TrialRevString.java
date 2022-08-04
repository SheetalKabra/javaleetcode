import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrialRevString {

    public static void main(String[] args) {
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("");
        int[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort(arr1);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }


}
