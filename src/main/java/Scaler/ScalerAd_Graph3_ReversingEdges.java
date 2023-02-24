package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class PairD{
    public int dist;
    public int nodeVaL;

    public PairD(int dist, int nodeVaL){
        this.dist = dist;
        this.nodeVaL = nodeVaL;
    }

}
public class ScalerAd_Graph3_ReversingEdges {
    public static void main(String[] args) {
        ScalerAd_Graph3_ReversingEdges s = new ScalerAd_Graph3_ReversingEdges();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

//        A : 6
//        B :
//[
//  [1, 2]
//  [2, 3]
//  [3, 4]
//  [4, 1]
//  [2, 3]
//  [4, 2]
//  [3, 4]
//  [5, 5]
//  [5, 5]
//]


//        B.add(new ArrayList<>(Arrays.asList(1,2)));
//        B.add(new ArrayList<>(Arrays.asList(2,3)));
//        B.add(new ArrayList<>(Arrays.asList(4,3)));
//        B.add(new ArrayList<>(Arrays.asList(4,5)));
//        System.out.println(s.reverseEdges(5, B));

        B.add(new ArrayList<>(Arrays.asList(1,2)));
        B.add(new ArrayList<>(Arrays.asList(2,3)));
        B.add(new ArrayList<>(Arrays.asList(3,4)));
        B.add(new ArrayList<>(Arrays.asList(4,5)));
        System.out.println(s.reverseEdges(5, B));
    }
    public int reverseEdges(int A, ArrayList<ArrayList<Integer>> B) {
        //What we will do here is:
        //if we move towards original edge, no cost is incurred,
        //but if we move towards reverse edge, 1 cost is added.
        //So, if we apply Dijkstra on this modified graph, it will give us the shortest path to reach the destination
//create an adjacency list
        ArrayList<ArrayList<PairD>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++){
            adjList.add(new ArrayList<PairD>());
        }
//now insert values into adjacency list
        for(int i=0; i<B.size(); i++){
            int u = B.get(i).get(0);
            int v = B.get(i).get(1);
            //add 0, if we have original edge
            adjList.get(u).add(new PairD(0, v));
            //add 1 as a dist, for reversing the edge
            adjList.get(v).add(new PairD(1, u));
        }
        int ans = minFlips(1,A, adjList, A);
        return ans;
    }

    public int minFlips(int src,int dest, ArrayList<ArrayList<PairD>> adjList, int N){
//create a distance array, with initialize value = infinite
        int[] distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
//distance from src to src should be 0, so update it with 0 in distance array
        distance[src] = 0;
//create a priority Scaler.queue, and insert a default value i.e, src
        PriorityQueue<PairD> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.dist));
        pq.add(new PairD(0, src));
        while (!pq.isEmpty()) {
            PairD node = pq.poll();
            int dist = node.dist;
            int nodeval = node.nodeVaL;
            //now traverse the adjacency list of node
            for(int i=0; i<adjList.get(nodeval).size(); i++){
                int adjlistdist = adjList.get(nodeval).get(i).dist;
                int adjlistnode = adjList.get(nodeval).get(i).nodeVaL;
                if(adjlistdist + dist < distance[adjlistnode]){
                    distance[adjlistnode] = adjlistdist + dist;
                    pq.add(new PairD(distance[adjlistnode], adjlistnode));
                }
            }
        }
        return distance[dest];
    }
}
