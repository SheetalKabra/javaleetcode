package Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class queue{
    public int i;
    public int j;
    public int time;

    public queue(int i, int j, int time){
        this.i = i;
        this.j = j;
        this.time = time;
    }
}

public class ScalerAd_Graph2_RottenOranges {
    public static void main(String[] args) {
        ScalerAd_Graph2_RottenOranges s = new ScalerAd_Graph2_RottenOranges();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(0,2,1)));
        A.add(new ArrayList<>(Arrays.asList(2,2,1)));
        A.add(new ArrayList<>(Arrays.asList(0,1,0)));
        A.add(new ArrayList<>(Arrays.asList(2,1,1)));
        A.add(new ArrayList<>(Arrays.asList(0,1,1)));
        A.add(new ArrayList<>(Arrays.asList(1,2,1)));
        System.out.println(s.solve(A));
    }
    public int solve(ArrayList<ArrayList<Integer>> A) {
        //ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int N = A.size();
        int M = A.get(0).size();
        Queue<queue> q = new LinkedList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(A.get(i).get(j) == 2){
                    q.add(new queue(i, j, 0));
                }
            }
        }
        int maxtime = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            queue node = q.poll();

            int nodei = node.i;
            int nodej = node.j;
            int nodetime = node.time;
            System.out.println("q data:"+nodei+", "+nodej+", "+nodetime);
            //A.get(nodei).set(nodej, 2);
            maxtime = Math.max(maxtime, nodetime);
            int[] ipossibleValues = {1,-1,0,0};
            int[] jpossibleValues = {0,0,1,-1};
            for(int p=0; p<ipossibleValues.length; p++){
                int u = nodei + ipossibleValues[p];
                int v = nodej + jpossibleValues[p];
                if(u >= 0 && v >= 0 && u < N && v < M){
                    if(A.get(u).get(v) == 1){
                        q.add(new queue(u, v, nodetime+1));
                        A.get(u).set(v, 2);
                        System.out.println("add into q:"+ u+", "+v+", "+(nodetime+1));
                    }
                }
            }

        }
        //now check if all the oranges are rotten or not, if not then return -1, else return the time;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(A.get(i).get(j) == 1){
                    return -1;
                }
            }
        }
        //System.out.println("A:"+A);

        return maxtime;

    }
}
