package Scaler;

import java.util.*;

public class ScalerAd_BackTracking_NQueens {
    private Set<Integer> colSet = new HashSet<>();
    private Set<Integer> diag = new HashSet<>();
    private Set<Integer> antidiag = new HashSet<>();

    public static void main(String[] args) {
        ScalerAd_BackTracking_NQueens s = new ScalerAd_BackTracking_NQueens();
        System.out.println(s.solveNQueens(5));
    }

    public ArrayList<ArrayList<String>> solveNQueens(int A) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        solver(result, new ArrayList<>(), 0, A);
        return result;
    }

    public void solver(ArrayList<ArrayList<String>> result, ArrayList<Integer> list, int i, int N){
        if(i == N){
            ArrayList<String> temp = new ArrayList<>();
            for(int x:list){
                char[] arr = new char[N];
                Arrays.fill(arr, '.');
                arr[x] = 'Q';
                temp.add(new String(arr));
            }
            result.add(temp);
            //System.out.println("result:"+result+", i:"+i);
            return;
        }
        for(int j=0; j<N; j++){
            if(colSet.contains(j) || diag.contains(i-j) || antidiag.contains(i+j)){
                continue;
            }
            //do
            list.add(j);
            colSet.add(j);
            diag.add(i-j);
            antidiag.add(i+j);

            //call
            solver(result, list, i+1, N);

            //undo
            list.remove(list.size() - 1);
            colSet.remove(j);
            diag.remove(i-j);
            antidiag.remove(i+j);
        }
    }
}
