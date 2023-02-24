package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_BackTracking_Permutations {
    public static void main(String[] args) {
        ScalerAd_BackTracking_Permutations p = new ScalerAd_BackTracking_Permutations();
        System.out.println(p.permute(new ArrayList<>(Arrays.asList(1,2,3))));
    }
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            ar.add(0);
        }
        solve(A, 0, ar, result);
        return result;
    }

    public void solve(ArrayList<Integer> arr, int i, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(i == arr.size()){
            ArrayList<Integer> tmp = new ArrayList(curr);
            result.add(tmp);
            return;
        }
        for(int k=i; k<arr.size(); k++){
            curr.set(i, arr.get(k));
            //curr[i] = arr.get(k);
            //swap arr[i] and arr[k]
            swap(arr, i, k);
//            int temp = arr.get(i);
//            arr.set(i, arr.get(k));
//            arr.set(k, temp);
            solve(arr, i+1, curr, result);
            swap(arr, i, k);
//            temp = arr.get(i);
//            arr.set(i, arr.get(k));
//            arr.set(k, temp);
        }
    }

    public void swap(ArrayList<Integer> arr, int i1, int i2){
        int temp = arr.get(i1);
        arr.set(i1, arr.get(i2));
        arr.set(i2, temp);
    }

}
