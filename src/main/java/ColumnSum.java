import java.util.ArrayList;
import java.util.Arrays;

public class ColumnSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<Integer> columnSum = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<cols; i++){
            sum = 0;
            for(int j=0; j<rows; j++){
                sum = sum + A.get(j).get(i);
            }
            columnSum.add(sum);
        }
        return columnSum;
    }

    public static void main(String[] args) {
        ColumnSum c = new ColumnSum();
        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> col2 = new ArrayList<>(Arrays.asList(5,6,7,8));
        ArrayList<Integer> col3 = new ArrayList<>(Arrays.asList(9,2,3,4));
        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
        row.add(col1);
        row.add(col2);
        row.add(col3);
        System.out.println(row);
        System.out.println(c.solve(row));


    }
}
