import java.sql.SQLOutput;
import java.util.ArrayList;

public class MinimumPicks {

    public int solve(ArrayList<Integer> A) {
        int maxEven = -2147483648;
        int minOdd = 2147483647;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) % 2 == 0){
                if(A.get(i) > maxEven){
                    maxEven = A.get(i);
                }
            }else{
                if(A.get(i) < minOdd){
                    minOdd = A.get(i);
                }
            }
        }
        return maxEven - minOdd;
    }

    public static void main(String[] args) {
        MinimumPicks mp = new MinimumPicks();
        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(6);
//        arr.add(7);

//        arr.add(0);
//        arr.add(2);
//        arr.add(9);

        arr.add(5);
        arr.add(17);
        arr.add(100);
        arr.add(1);

        System.out.println(mp.solve(arr));
    }
}
