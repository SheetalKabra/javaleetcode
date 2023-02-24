package Scaler;

import java.util.*;

public class ScalerAd_Graph3_TopologicalSort {


    public static void main(String[] args){
        ScalerAd_Graph3_TopologicalSort s = new ScalerAd_Graph3_TopologicalSort();

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
//        B.add(new ArrayList(Arrays.asList(6,3)));
//        B.add(new ArrayList(Arrays.asList(6,1)));
//        B.add(new ArrayList(Arrays.asList(5,1)));
//        B.add(new ArrayList(Arrays.asList(5,2)));
//        B.add(new ArrayList(Arrays.asList(3,4)));
//        B.add(new ArrayList(Arrays.asList(4,2)));
//        System.out.println(s.solve(6, B));


//        B.add(new ArrayList(Arrays.asList(1, 2)));
//        B.add(new ArrayList(Arrays.asList(2, 3)));
//        B.add(new ArrayList(Arrays.asList(3, 1)));
//        System.out.println(s.solve(3, B));

        B.add(new ArrayList(Arrays.asList(1,4)));
        B.add(new ArrayList(Arrays.asList(1,2)));
        B.add(new ArrayList(Arrays.asList(4,2)));
        B.add(new ArrayList(Arrays.asList(4,3)));
        B.add(new ArrayList(Arrays.asList(3,2)));
        B.add(new ArrayList(Arrays.asList(5,2)));
        B.add(new ArrayList(Arrays.asList(3,5)));
        B.add(new ArrayList(Arrays.asList(8,2)));
        B.add(new ArrayList(Arrays.asList(8,6)));
        System.out.println(s.solve(8, B));
    }



    public ArrayList<Integer> solve(int A,  ArrayList<ArrayList<Integer>> B){
//create an adjacent list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++){
            adjList.add(i, new ArrayList<Integer>());
        }
//insert values into adjacency list
        for(int i=0; i<B.size(); i++){
            int u = B.get(i).get(0);
            int v = B.get(i).get(1);
            adjList.get(u).add(v);
        }
//create an inorder(means no of incoming nodes) array
        int[] indegree = new int[A+1];
        Arrays.fill(indegree, 0);

//update the values of inorder array
        for(int i=0; i<=A; i++){
            for(int j=0; j<adjList.get(i).size(); j++){
                indegree[adjList.get(i).get(j)] = indegree[adjList.get(i).get(j)] + 1;
            }
        }

//now create a Priority Scaler.queue here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//initially, insert the values which is having indegree = 0;
        for(int i=1; i<=A; i++){
            if(indegree[i] == 0){
                pq.add(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();
        while(!pq.isEmpty()){
            int node = pq.poll();
            topo.add(node);
//next i need to do is, decrease the indegree as well
            for(int i=0; i<adjList.get(node).size(); i++){
                indegree[adjList.get(node).get(i)] = indegree[adjList.get(node).get(i)] -1;
                if(indegree[adjList.get(node).get(i)] == 0){
                    pq.add(adjList.get(node).get(i));
                }
            }
        }
        return topo.size() == A ? topo : new ArrayList<>();

    }

}
