import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();

        int c;
        int minr;
        int count;
        if(N*N == 1){
            return A;
        }
        ArrayList<ArrayList<Integer>> antiDiagonals = new ArrayList<>(2*N-1);
        for(int i=0; i<2*N-1; i++){
            ArrayList<Integer> antiDiagonalsCol = new ArrayList<Integer>(N);
            for(int j=0; j<N;j++){
                antiDiagonalsCol.add(j, 0);
            }
            antiDiagonals.add(antiDiagonalsCol);
        }

        for(int sum=0; sum<=(N*N-2); sum++){
            if(sum < N-1){
                minr = sum;
            }else{
                minr = N-1;
            }
            count = 0;
            for(int r=0; r<=minr; r++){
                c = sum -r;
                if(c<0 || c>= N){
                    continue;
                }
                antiDiagonals.get(sum).set(count, A.get(r).get(c));
                count++;
            }
        }
        return antiDiagonals;
    }

    public static void main(String[] args) {
        AntiDiagonals c = new AntiDiagonals();
//        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(1,2,3));
//        ArrayList<Integer> col2 = new ArrayList<>(Arrays.asList(4,5,6));
//        ArrayList<Integer> col3 = new ArrayList<>(Arrays.asList(7,8,9));
//        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
//        row.add(col1);
//        row.add(col2);
//        row.add(col3);
        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> col2 = new ArrayList<>(Arrays.asList(3,4));
        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
        row.add(col1);
        row.add(col2);
        System.out.println(row);
        System.out.println(c.diagonal(row));
    }
}
