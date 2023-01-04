import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ScalerAd_BackTracking_Sudoku {
    public static void main(String[] args) {
        ScalerAd_BackTracking_Sudoku s = new ScalerAd_BackTracking_Sudoku();
        ArrayList<ArrayList<Character>> row = new ArrayList<>();
        row.add(new ArrayList<Character>(Arrays.asList('5', '3', '.', '.', '7', '.', '.', '.', '.')));
        row.add(new ArrayList<Character>(Arrays.asList('6', '.', '.', '1', '9', '5', '.', '.', '.')));
        row.add(new ArrayList<Character>(Arrays.asList('.', '9', '8', '.', '.', '.', '.', '6', '.')));
        row.add(new ArrayList<Character>(Arrays.asList('8', '.', '.', '.', '6', '.', '.', '.', '3')));
        row.add(new ArrayList<Character>(Arrays.asList('4', '.', '.', '8', '.', '3', '.', '.', '1')));
        row.add(new ArrayList<Character>(Arrays.asList('7', '.', '.', '.', '2', '.', '.', '.', '6')));
        row.add(new ArrayList<Character>(Arrays.asList('.', '6', '.', '.', '.', '.', '2', '8', '.')));
        row.add(new ArrayList<Character>(Arrays.asList('.', '.', '.', '4', '1', '9', '.', '.', '5')));
        row.add(new ArrayList<Character>(Arrays.asList('.', '.', '.', '.', '8', '.', '.', '7', '9')));
        s.solveSudoku(row);
    }
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        solver(0, a);

    }

    public boolean solver(int index, ArrayList<ArrayList<Character>> A){
        //base condition
        int N = A.size();
        if(index == 81){
            System.out.println("finally here:");
            System.out.println(A);
            return true;
        }
        int i = index/N;
        int j = index%N;
        if(A.get(i).get(j) != '.'){
            return solver(index+1, A);
        }
        for(char k='1'; k<='9'; k++){
            A.get(i).set(j, k);
            if(isValid(A)){
                A.get(i).set(j, k);
                if(solver(index+1, A)){
                    return true;
                }else{
                    A.get(i).set(j, '.');
                }
            }else{
                A.get(i).set(j, '.');
            }
        }
        return false;
    }

    public boolean isValid(ArrayList<ArrayList<Character>> A){
        int N = A.get(0).size();
        Set<String> set = new HashSet<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                char ch = A.get(i).get(j);
                if(ch != '.'){
                    int boxNo = (i/3)*3 + (j/3);
                    if(!set.add(ch + " is in row "+i) || !set.add(ch + " is in col "+j) || !set.add(ch + " is in box "+boxNo)){
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
