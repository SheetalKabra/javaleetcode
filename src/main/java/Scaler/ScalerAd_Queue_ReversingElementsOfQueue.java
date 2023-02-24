package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ScalerAd_Queue_ReversingElementsOfQueue {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,2,3,4,5)), 3));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(5, 17, 100, 11)), 2));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=B-1; i>=0; i--){
            queue.add(A.get(i));
        }
        ArrayList<Integer> result = new ArrayList<>();
        int k=0;
        while(k!=B){
            result.add(queue.poll());
            k++;
        }
        int N = A.size();
        int remainingElement = N - B;
        while(remainingElement > 0){
            //N-remainingElement;
            result.add(A.get(N-remainingElement));
            remainingElement--;
        }
        return result;
    }
}
