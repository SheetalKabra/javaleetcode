package Scaler;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayUsingAnotherArray {
    public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> revA = new ArrayList<Integer>();
        int N = A.size();
        for(int i=0; i<N; i++){
            revA.add(i, A.get(N-1-i));
        }
        return revA;
    }

    public static void main(String[] args) {
        ReverseArrayUsingAnotherArray rev = new ReverseArrayUsingAnotherArray();
        ArrayList<Integer> num = new ArrayList<Integer>();
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(4);
//        num.add(1);
//        num.add(2);

//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(2);
//        num.add(1);

        num.add(1);
        num.add(1);
        num.add(10);
        ArrayList<Integer> revArray = rev.solve(num);
        for(int i=0; i<revArray.size(); i++){
            System.out.print(revArray.get(i)+" ");
        }
    }
}
