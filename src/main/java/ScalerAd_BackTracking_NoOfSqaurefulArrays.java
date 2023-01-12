import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ScalerAd_BackTracking_NoOfSqaurefulArrays {
    public static void main(String[] args) {
        ScalerAd_BackTracking_NoOfSqaurefulArrays s = new ScalerAd_BackTracking_NoOfSqaurefulArrays();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(2,2,2))));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1, 17, 8))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(41))));
    }
    HashSet<Long> sqaureSet = new HashSet<>();
    public int solve(ArrayList<Integer> A) {
        if(A.size() == 1){
            return 0;
        }
        long x = 1;
        while(x * x <= 2e9){
            sqaureSet.add(x*x);
            x++;
        }
        ArrayList<Integer> curr = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            curr.add(0);
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solver(0, A, curr, result);
        return result.size();
    }

    public void solver(int i, ArrayList<Integer> A, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(i == A.size()){
            ArrayList<Integer> temp = new ArrayList<>(curr);
            System.out.println("temp:"+temp);
            if(!result.contains(temp)){
                for(int j=1; j<A.size(); j++){
                    long val = curr.get(j-1)+curr.get(j);
                    if(!sqaureSet.contains(val)){
                        return;
                    }
                }
                System.out.println("here:");
                result.add(temp);
            }
            return;
        }

        for(int k=i; k<A.size(); k++){
            curr.set(i, A.get(k));
            swap(A, k, i);
            solver(i+1, A, curr, result);
            swap(A, k, i);
        }
    }

    public void swap(ArrayList<Integer> A, int i1, int i2){
        int temp = A.get(i1);
        A.set(i1, A.get(i2));
        A.set(i2, temp);
    }
}
