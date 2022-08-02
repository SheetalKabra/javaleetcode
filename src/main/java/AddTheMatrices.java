import java.util.ArrayList;
import java.util.Arrays;

public class AddTheMatrices {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> sumArray = new ArrayList<>(rows);
        int sum =0;
        for(int i=0; i<rows; i++){
            ArrayList<Integer> sumcol = new ArrayList<Integer>(cols);
            for(int j=0; j<cols; j++){
                sum = A.get(i).get(j) + B.get(i).get(j);
                sumcol.add(j, sum);
            }
            sumArray.add(sumcol);
        }
        return sumArray;
    }

    public static void main(String[] args) {
        AddTheMatrices c = new AddTheMatrices();
        ArrayList<Integer> col1A = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> col2A = new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> col3A = new ArrayList<>(Arrays.asList(7,8,9));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1A);
        A.add(col2A);
        A.add(col3A);
        ArrayList<Integer> col1B = new ArrayList<>(Arrays.asList(9,8,7));
        ArrayList<Integer> col2B = new ArrayList<>(Arrays.asList(6,5,4));
        ArrayList<Integer> col3B = new ArrayList<>(Arrays.asList(3,2,1));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(col1B);
        B.add(col2B);
        B.add(col3B);
        System.out.println(A);
        System.out.println(B);
        System.out.println(c.solve(A, B));
    }
}
