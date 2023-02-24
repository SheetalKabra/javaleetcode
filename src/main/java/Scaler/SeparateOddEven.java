package Scaler;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE2
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(T);

        for (int i = 0; i < T; i++) {
            int size = sc.nextInt();
            ArrayList<Integer> arrayElem = new ArrayList<>(size);
            for (int j = 0; j < size; j++) {
                arrayElem.add(sc.nextInt());
            }
            A.add(arrayElem);
        }

        ArrayList<ArrayList<ArrayList<Integer>>> X = new ArrayList<>(T);
        for (int i = 0; i < A.size(); i++) {
            ArrayList<ArrayList<Integer>> Y = new ArrayList<>(2);
            ArrayList<Integer> evenNo = new ArrayList<>(A.get(i).size());
            ArrayList<Integer> oddNo = new ArrayList<>(A.get(i).size());
            for (int j = 0; j < A.get(i).size(); j++) {
                if (A.get(i).get(j) % 2 == 0) {
                    evenNo.add(A.get(i).get(j));
                } else {
                    oddNo.add(A.get(i).get(j));
                }
            }
            Y.add(oddNo);
            Y.add(evenNo);
            X.add(Y);
        }

        for (int i = 0; i < X.size(); i++) {
            for (int j = 0; j < X.get(i).size(); j++) {
                //if(X.get(i).get(j).size() > 0){
                for (int k = 0; k < X.get(i).get(j).size(); k++) {
                    System.out.print(X.get(i).get(j).get(k) + " ");
                }
                System.out.println();
                //}

            }
        }
    }

}
