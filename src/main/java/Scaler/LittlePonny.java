package Scaler;

import java.util.ArrayList;

public class LittlePonny {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        boolean isPossible = false;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) > B){
                count++;
            }
            if(A.get(i) == B){
                isPossible = true;
            }
        }
        //System.out.println(isPossible);
        if(count > 0 && isPossible == true){
            return count;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        LittlePonny lp = new LittlePonny();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        System.out.println(lp.solve(arr, 3));

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(4);
        arr1.add(2);
        System.out.println(lp.solve(arr1, 3));

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(3);
        arr2.add(3);
        arr2.add(3);
        System.out.println(lp.solve(arr1, 3));
    }
}
