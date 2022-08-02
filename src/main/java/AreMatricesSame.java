import java.util.ArrayList;
import java.util.Arrays;

public class AreMatricesSame {
    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int rowA = A.size();
        int colA = A.get(0).size();
        int rowB = B.size();
        int colB = B.get(0).size();
        boolean isMatrixSame = true;
        if(rowA == rowB && colA == colB){
            for(int i=0; i<rowA; i++){
                for(int j=0; j<colA; j++){
                    if(A.get(i).get(j) != B.get(i).get(j)){
                        return 0;
                    }
                }
            }
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        AreMatricesSame c = new AreMatricesSame();
//        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(1,-2,-3));
//        ArrayList<Integer> col2 = new ArrayList<>(Arrays.asList(-4,5,-6));
//        ArrayList<Integer> col3 = new ArrayList<>(Arrays.asList(-7,-8,9));
//        ArrayList<ArrayList<Integer>> row = new ArrayList<>();
//        row.add(col1);
//        row.add(col2);
//        row.add(col3);
        ArrayList<Integer> col1 = new ArrayList<>(Arrays.asList(3,2));
        ArrayList<Integer> col2 = new ArrayList<>(Arrays.asList(2,3));
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(col1);
        A.add(col2);

        ArrayList<Integer> col1B = new ArrayList<>(Arrays.asList(0,2));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(col1B);
        System.out.println(A);
        System.out.println(B);
        System.out.println(c.solve(A, B));
    }
}
