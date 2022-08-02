import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        //get the A in desc order
        Comparator c = Collections.reverseOrder();
        Collections.sort(A, c);
        //now create a count array having count of elements greater than A[i].
        ArrayList<Integer> countArr = new ArrayList<>();
        //Assuming that the first element is the greatest element(As A is in desc order), so no element greater than A[0], so A[0]=0
        countArr.add(0, 0);
        //now apply for loop
        //and add the count values greater than number
        //so i can say, first occurance of number (countno of elements greater than that = index in sorted order)
        for(int i=1; i<A.size(); i++){
            if(A.get(i) == A.get(i-1)){
                countArr.add(i, countArr.get(i-1));
            }else{
                countArr.add(i, i);
            }
        }
        System.out.println(A);
        System.out.println(countArr);
        //now check if countArr[i] == A[i], then return 1
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == countArr.get(i)){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        NobleInteger n = new NobleInteger();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(6,7,5));
        System.out.println(n.solve(A));



    }
}
