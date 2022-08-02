import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public ArrayList<Integer> getSubArray(int[] arr, int n, int s){
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int sum = 0;
        int initial = 0;
        int end = 0;
        while(i < n){
            if(sum == s) {
                result.add(initial);
                result.add(end);
                return result;
            }else if(sum < s){
                sum = sum + arr[i];
                end = end + 1;
                i++;
            }else{
                sum = sum - arr[initial];
                initial = initial + 1;
            }
        }
        result.add(0);
        return result;
    }
}
