import java.util.*;
import java.util.LinkedList;

public class ScalerAd_Graph1_PathInDirectedGraph {
    public static void main(String[] args) {
        ScalerAd_Graph1_PathInDirectedGraph s = new ScalerAd_Graph1_PathInDirectedGraph();

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1,2)));
        B.add(new ArrayList<>(Arrays.asList(4,1)));
        B.add(new ArrayList<>(Arrays.asList(2,4)));
        B.add(new ArrayList<>(Arrays.asList(3,4)));
        B.add(new ArrayList<>(Arrays.asList(5,2)));
        B.add(new ArrayList<>(Arrays.asList(1,3)));
        System.out.println(s.solve(5, B));

//        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
//        B.add(new ArrayList<>(Arrays.asList(1,2)));
//        B.add(new ArrayList<>(Arrays.asList(2,3)));
//        B.add(new ArrayList<>(Arrays.asList(3,4)));
//        B.add(new ArrayList<>(Arrays.asList(4,5)));
//        System.out.println(s.solve(5, B));
    }
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
        //initially add empty arraylist into the adjancency list
        for(int i=0; i<=A; i++){
            adjlist.add(i, new ArrayList<>());
        }
        //now add values into the adjancency list
        for(int i=0; i<B.size(); i++){
            int b1 = B.get(i).get(0);
            int b2 = B.get(i).get(1);
            adjlist.get(b1).add(b2);
        }
        //System.out.println("adj list:"+adjlist);
        //create a visited array also of size A+1, which initially have the false value
        boolean[] visited = new boolean[A+1];
        for(int i=0; i<=A; i++){
            visited[i] = false;
        }
        dfs(1, adjlist, visited);
        return visited[A] ? 1 : 0;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adjlist, boolean[] visited){
        //int node = q.peekFirst();
        visited[node] = true;
        for(int i=0; i<adjlist.get(node).size(); i++){
            if(!visited[adjlist.get(node).get(i)]){
                dfs(adjlist.get(node).get(i), adjlist, visited);
            }
        }
    }
}
