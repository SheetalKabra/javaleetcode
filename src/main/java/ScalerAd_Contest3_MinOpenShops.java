import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScalerAd_Contest3_MinOpenShops {
    public static int solve(int A, int B, ArrayList<ArrayList<Integer>> C, int D, ArrayList<ArrayList<Integer>> E) {
        Map<Integer, Integer> demandItems = new HashMap<>();
        Map<Integer, ArrayList<Integer>> availableItems = new HashMap<>();
        for(int i=0;i<E.size();i++){
            demandItems.put(E.get(i).get(0), 1);
        }

        for(int i=0; i<C.size(); i++){
            if(availableItems.containsKey(C.get(i).get(1))){
                ArrayList<Integer> op = availableItems.get(C.get(i).get(1));
                op.add(C.get(i).get(0));
                availableItems.put(C.get(i).get(1), op);
            }else{
                availableItems.put(C.get(i).get(1), new ArrayList(Arrays.asList(C.get(i).get(0))));
            }
        }
        System.out.println(availableItems);
        return 1;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        C.add(0, new ArrayList<>(Arrays.asList(1,2)));
        C.add(1, new ArrayList<>(Arrays.asList(1,3)));
        C.add(2, new ArrayList<>(Arrays.asList(2,1)));
        C.add(3, new ArrayList<>(Arrays.asList(2,2)));
        C.add(4, new ArrayList<>(Arrays.asList(3,4)));

        ArrayList<ArrayList<Integer>> E = new ArrayList<>();
        E.add(0, new ArrayList<>(Arrays.asList(1,3)));
        E.add(1, new ArrayList<>(Arrays.asList(1,2)));
        E.add(2, new ArrayList<>(Arrays.asList(2,3)));
        E.add(3, new ArrayList<>(Arrays.asList(2,1)));
        E.add(4, new ArrayList<>(Arrays.asList(4,1)));
        System.out.println(solve(4,5,C, 4, E));
    }
}
