package Scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_Graph1_FirstDFS {
    public static void main(String[] args) {
        ScalerAd_Graph1_FirstDFS s = new ScalerAd_Graph1_FirstDFS();

//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,1,2)),1, 2));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,1,2)),2, 1));
    }
    public int solve(ArrayList<Integer> A, final int B, final int C) {
        //this ques is like, tell if there is a path from Node C to Node B
        //B is reachable from C, means start from C and check whether B node is visited or not
        //initially create a adjancency list:
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
        //now add empty arraylist into the adjancency list
        for(int i=0; i<=A.size(); i++){
            adjlist.add(new ArrayList<>());
        }
        //now add values into the adjancency list
        //here edges are like : A[i] -> i+1
        for(int i=0; i<A.size(); i++){
            adjlist.get(A.get(i)).add(i+1);
        }
        //create a visited boolean array, and initially it contains false
        boolean[] visited = new boolean[A.size()+1];
        for(int i=0; i<=A.size(); i++){
            visited[i] = false;
        }
        dfs(C, adjlist, visited);
        return visited[B] ? 1 : 0;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjlist, boolean[] visited){
        visited[node] = true;
        for(int i=0; i<adjlist.get(node).size(); i++){
            if(!visited[adjlist.get(node).get(i)]){
                dfs(adjlist.get(node).get(i), adjlist, visited);
            }
        }
    }
}
