package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class Strivers_Graph9_FloodFillAlgo {
    public static void main(String[] args) {
        Strivers_Graph9_FloodFillAlgo s = new Strivers_Graph9_FloodFillAlgo();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1,1,1)));
        A.add(new ArrayList<>(Arrays.asList(2,2,0)));
        A.add(new ArrayList<>(Arrays.asList(2,2,2)));
        System.out.println(s.solve(A, 2, 0, 3));
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int i, int j, int finalCrl){
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(A);

        System.out.println(adjList);

        dfs(i, j, N, M, A, adjList, A.get(i).get(j), finalCrl);
        return adjList;
    }

    public void dfs(int i, int j, int N, int M, ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> adjList, int initialClr, int finalClr){

        adjList.get(i).set(j, finalClr);
        if(j+1<M && adjList.get(i).get(j+1) == initialClr){
            dfs(i, j+1, N, M, A, adjList, initialClr, finalClr);
            //adjList.get(i).set(j+1, finalClr);
        }
        if(i+1<N && adjList.get(i+1).get(j) == initialClr){
            dfs(i+1, j, N, M, A, adjList, initialClr, finalClr);
        }
        if(i-1>=0 && adjList.get(i-1).get(j) == initialClr){
            dfs(i-1, j, N, M, A, adjList, initialClr, finalClr);
        }
        if(j-1>=0 && adjList.get(i).get(j-1) == initialClr){
            dfs(i, j-1, N, M, A, adjList, initialClr, finalClr);
        }
    }
}
