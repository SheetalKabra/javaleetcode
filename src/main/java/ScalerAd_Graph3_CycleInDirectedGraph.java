import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class ScalerAd_Graph3_CycleInDirectedGraph {
    public static void main(String[] args) {
        ScalerAd_Graph3_CycleInDirectedGraph s = new ScalerAd_Graph3_CycleInDirectedGraph();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1,2)));
        System.out.println(s.solve(2, B));
    }

    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        //here we will apply topological sort, if we get the topo array size = no of nodes,
        //that means no cycle exists in the graph, else there is a cycle.
        //lets begin with topological sort:
//create an adjacency list:
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++){
            adjList.add(new ArrayList<>());
        }
//now add an values into adjList
        for(int i=0; i<B.size(); i++){
            int u = B.get(i).get(0);
            int v = B.get(i).get(1);
            adjList.get(u).add(v);
        }
//create an indegree array, and we don;t need to fill with 0 values, as they already initialized with 0
        int[] indegree = new int[A+1];
//update the values into indegree array
        for(int i=0; i<=A; i++){
            for(int j=0; j<adjList.get(i).size(); j++){
                indegree[adjList.get(i).get(j)] = indegree[adjList.get(i).get(j)] + 1;
            }
        }
//now create a priority queue here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//initially, add those nodes which is having indegree 0
        for(int i=1; i<=A; i++){
            if(indegree[i] == 0){
                pq.add(i);
            }
        }
        System.out.println("ind"+Arrays.toString(indegree));
        int cnt = 0;
        while(!pq.isEmpty()){
            cnt++;
            int node = pq.poll();
            for(int i=0; i<adjList.get(node).size(); i++){
                indegree[adjList.get(node).get(i)] = indegree[adjList.get(node).get(i)] - 1;
                if(indegree[adjList.get(node).get(i)] == 0){
                    pq.add(adjList.get(node).get(i));
                }
            }
        }
        System.out.println("cnt:"+cnt);
        return cnt == A ? 0 : 1;
    }
}
