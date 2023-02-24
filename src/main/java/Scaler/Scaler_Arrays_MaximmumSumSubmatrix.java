package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_Arrays_MaximmumSumSubmatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//        A.add(0, new ArrayList<>(Arrays.asList(0,3,4,-1,2)));
//        A.add(1, new ArrayList<>(Arrays.asList(5,2,1,3,6)));
//        A.add(2, new ArrayList<>(Arrays.asList(1,2,7,2,0)));
//        A.add(3, new ArrayList<>(Arrays.asList(-2,-4,2,5,1)));
//        A.add(4, new ArrayList<>(Arrays.asList(8,6,5,-3,0)));


        A.add(0, new ArrayList<>(Arrays.asList(-6, 6)));
        A.add(1, new ArrayList<>(Arrays.asList(-29, -8)));
        A.add(2, new ArrayList<>(Arrays.asList(3, -8)));
        A.add(3, new ArrayList<>(Arrays.asList(-15, 2)));
        A.add(4, new ArrayList<>(Arrays.asList(25, 25)));
        A.add(5, new ArrayList<>(Arrays.asList(20, -5)));


        System.out.println(solve(A));
    }
    public static int kadane(ArrayList<Integer> A){
        int sum=0;
        int ans=0;
        for(int  i=0; i<A.size(); i++){
            sum = sum + A.get(i);
            ans = Math.max(sum, ans);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }

    public static int solve(ArrayList<ArrayList<Integer>> A) {
        System.out.println(A);
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> presum = new ArrayList<>();
        for(int i=0; i<=N; i++){
            ArrayList<Integer> col = new ArrayList<>();
            for(int j=0;j<=M;j++){
                col.add(j, 0);
            }
            presum.add(i, col);
        }

        for(int j=1; j<=M; j++){
            for(int i=1;i<=N; i++){
                int val = presum.get(i-1).get(j) + A.get(i-1).get(j-1);
                presum.get(i).set(j, val);
            }
        }
        System.out.println(presum);
        int ans = Integer.MIN_VALUE;
        for(int tr=1; tr<=N; tr++){
            for(int br=tr; br<=N; br++){
                ArrayList<Integer> arr = new ArrayList<>();
                for(int c=1; c<=M; c++){
                    arr.add(presum.get(br).get(c)- presum.get(tr-1).get(c));
                }
                ans = Math.max(ans, kadane(arr));
            }
        }
        return ans;
    }
}
