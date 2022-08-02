import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeMatrix {
    public static void main(String[] args) {
        BeforeMatrix b = new BeforeMatrix();
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        x.add(0, new ArrayList<>(Arrays.asList(1,3,6)));
        x.add(1, new ArrayList<>(Arrays.asList(3,7,11)));
        System.out.println(b.computeBeforeMatrix(2,3, x));

        ArrayList<ArrayList<Integer>> x1 = new ArrayList<>();
        x1.add(0, new ArrayList<>(Arrays.asList(2,5)));
        x1.add(1, new ArrayList<>(Arrays.asList(7,17)));
        System.out.println(b.computeBeforeMatrix(2,2, x1));

        ArrayList<ArrayList<Integer>> x2 = new ArrayList<>();
        x2.add(0, new ArrayList<>(Arrays.asList(1,7,8,9)));
        x2.add(1, new ArrayList<>(Arrays.asList(3,16,21,25)));
        x2.add(2, new ArrayList<>(Arrays.asList(6,27,40,46)));
        x2.add(3, new ArrayList<>(Arrays.asList(10,35,50,60)));
        System.out.println(b.computeBeforeMatrix(4,4, x2));
    }

    public ArrayList<ArrayList<Integer>> computeBeforeMatrix(int N, int M, ArrayList<ArrayList<Integer>> after) {
        //create a before arraylist
        ArrayList<ArrayList<Integer>> before = new ArrayList<>(N);
        for(int i=0; i<N; i++){
            before.add(new ArrayList<Integer>(M));
        }
        //Now, the first element of after will be equals to first elem of before
        // ie., before[0][0] = after[0][0]
        before.get(0).add(0, after.get(0).get(0));
        //before[i][j] = after[i][j] - left side col of after - (sum of all the above rows before )
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i==0 && j==0){
                    continue;
                }
                int value = 0;
                if(j != 0){
                    //left side col of after
                    value = after.get(i).get(j-1);
                }
                int k = i;
                while(k>0){
                    //(sum of all the above rows before )
                    k--;
                    value = value + before.get(k).get(j);
                }
                int finalValue = after.get(i).get(j) - value;
                before.get(i).add(j, finalValue);

            }
        }
        return before;
    }
}
