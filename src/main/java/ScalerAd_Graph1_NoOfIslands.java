import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_Graph1_NoOfIslands {
    public static void main(String[] args) {
        ScalerAd_Graph1_NoOfIslands s = new ScalerAd_Graph1_NoOfIslands();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(0,1,0)));
        A.add(new ArrayList<>(Arrays.asList(0,0,1)));
        A.add(new ArrayList<>(Arrays.asList(1,0,0)));

//        A.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0, 0)));
//        A.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0)));
//        A.add(new ArrayList<>(Arrays.asList(1, 0, 0, 1, 1)));
//        A.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0)));
//        A.add(new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1)));
        System.out.println(s.solve(A));
    }
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Boolean>> adjlist = new ArrayList<>();
        //initialize all the values to false of adj list
        for(int i=0; i<N; i++){
            ArrayList<Boolean>  adjlistrows= new ArrayList<>();
            for(int j=0; j<M; j++){
                adjlistrows.add(false);
            }
            adjlist.add(adjlistrows);
        }
        int count = 0;
//        System.out.println(adjlist);
        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                if(!adjlist.get(i).get(j)){
                    if(A.get(i).get(j) == 0){
                        adjlist.get(i).set(j, true);
                    }else{
                        //if value of A[i][j] == 1, then set all the values[(i-1,j),(i, j-1), etc] to true
                        dfs(i, j, N, M, adjlist, A);
                        count++;
//                        System.out.println("count: "+count+ ", " +adjlist);
                    }
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, int N, int M, ArrayList<ArrayList<Boolean>> adjlist, ArrayList<ArrayList<Integer>> A){
        adjlist.get(i).set(j, true);

        if(i-1 >= 0 && j-1 >= 0){
            if(A.get(i-1).get(j-1) == 1 && !adjlist.get(i-1).get(j-1)){
                dfs(i-1, j-1, N, M, adjlist, A);
            }else{
                adjlist.get(i-1).set(j-1, true);
            }

        }
        if(i-1 >= 0){
            if(A.get(i-1).get(j) == 1 && !adjlist.get(i-1).get(j)){
                dfs(i-1, j, N, M, adjlist, A);
            }else{
                adjlist.get(i-1).set(j, true);
            }
        }
        if(j-1 >= 0){
            if(A.get(i).get(j-1) == 1 && !adjlist.get(i).get(j-1)){
                dfs(i, j-1, N, M, adjlist, A);
            }else{
                adjlist.get(i).set(j-1, true);
            }
        }

        if(i-1 >= 0 && j+1 < M){
            if(A.get(i-1).get(j+1) == 1 && !adjlist.get(i-1).get(j+1)){
                dfs(i-1, j+1, N, M, adjlist, A);
            }else{
                adjlist.get(i-1).set(j+1, true);
            }
        }
        if(i+1<N){
            if(A.get(i+1).get(j) == 1 && !adjlist.get(i+1).get(j)){
                dfs(i+1, j, N, M, adjlist, A);
            }else{
                adjlist.get(i+1).set(j, true);
            }
        }
        if(j+1<M){
            if(A.get(i).get(j+1) == 1 && !adjlist.get(i).get(j+1)){
                dfs(i, j+1, N, M, adjlist, A);
            }else{
                adjlist.get(i).set(j+1, true);
            }

        }
        if(i+1 < N && j-1 >= 0){
            if(A.get(i+1).get(j-1) == 1 && !adjlist.get(i+1).get(j-1)){
                dfs(i+1, j-1, N, M, adjlist, A);
            }else{
                adjlist.get(i+1).set(j-1, true);
            }
        }
        if(i+1 < N && j+1 < M){
            if(A.get(i+1).get(j+1) == 1 && !adjlist.get(i+1).get(j+1)){
                dfs(i+1, j+1, N, M, adjlist, A);
            }else{
                adjlist.get(i+1).set(j+1, true);
            }

        }
    }
}
