package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class BalanceArray {
    public int solve(ArrayList<Integer> A) {
        /**
         1. Create a prefix sum of even index ArrayList: pfe
         2. Create a prefix sum of odd index ArrayList: pfo
         3. Apply for loop from 0 to N of A
         3.1. se = pfe[i-1] + pfo[n-1] - pfo[i];
         3.2. so = pfo[i-1] + pfe[n-1] - pfe[i];
         */
        int N = A.size();
        ArrayList<Integer> pfe = new ArrayList<>();
        ArrayList<Integer> pfo = new ArrayList<>();
        pfe.add(0, A.get(0));
        pfo.add(0, 0);
        for(int i=1; i<N; i++){
            if(i%2 == 0){
                pfe.add(i, pfe.get(i-1)+A.get(i));
                pfo.add(i, pfo.get(i-1));
            }else{
                pfo.add(i, pfo.get(i-1)+A.get(i));
                pfe.add(i, pfe.get(i-1));
            }
        }
        System.out.println(pfe);
        System.out.println(pfo);
        return 1;
    }

    public static void main(String[] args) {
        BalanceArray b = new BalanceArray();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8,7,6,5,3,9,2,1));
        System.out.println(arr);
        System.out.println(b.solve(arr));
    }
}
