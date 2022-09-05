import java.util.ArrayList;

public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> pascalArr = new ArrayList<>();
        if(A==0){
            return pascalArr;
        }

        for(int i=0; i<A; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            pascalArr.add(arr);
        }
        pascalArr.get(0).add(0,1);
        for(int i=1; i<A; i++){
            pascalArr.get(0).add(i,0);
        }
        for(int i=1; i<A;i++){
            for(int j=0; j<=i; j++){
                if(j==0){
                    pascalArr.get(i).add(j,1);
                }else{
                    int val = pascalArr.get(i-1).get(j-1) + pascalArr.get(i-1).get(j);
                    pascalArr.get(i).add(j, val);
                }
            }
            for(int k=i+1; k<A; k++){
                pascalArr.get(i).add(0);
            }
        }
        return pascalArr;
    }

    public ArrayList<ArrayList<Integer>> solve11(int A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(A);
        for(int i=0;i<A;i++){
            arr.add(new ArrayList<>(A));
        }
        arr.get(0).add(0, 1);
        for(int i=1; i<A; i++){
            arr.get(0).add(i, 0);
        }

        arr.get(1).add(0, 1);
        arr.get(1).add(1, 1);
        for(int i=2; i<A; i++){
            arr.get(1).add(i, 0);
        }

        for(int i=0; i<A; i++){
            for(int j=0; j<A; j++){
                if(j == 0 || j == i){
                    arr.get(i).add(j, 1);
                }else if(j>i){
                    arr.get(i).add(j, 0);
                }else{
                    arr.get(i).add(j, (arr.get(i-1).get(j-1) + arr.get(i-1).get(j)));
                }
            }
        }


        //print arraylist
        for(int i=0; i< arr.size(); i++){
            for(int j=0; j< arr.size(); j++){
                System.out.print(arr.get(i).get(j));
                if(j != arr.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        return arr;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        System.out.println(pt.solve(0));
    }
}
