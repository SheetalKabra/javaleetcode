import java.util.ArrayList;
import java.util.Arrays;

public class InterestingArray {
    public String solve(ArrayList<Integer> A) {
        int N = A.size();
        int countOddNumber = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) % 2 != 0){
                countOddNumber++;
            }
        }
        if(countOddNumber %2 == 0){
            return "Yes";
        }else{
            return "No";
        }
    }

    public static void main(String[] args) {
        InterestingArray i = new InterestingArray();
        System.out.println(i.solve(new ArrayList<>(Arrays.asList(9, 17))));
        System.out.println(i.solve(new ArrayList<>(Arrays.asList(1))));
        System.out.println(i.solve(new ArrayList<>(Arrays.asList(2,6,5,2,6))));
        System.out.println(i.solve(new ArrayList<>(Arrays.asList(2,6,4,2,6))));
        System.out.println(i.solve(new ArrayList<>(Arrays.asList(2,3,4,5,6))));
    }
}
