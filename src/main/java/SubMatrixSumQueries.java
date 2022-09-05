import java.util.ArrayList;
import java.util.Arrays;

public class SubMatrixSumQueries {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(0,new ArrayList<>(Arrays.asList(1,2,3)));
        A.add(1, new ArrayList<>(Arrays.asList(4,5,6)));
        A.add(2, new ArrayList<>(Arrays.asList(7,8,9)));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(2,3));
        System.out.println(solve(A,B,C,D,E));

//        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//        A.add(0,new ArrayList<>(Arrays.asList(5, 17, 100, 11)));
//        A.add(1, new ArrayList<>(Arrays.asList(0, 0,  2,   8)));
//        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,1));
//        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1,4));
//        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(2,2));
//        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(2,4));
//        System.out.println(solve(A,B,C,D,E));
    }
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {
        int m = 1000000007;
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Long>> pf = new ArrayList<>();
        for(int i=0;i<N;i++){
            ArrayList<Long> col = new ArrayList<>(M);
            pf.add(col);
        }
        //now add an entries into pf matrix
        //to create a pf matrix we need to handle 0th row and 0th col differently
        //pf[i][j] = pf[i-1][j] + pf[i][j-1] + A[i][j] - pf[i-1][j-1];
        pf.get(0).add((long)(A.get(0).get(0)%m));
        //for 0th row
        for(int i=1; i<M; i++){
            long val = ((pf.get(0).get(i-1)%m)+(A.get(0).get(i)%m))%m;
            pf.get(0).add(i, val);
        }
        //for 0th col
        for(int i=1; i<N; i++){
            long val = ((pf.get(i-1).get(0)%m)+(A.get(i).get(0)%m))%m;
            pf.get(i).add(0, val);
        }
        //for rest of the columns
        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                long val = ((pf.get(i-1).get(j)%m)+ (pf.get(i).get(j-1)%m) + (A.get(i).get(j)%m) - (pf.get(i-1).get(j-1)%m))%m;
                pf.get(i).add(j, val);
            }
        }
        //now calculate the sub matrix sum
        //sum[LiLj : RiRj] = pf[Ri][Rj] - pf[Li-1][Rj] - pf[Ri][Lj-i] + pf[Li-1][Lj-1]
        //Li = B[i]
        //Lj = C[i]
        //Ri = D[i]
        //Rj = E[i]
        long sum = 0;
        ArrayList<Integer> op = new ArrayList<>();
        for(int i=0; i<B.size(); i++){
            int Li = B.get(i)-1;
            int Lj = C.get(i)-1;
            int Ri = D.get(i)-1;
            int Rj = E.get(i)-1;
            if(Li == 0 && Lj == 0){
                sum = pf.get(Ri).get(Rj) ;
            }else if(Li == 0){
                sum = ((pf.get(Ri).get(Rj)%m) - (pf.get(Ri).get(Lj-1)%m) )%m;
            }else if(Lj == 0){
                sum = ((pf.get(Ri).get(Rj)%m) - (pf.get(Li-1).get(Rj)%m))%m;
            }else{
                sum = ((pf.get(Ri).get(Rj)%m) - (pf.get(Li-1).get(Rj)%m) - (pf.get(Ri).get(Lj-1)%m) + (pf.get(Li-1).get(Lj-1)%m))%m;
            }
            if(sum<0){
                sum = sum + m;
            }
            op.add((int)(sum));
        }
        return op;
    }
}
