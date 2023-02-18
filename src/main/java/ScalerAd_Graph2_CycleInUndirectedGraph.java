import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_Graph2_CycleInUndirectedGraph {
    public static void main(String[] args) {
        ScalerAd_Graph2_CycleInUndirectedGraph s = new ScalerAd_Graph2_CycleInUndirectedGraph();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
//        B.add(new ArrayList<>(Arrays.asList(1,2)));
//        B.add(new ArrayList<>(Arrays.asList(1,3)));
//        B.add(new ArrayList<>(Arrays.asList(2,3)));
//        B.add(new ArrayList<>(Arrays.asList(1,4)));
//        B.add(new ArrayList<>(Arrays.asList(4,5)));
//        System.out.println(s.solve(5, B));

//        B.add(new ArrayList<>(Arrays.asList(1,2)));
//        B.add(new ArrayList<>(Arrays.asList(1,3)));
//        System.out.println(s.solve(3, B));

//        B.add(new ArrayList<>(Arrays.asList(1,2)));
//        B.add(new ArrayList<>(Arrays.asList(2,3)));
//        B.add(new ArrayList<>(Arrays.asList(3,4)));
//        System.out.println(s.solve(4, B));


        B.add(new ArrayList<>(Arrays.asList(40, 57)));
  B.add(new ArrayList<>(Arrays.asList(12, 56)));
  B.add(new ArrayList<>(Arrays.asList(2, 36)));
  B.add(new ArrayList<>(Arrays.asList(44, 78)));
  B.add(new ArrayList<>(Arrays.asList(23, 28)));
  B.add(new ArrayList<>(Arrays.asList(13, 40)));
  B.add(new ArrayList<>(Arrays.asList(49, 85)));
  B.add(new ArrayList<>(Arrays.asList(1, 43)));
  B.add(new ArrayList<>(Arrays.asList(25, 63)));
  B.add(new ArrayList<>(Arrays.asList(19, 33)));
  B.add(new ArrayList<>(Arrays.asList(5, 57)));
  B.add(new ArrayList<>(Arrays.asList(28, 50)));
  B.add(new ArrayList<>(Arrays.asList(1, 3)));
  B.add(new ArrayList<>(Arrays.asList(32, 59)));
  B.add(new ArrayList<>(Arrays.asList(9, 45)));
  B.add(new ArrayList<>(Arrays.asList(34, 47)));
  B.add(new ArrayList<>(Arrays.asList(25, 82)));
  B.add(new ArrayList<>(Arrays.asList(11, 66)));
  B.add(new ArrayList<>(Arrays.asList(29, 79)));
  B.add(new ArrayList<>(Arrays.asList(9, 36)));
  B.add(new ArrayList<>(Arrays.asList(23, 25)));
  B.add(new ArrayList<>(Arrays.asList(34, 57)));
  B.add(new ArrayList<>(Arrays.asList(20, 84)));
  B.add(new ArrayList<>(Arrays.asList(9, 52)));
  B.add(new ArrayList<>(Arrays.asList(13, 24)));
  B.add(new ArrayList<>(Arrays.asList(8, 67)));
  B.add(new ArrayList<>(Arrays.asList(68, 69)));
  B.add(new ArrayList<>(Arrays.asList(8, 69)));
  B.add(new ArrayList<>(Arrays.asList(49, 70)));
  B.add(new ArrayList<>(Arrays.asList(25, 80)));
  B.add(new ArrayList<>(Arrays.asList(49, 54)));
  B.add(new ArrayList<>(Arrays.asList(22, 85)));
  B.add(new ArrayList<>(Arrays.asList(63, 81)));
  B.add(new ArrayList<>(Arrays.asList(30, 51)));
  B.add(new ArrayList<>(Arrays.asList(28, 39)));
  B.add(new ArrayList<>(Arrays.asList(56, 71)));
  B.add(new ArrayList<>(Arrays.asList(55, 65)));
  B.add(new ArrayList<>(Arrays.asList(33, 77)));
  B.add(new ArrayList<>(Arrays.asList(25, 43)));
  B.add(new ArrayList<>(Arrays.asList(39, 41)));
  B.add(new ArrayList<>(Arrays.asList(2, 42)));
  B.add(new ArrayList<>(Arrays.asList(48, 52)));
  B.add(new ArrayList<>(Arrays.asList(72, 79)));
  B.add(new ArrayList<>(Arrays.asList(43, 79)));
  B.add(new ArrayList<>(Arrays.asList(20, 37)));
  B.add(new ArrayList<>(Arrays.asList(8, 11)));
  B.add(new ArrayList<>(Arrays.asList(8, 38)));
  B.add(new ArrayList<>(Arrays.asList(29, 85)));
  B.add(new ArrayList<>(Arrays.asList(5, 16)));
  B.add(new ArrayList<>(Arrays.asList(19, 79)));
  B.add(new ArrayList<>(Arrays.asList(43, 66)));
  B.add(new ArrayList<>(Arrays.asList(12, 77)));
  B.add(new ArrayList<>(Arrays.asList(19, 29)));
  B.add(new ArrayList<>(Arrays.asList(37, 64)));
  B.add(new ArrayList<>(Arrays.asList(5, 15)));
  B.add(new ArrayList<>(Arrays.asList(12, 75)));
  B.add(new ArrayList<>(Arrays.asList(6, 24)));
  B.add(new ArrayList<>(Arrays.asList(52, 78)));
  B.add(new ArrayList<>(Arrays.asList(15, 25)));
  B.add(new ArrayList<>(Arrays.asList(51, 78)));
        System.out.println(s.solve(85, B));
    }
    public int solve(int A, ArrayList<ArrayList<Integer>> B) {
        //create an adjanceny list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<=A; i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0; i<B.size(); i++){
            int u = B.get(i).get(0);
            int v = B.get(i).get(1);
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        System.out.println("adjList:"+adjList);
        //create a visited array, and fill it with 0 initially
        int[] visited = new int[A+1];
        Arrays.fill(visited, 0);
        for(int i=1; i<=A; i++){
            if(visited[i] == 0){
                if(dfs(i, -1, visited, adjList)){
                    return 1;
                }
            }
        }
        return 0;
    }

    public boolean dfs(int node, int parent, int[] visited, ArrayList<ArrayList<Integer>> adjList){
        System.out.println("node:"+node+", parent:"+parent);
        visited[node] = 1;
        for(int i=0; i<adjList.get(node).size(); i++){
            System.out.println("in for loop:"+adjList.get(node));
            if(visited[adjList.get(node).get(i)] == 0){
                if(dfs(adjList.get(node).get(i), node, visited, adjList)) return true;
            }else if(adjList.get(node).get(i) != parent){
                System.out.println("here:");
                System.out.println("node:"+node+", parent:"+parent);
                return true;
            }
        }
        return false;
    }
}
