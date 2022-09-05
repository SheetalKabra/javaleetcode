import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsValidSudoku {
    public int isValidSudoku(final List<String> A) {
        int blockwiseSR=0;
        int blockwiseSC=0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char elem = A.get(i).charAt(j);
                //System.out.println("elem:"+elem);
                if(elem != '.'){
                    for(int k=0; k<9; k++){
                        if(A.get(i).charAt(k) != '.'){
                            //System.out.println("A.get("+i+").charAt("+k+")="+A.get(i).charAt(k));
                            if(A.get(i).charAt(k) == elem && k!=j){
                                //System.out.println("falsee");
                                return 0;
                            }
                        }

                        if(A.get(k).charAt(j) != '.'){
                            //System.out.println("A.get("+k+").charAt("+j+")="+A.get(k).charAt(j));
                            if(A.get(k).charAt(j) == elem && k!=i){
                                //System.out.println("falsee");
                                return 0;
                            }
                        }
                    }

                    if(i<=2){
                        blockwiseSR = 0;
                    }else if(i<=5){
                        blockwiseSR = 3;
                    }else if(i<=8){
                        blockwiseSR = 6;
                    }

                    if(j<=2){
                        blockwiseSC = 0;
                    }else if(j<=5){
                        blockwiseSC = 3;
                    }else if(j<=8){
                        blockwiseSC = 6;
                    }

                    for(int l=blockwiseSR; l<=blockwiseSR+2; l++){
                        for(int m=blockwiseSC; m<=blockwiseSC+2; m++){
                            if(A.get(l).charAt(m) == elem && l!=i && m!=j){
                                return 0;
                            }
                        }
                    }
                }

            }
        }
        return 1;
    }

    public static void main(String[] args) {
        IsValidSudoku i = new IsValidSudoku();
        List<String> list = new ArrayList<>(Arrays.asList("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"));
        System.out.println(list);
        System.out.println(i.isValidSudoku(list));
        System.out.println("=======================");
        List<String> list1 = new ArrayList<>(Arrays.asList("63..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"));
        System.out.println(list1);
        System.out.println(i.isValidSudoku(list1));
        System.out.println("=======================");
        List<String> list2 = new ArrayList<>(Arrays.asList("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "5...8..79"));
        System.out.println(list2);
        System.out.println(i.isValidSudoku(list2));
        System.out.println("=======================");
        List<String> list3 = new ArrayList<>(Arrays.asList("53..7...5", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"));
        System.out.println(list3);
        System.out.println(i.isValidSudoku(list3));
        System.out.println("=======================");
        List<String> list4 = new ArrayList<>(Arrays.asList("53..7....", "6..195...", ".93....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"));
        System.out.println(list4);
        System.out.println(i.isValidSudoku(list4));
        System.out.println("=======================");
        List<String> list5 = new ArrayList<>(Arrays.asList("53..7....", "6..195...", "298....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"));
        System.out.println(list5);
        System.out.println(i.isValidSudoku(list5));
    }
}
