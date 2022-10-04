import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_Arrays_MaxSumSquareMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0, new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1)));
        A.add(1, new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2)));
        A.add(2, new ArrayList<>(Arrays.asList(3, 8, 6, 7, 3)));
        A.add(3, new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4)));
        A.add(4, new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5)));

//        A.add(0, new ArrayList<>(Arrays.asList(2,2)));
//        A.add(1, new ArrayList<>(Arrays.asList(2,2)));
        System.out.println(solve(A, 3));
    }

    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> pf = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> col = new ArrayList<>();
            for(int j=0; j<M; j++){
                col.add(j, 0);
            }
            pf.add(i, col);
        }
        pf.get(0).set(0, A.get(0).get(0));
        for(int i=1; i<N; i++){
            int val = pf.get(i-1).get(0) + A.get(i).get(0);
            pf.get(i).set(0, val);
        }
        for(int i=1; i<M; i++){
            int val = pf.get(0).get(i-1) + A.get(0).get(i);
            pf.get(0).set(i, val);
        }

        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                int val = pf.get(i-1).get(j) + pf.get(i).get(j-1) - pf.get(i-1).get(j-1) + A.get(i).get(j);
                pf.get(i).set(j, val);
            }
        }
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<=N-B; i++){
            for(int j=0; j<=M-B; j++){
                int li = i;
                int lj = j;
                int ri = i+B-1;
                int rj = j+B-1;
                //System.out.println("li:"+li+", lj:"+lj+", ri:"+ri+", rj:"+rj);
                sum = pf.get(ri).get(rj);
                if(li == 0 && lj == 0){
                    sum = sum;
                }else if(li == 0) {
                    sum =  sum - pf.get(ri).get(lj-1);
                }else if(lj == 0){
                    sum = sum - pf.get(li-1).get(rj);
                }else {
                    sum = sum - pf.get(ri).get(lj-1) - pf.get(li-1).get(rj) + pf.get(li-1).get(lj-1);
                }
                //System.out.println(sum);
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}
