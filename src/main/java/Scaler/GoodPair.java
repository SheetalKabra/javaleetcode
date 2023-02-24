package Scaler;

import java.util.ArrayList;

public class GoodPair {

    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(i == j){
                    continue;
                }
                if(A.get(i) + A.get(j) == B){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        GoodPair gp = new GoodPair();
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println(gp.solve(num, 7));

        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(4);
        System.out.println(gp.solve(num1, 4));

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(1);
        num2.add(2);
        num2.add(2);
        System.out.println(gp.solve(num2, 4));
    }
}
