package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    public int distance;
    public int nodeVal;

    public Pair(int distance, int nodeVal){
        this.distance = distance;
        this.nodeVal = nodeVal;
    }
}

public class ScalerAd_Graph3_Dijkstra {
    public static void main(String[] args) {
        ScalerAd_Graph3_Dijkstra s = new ScalerAd_Graph3_Dijkstra();

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
//        B.add(new ArrayList<>(Arrays.asList(0, 4, 9)));
//        B.add(new ArrayList<>(Arrays.asList(3, 4, 6)));
//        B.add(new ArrayList<>(Arrays.asList(1, 2, 1)));
//        B.add(new ArrayList<>(Arrays.asList(2, 5, 1)));
//        B.add(new ArrayList<>(Arrays.asList(2, 4, 5)));
//        B.add(new ArrayList<>(Arrays.asList(0, 3, 7)));
//        B.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
//        B.add(new ArrayList<>(Arrays.asList(4, 5, 7)));
//        B.add(new ArrayList<>(Arrays.asList(0, 5, 1)));
//        System.out.println(s.solve(6, B, 4));


        B.add(new ArrayList<>(Arrays.asList(0, 3, 4)));
        B.add(new ArrayList<>(Arrays.asList(2, 3, 3)));
        B.add(new ArrayList<>(Arrays.asList(0, 1, 9)));
        B.add(new ArrayList<>(Arrays.asList(3, 4, 10)));
        B.add(new ArrayList<>(Arrays.asList(1, 3, 8)));
        System.out.println(s.solve(5, B, 4));
    }
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B, int C) {
//create an adjacency list:
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
        for(int i=0; i<A; i++){
            adjList.add(new ArrayList<Pair>());
        }
//now insert the values into adjacency list
        for(int i=0; i<B.size(); i++){
            int u = B.get(i).get(0);
            int v = B.get(i).get(1);
            int dist = B.get(i).get(2);
            adjList.get(u).add(new Pair(dist, v));
            adjList.get(v).add(new Pair(dist, u));
        }

//create a Scaler.one distance array, which is having src to src value is 0, and for rest initially we have infinite
        Integer[] distance = new Integer[A];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[C] = 0;

//now create a priority Scaler.queue here, which will store in the form of pairs
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x.distance));
//initially add (0, src) which is (0,C)
        pq.add(new Pair(0, C));
//How and when values will add into pq: every time you get a better distance from previous Scaler.one, then just go and insert into the pq


//now check untill pq is not empty
        while(!pq.isEmpty()){
            Pair nodepair = pq.poll();
            int dis = nodepair.distance;
            int node = nodepair.nodeVal;
            //go and traverse the adjacency list of nodeVal
            for(int i=0; i<adjList.get(node).size(); i++){
                int adjnode = adjList.get(node).get(i).nodeVal;
                int edgedist =adjList.get(node).get(i).distance;
                if(edgedist + dis < distance[adjnode]){
                    distance[adjnode] = edgedist + dis;
                    pq.add(new Pair(distance[adjnode], adjnode));
                }
            }
        }

        //in the final, check if distance array has infinte value then replace it with -1
        for(int i=0; i<A ;i++){
            if(distance[i] == Integer.MAX_VALUE){
                distance[i] = -1;
            }
        }
        return new ArrayList<>(Arrays.asList(distance));
    }
}
