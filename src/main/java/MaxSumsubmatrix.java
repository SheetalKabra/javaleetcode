import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumsubmatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//        A.add(0, new ArrayList<>(Arrays.asList(-17,-2)));
//        A.add(1, new ArrayList<>(Arrays.asList(20,10)));


        A.add(0, new ArrayList<>(Arrays.asList(-6,-6)));
        A.add(1, new ArrayList<>(Arrays.asList(-29, -8)));
        A.add(1, new ArrayList<>(Arrays.asList(3, -8)));
        A.add(1, new ArrayList<>(Arrays.asList(-15, 2)));
        A.add(1, new ArrayList<>(Arrays.asList(25,25)));
        A.add(1, new ArrayList<>(Arrays.asList(20, -5)));

        System.out.println(solve(A));
    }
    public static int solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> pfa = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> col = new ArrayList<>();
            pfa.add(i, col);
        }
        //create a prefix sum for 0th row
        pfa.get(0).add(0, A.get(0).get(0));
        for(int i=1; i<M; i++){
            int sum = pfa.get(0).get(i-1) + A.get(0).get(i);
            pfa.get(0).add(i, sum);
        }
        //create a prefix sum for 0th col
        for(int i=1; i<N; i++){
            int sum = pfa.get(i-1).get(0) + A.get(i).get(0);
            pfa.get(i).add(0, sum);
        }
        //for rest of the cols
        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                int sum = pfa.get(i-1).get(j) + pfa.get(i).get(j-1) - pfa.get(i-1).get(j-1) + A.get(i).get(j);
                pfa.get(i).add(j, sum);
            }
        }
        //System.out.println(pfa);

        //for submatrix sum
        int submatrixSum = 0;
        int max = Integer.MIN_VALUE;
        //take each row as a starting row
        for(int i=0; i<N; i++){
            //take each col as a starting col
            for(int j=0; j<M; j++){
                //now consider i, j as a top left
                for(int k=i; k<N; k++){
                    for(int l=j; l<M; l++){
                        //consider k, l as a bottom right
                        submatrixSum = pfa.get(k).get(l);
                        if(i!=0){
                            submatrixSum -= pfa.get(i-1).get(l);
                        }
                        if(j!=0){
                            submatrixSum -= pfa.get(k).get(j-1);
                        }
                        if(i!=0 && j!=0){
                            submatrixSum += pfa.get(i-1).get(j-1);
                        }
                        max = Math.max(max, submatrixSum);
                    }
                }
            }
        }
        return max;
    }

    public int solve(int[][] A){
        int N = A.length;
        int M = A[0].length;
        for(int i=0;i<N;i++){
            for(int j=1;j<M;j++){
                A[i][j]+=A[i][j-1];
            }
        }

        int[] ans = new int[N];
        int[][] B = new int[N+1][M+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                B[i][j]=A[i-1][j-1];
            }
        }

        int max = Integer.MIN_VALUE;
        for(int start=0;start<M;start++){
            for(int end = start+1; end<=M;end++){
                for(int i=0;i<N;i++){
                    ans[i]= B[i+1][end]-B[i+1][start];
                }
                int sum = 0;
                for(int j : ans){
                    sum=Math.max(sum+j,j);
                    max=Math.max(max,sum);
                }
                ans = new int[N];
            }
        }
        return max;
    }
}
