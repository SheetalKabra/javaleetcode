import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ScalerAd_Stacks2_MaxRectangle {
    public static void main(String[] args) {
        ScalerAd_Stacks2_MaxRectangle s = new ScalerAd_Stacks2_MaxRectangle();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        rows.add(new ArrayList<>(Arrays.asList(1,0,1,0,0)));
        rows.add(new ArrayList<>(Arrays.asList(1,0,1,1,1)));
        rows.add(new ArrayList<>(Arrays.asList(1,1,1,1,1)));
        rows.add(new ArrayList<>(Arrays.asList(1,0,0,1,0)));
        System.out.println(s.solve(rows));


//        rows.add(new ArrayList<>(Arrays.asList(0,0,1)));
//        rows.add(new ArrayList<>(Arrays.asList(0,1,1)));
//        rows.add(new ArrayList<>(Arrays.asList(1,1,1)));
//        System.out.println(s.solve(rows));

//        rows.add(new ArrayList<>(Arrays.asList(0,1,0,1)));
//        rows.add(new ArrayList<>(Arrays.asList(1,0,1,0)));
//        System.out.println(s.solve(rows));
    }
    public int solve(ArrayList<ArrayList<Integer>> A) {
        //prepare an 2-D array for largest rectangle in histogram
        //1. check col wise 1's
        int rows = A.size();
        int cols = A.get(0).size();
        ArrayList<ArrayList<Integer>> histRows = new ArrayList<>();
        for(int i=0; i<rows; i++){
            ArrayList<Integer> histcols = new ArrayList<>();
            for(int j=0; j<cols; j++){
                if(i==0){
                    histcols.add(j, A.get(i).get(j));
                }else{
                    histcols.add(j, 0);
                }
            }
            histRows.add(histcols);
        }
        for(int j=0; j<cols;j++){
            for(int i=1; i<rows; i++){
                if(A.get(i).get(j) == 1){
                    int count = histRows.get(i-1).get(j);
                    histRows.get(i).set(j, count+1);
                }else{
                    histRows.get(i).set(j, 0);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<rows; i++){
            ans = Math.max(ans, largestRectArea(histRows.get(i)));
        }
        return ans;
    }

    public int largestRectArea(ArrayList<Integer> A){
        int N = A.size();
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        for(int i=0; i<N; i++){
            r.add(i, 0);
        }
        Stack<Integer> stl = new Stack<>();
        Stack<Integer> str = new Stack<>();
        //for l
        for(int i=0; i<N; i++){
            while(!stl.isEmpty() && A.get(stl.peek()) >= A.get(i)){
                stl.pop();
            }
            if(stl.isEmpty()){
                l.add(i, -1);
            }else{
                l.add(i, stl.peek());
            }
            stl.push(i);
        }
        //for r
        for(int i=N-1; i>=0; i--){
            while(!str.isEmpty() && A.get(str.peek()) >= A.get(i)){
                str.pop();
            }
            if(str.isEmpty()){
                r.set(i, N);
            }else{
                r.set(i, str.peek());
            }
            str.add(i);
        }
        long ans = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            ans = Math.max(ans, (r.get(i) - l.get(i) - 1) * (long)A.get(i));
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> b1 = new ArrayList<>();
        if(a1.get(0).equals(b1.get(0))){

        }
        return (int)ans;




    }
}
