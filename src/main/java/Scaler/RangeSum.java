package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class RangeSum {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int N = A.size();
        ArrayList<Long> pf = new ArrayList<Long>(N);
        ArrayList<Long> op = new ArrayList<Long>(B.size());
        pf.add(Long.valueOf(A.get(0)));
        for(int i=1; i<N; i++){
            pf.add(pf.get(i-1)+A.get(i));
        }
        int left, right;
        long sum = 0;
        for(int i=0; i<B.size(); i++){
            left = B.get(i).get(0)-1;
            right = B.get(i).get(1)-1;
//            System.out.println("left:"+left);
//            System.out.println("right:"+right);
            if(left == 0) {
                sum = pf.get(right);
            } else {
                sum = pf.get(right) - pf.get(left-1);
            }
            //System.out.println("sum:"+sum);
            op.add(sum);
        }
        return op;
    }

    public static void main(String[] args) {
        RangeSum rs = new RangeSum();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1,4)));
        B.add(new ArrayList<>(Arrays.asList(2,3)));
        ArrayList<Long> op = rs.rangeSum(A, B);
        for(int i=0;i<op.size();i++){
            System.out.print(op.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(2,2,2));
        ArrayList<ArrayList<Integer>> B1 = new ArrayList<>();
        B1.add(new ArrayList<>(Arrays.asList(1,1)));
        B1.add(new ArrayList<>(Arrays.asList(2,3)));
        ArrayList<Long> op1 = rs.rangeSum(A1, B1);
        for(int i=0;i<op1.size();i++){
            System.out.print(op1.get(i)+" ");
        }
    }
}
