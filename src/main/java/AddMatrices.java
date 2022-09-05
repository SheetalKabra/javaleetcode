import java.util.ArrayList;

public class AddMatrices {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int arow = A.size();
        int acol = A.get(0).size();
        int brow = B.size();
        int bcol = B.get(0).size();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();


        for(int i=0; i<arow; i++){
            ArrayList<Integer> ccol = new ArrayList<>();
            for(int j=0; j<acol; j++){
                ccol.add(j, (A.get(i).get(j) + B.get(i).get(j)));
            }
            C.add(i, ccol);
        }
        return C;
    }

    public static void main(String[] args) {
        AddMatrices a = new AddMatrices();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> Acol = new ArrayList<>();

        //System.out.println(a.solve(A));
    }
}
