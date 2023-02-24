package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximmumPositivity {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList maxPositivity = new ArrayList<>();
        int start = 0, end = -1, max = 0, length = 0, startMax = 0, endMax = 0;
        for(int i=0; i<N; i++){
            if(A.get(i) >= 0){
                end = i;
            }
            if(end >-1){
                length = end-start+1;
            }
            if(length > max){
                max = length;
                startMax = start;
                endMax = end;
            }
            if(A.get(i) < 0){
                start = i+1;
            }
        }
        for(int i=startMax; i<=endMax; i++){
            maxPositivity.add(A.get(i));
        }
        return maxPositivity;
    }
    public ArrayList<Integer> solve1(ArrayList<Integer> A) {
        System.out.println(A);
        int N = A.size();
        int start = 0, end = -1, max = 0, length = 0, startmax = 0, endmax = 0;
        ArrayList<Integer> maxPositivity = new ArrayList<>();
        for(int i=0; i<N; i++){
            System.out.println("i:"+i);
            if(A.get(i) >= 0){
                end = i;
            }
            if(start>-1 && end >-1){
                length = end-start+1;
            }

            System.out.println("end:"+end);
            System.out.println("start:"+start);
            System.out.println("lenght:" +length);
            if(length > max){
                max = length;
                startmax = start;
                endmax = end;
                System.out.println("startmax:"+startmax);
                System.out.println("endmax:"+endmax);
            }

            if(A.get(i) < 0){
                start = i+1;
            }

        }

        for(int i=startmax; i<=endmax; i++){
            maxPositivity.add(A.get(i));
        }
        return maxPositivity;
    }

    public static void main(String[] args) {
        MaximmumPositivity m = new MaximmumPositivity();
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(-54, -32, 821, -14, -26, -39, -55, -83, 3939, -41))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,2,34,5,6,7,8,9))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,2,3,-5,3,-3,2,2,-2,-1,-2))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,2,3,-4,-5,1,2,3,4,5,-12))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,2,2,1,3,-1,-1,1,-1,1,3,4,2))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,2,-1,1,3))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,2,-1,1,3,2,1,-1))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(1,2,-1,1,3,2,1))));
        System.out.println(m.solve(new ArrayList<>(Arrays.asList(-1,2,1,1,3,2,1))));
    }
}
