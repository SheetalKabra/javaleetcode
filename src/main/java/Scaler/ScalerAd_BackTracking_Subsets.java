package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_BackTracking_Subsets {
    //public ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        ScalerAd_BackTracking_Subsets s = new ScalerAd_BackTracking_Subsets();
        System.out.println(s.subsets(new ArrayList<>(Arrays.asList(1,2,3))));
//        System.out.println(s.subsets(new ArrayList<>(Arrays.asList(12,13))));
    }

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        solve(result, A, 0, new ArrayList<>(), A.size());
        return result;
    }

    public void solve(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> arr, int i, ArrayList<Integer> curr, int N){
        if(i== N){
            return;
        }
        curr.add(arr.get(i));
        result.add(new ArrayList<>(curr));
        solve(result, arr, i+1, curr, N);
        curr.remove(curr.size()-1);
        solve(result, arr, i+1, curr, N);
    }


}
