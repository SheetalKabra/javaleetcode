package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ScalerAd_Queue2_SortStackUsing2Stack {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(5,17,100,11))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(5,4,3,2,1))));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<N; i++){
            result.add(i, 0);
        }
        for(int i=0; i<N; i++){
            while(!st1.isEmpty() && st1.peek()>A.get(i)){
                st2.push(st1.peek());
                st1.pop();
            }
            st1.push(A.get(i));
            while(!st2.isEmpty()){
                st1.push(st2.peek());
                st2.pop();
            }
            if(st1.isEmpty()){
                st1.push(A.get(i));
            }
        }
        for(int i=N-1; i>=0; i--){
            result.set(i, st1.peek());
            st1.pop();
        }
        return result;
    }
}
