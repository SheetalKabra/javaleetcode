import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAdjacentElement {
    public int solve(ArrayList<Integer> A) {
        int evenCount = 0;
        int oddCount = 0;
        for (Integer integer : A) {
            if (integer % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (evenCount == 0 || oddCount == 0) {
            return 0;
        }
        return Math.min(evenCount, oddCount);
    }

    public static void main(String[] args) {
        SumOfAdjacentElement s = new SumOfAdjacentElement();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(6, 7, 4, 7, 8));
//        ArrayList<Integer> arrayListTemp = (ArrayList<Integer>) Arrays.asList(6,7,4,7,8);
        ArrayList<Integer> arrayList1 = new ArrayList<>() {{
            add(5);
            add(6);
            add(7);
        }};

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        integers.add(7);

        System.out.println(s.solve(arrayList));
        System.out.println(s.solve(integers));
    }
}
