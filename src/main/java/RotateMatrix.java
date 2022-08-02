import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();
        int temp, s, e;
        //1. transpose the matrix i.e, row to col
        for(int i=0; i<col; i++){
            for(int j=i+1; j<row; j++){
                temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
        //2. now reverse the column value
        for(int i=0; i<row; i++){
            s = 0;
            e = col-1;
            while(s<e){
                temp = A.get(i).get(s);
                A.get(i).set(s, A.get(i).get(e));
                A.get(i).set(e, temp);
                s++;
                e--;
            }
        }
        System.out.println(A);
    }

    public static void main(String[] args) {
        RotateMatrix r = new RotateMatrix();
        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        ArrayList<Integer> col3A = new ArrayList<>(Arrays.asList(11,12,13,14,15));
        ArrayList<Integer> col4A = new ArrayList<>(Arrays.asList(16,17,18,19,20));
        ArrayList<Integer> col5A = new ArrayList<>(Arrays.asList(21,22,23,24,25));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        A.add(col2A);
        A.add(col3A);
        A.add(col4A);
        A.add(col5A);
        System.out.println(A);
        r.solve(A);
    }
}
