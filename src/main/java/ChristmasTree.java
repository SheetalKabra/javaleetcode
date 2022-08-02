import java.util.ArrayList;
import java.util.Arrays;

public class ChristmasTree {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        int sum = 0;
        int minCost = Integer.MAX_VALUE;
        boolean isCombinationExists = false;
        for (int i = 0; i <= N - 3; i++) {
            for (int j = i + 1; j <= N - 2; j++) {
                int twoTreeSum = B.get(i) + B.get(j);
                if (A.get(i) < A.get(j) && twoTreeSum<minCost){
                    for (int k = j + 1; k <= N - 1; k++) {
                        if (A.get(j) < A.get(k)) {
                            isCombinationExists = true;
                            sum = twoTreeSum + B.get(k);
                            if (sum < minCost) {
                                minCost = sum;
                            }
                        }
                    }
                }
            }
        }
        if (isCombinationExists) {
            return minCost;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        ChristmasTree c = new ChristmasTree();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(c.solve(A, B));
        System.out.println("========");
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1,6,4,2,6,9));
        ArrayList<Integer> B1 = new ArrayList<>(Arrays.asList(2,5,7,3,2,7));
        System.out.println(c.solve(A1, B1));
        System.out.println("========");
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        ArrayList<Integer> B2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(c.solve(A2, B2));
        System.out.println("========");
        ArrayList<Integer> A3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> B3 = new ArrayList<>(Arrays.asList(1,21,13,4,5));
        System.out.println(c.solve(A3, B3));
        System.out.println("========");
        ArrayList<Integer> A4 = new ArrayList<>(Arrays.asList(2, 4, 5, 4, 10));
        ArrayList<Integer> B4 = new ArrayList<>(Arrays.asList(40, 30, 20, 10, 40));
        System.out.println(c.solve(A4, B4));
    }
}
