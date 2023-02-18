import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ScalerAd_Graph2_CheckBipartiteGraph {
    public static void main(String[] args) {
        ScalerAd_Graph2_CheckBipartiteGraph s = new ScalerAd_Graph2_CheckBipartiteGraph();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//        A.add(new ArrayList<>(Arrays.asList(0,1)));
//        A.add(new ArrayList<>(Arrays.asList(0,2)));
//        A.add(new ArrayList<>(Arrays.asList(1,2)));
//        System.out.println(s.solve(2, A));

//        A.add(new ArrayList<>(Arrays.asList(0,1)));
//        System.out.println(s.solve(2, A));



//          A.add(new ArrayList<>(Arrays.asList(2, 5)));
//          A.add(new ArrayList<>(Arrays.asList(6, 7)));
//          A.add(new ArrayList<>(Arrays.asList(4, 8)));
//          A.add(new ArrayList<>(Arrays.asList(2, 3)));
//          A.add(new ArrayList<>(Arrays.asList(0, 3)));
//          A.add(new ArrayList<>(Arrays.asList(4, 7)));
//          A.add(new ArrayList<>(Arrays.asList(1, 8)));
//          A.add(new ArrayList<>(Arrays.asList(3, 8)));
//          A.add(new ArrayList<>(Arrays.asList(1, 3)));
//        System.out.println(s.solve(9, A));


          A.add(new ArrayList<>(Arrays.asList(7, 8)));
          A.add(new ArrayList<>(Arrays.asList(1, 2)));
          A.add(new ArrayList<>(Arrays.asList(0, 9)));
          A.add(new ArrayList<>(Arrays.asList(1, 3)));
          A.add(new ArrayList<>(Arrays.asList(6, 7)));
          A.add(new ArrayList<>(Arrays.asList(0, 3)));
          A.add(new ArrayList<>(Arrays.asList(2, 5)));
          A.add(new ArrayList<>(Arrays.asList(3, 8)));
          A.add(new ArrayList<>(Arrays.asList(4, 8)));
                System.out.println(s.solve(10, A));
    }

    public int solve(int A, ArrayList<ArrayList<Integer>> B){
        int N = B.size();
        //we will create an adjancency list for graph
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<A; i++){
            adjList.add(i, new ArrayList<>());
        }
        for(int i=0; i<N; i++){
            int u = B.get(i).get(0);
            int v = B.get(i).get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        //create a color array, in which initially we have -1 which denotes no color yet
        //we will color the graph either by 0 or 1.
        int[] color = new int[A];
        Arrays.fill(color, -1);
        //now add 0th element into queue, and mark it as a 0 color
        for(int i=0; i<A; i++){
            if(color[i] == -1){
                if(!isBipartite(i, adjList, color)){
                    return 0;
                }
            }
        }
        return 1;
    }
    public boolean isBipartite(int start, ArrayList<ArrayList<Integer>> adjList, int[] color) {
        //now add start element into queue, and mark it as a 0 color
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;


        while(!q.isEmpty()){
            //now run the for loop against the adj list of node q.poll()
            int node = q.poll();
            for(int i=0; i<adjList.get(node).size(); i++){
                //now check if adjList.get(node).get(i) is already colored or not
                //if its already colored then check, it has colored with right color or not
                //else make it colored : opposite to the last index color
                int index = adjList.get(node).get(i);
                if(color[index] == -1){
                    color[index] = 1 - color[node];
                    q.add(index);
                }else{
                    if(color[index] == color[node]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
