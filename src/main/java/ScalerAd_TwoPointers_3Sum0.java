import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_TwoPointers_3Sum0 {
    public static void main(String[] args) {
        System.out.println(threeSum(new ArrayList<>(Arrays.asList(-1,0,1,2,-1,4))));
    }
    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        int N = A.size();
        int sum = 0;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(A);
        for(int i=0; i<N; i++){
            sum = 0-A.get(i);
            int l = i+1;
            int r = N-1;
            while(l<r){
                if((A.get(l) + A.get(r)) == sum){
                    ArrayList<Integer> a=new ArrayList<Integer>();
                    //add
                    a.add(A.get(i));
                    a.add(A.get(l));
                    a.add(A.get(r));
                    if(!result.contains(a)){
                        result.add(a);
                    }
                    l++;
                    r--;
                }else if((A.get(l) + A.get(r)) > sum){
                    r--;
                }else if((A.get(l) + A.get(r)) < sum){
                    l++;
                }
            }
        }
        return result;
    }
}
