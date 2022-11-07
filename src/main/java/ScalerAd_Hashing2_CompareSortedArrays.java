import java.util.*;

public class ScalerAd_Hashing2_CompareSortedArrays {
    static Map<Integer,Long> hm = new HashMap<>();
    static HashSet<Long> set = new HashSet<>();

    public static void main(String[] args) {
//        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(0,2,4,6));
//        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
//        B.add(x);
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 7, 11, 8, 11, 7, 1)), B));

        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(0, 1, 1, 2));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(x);
        System.out.println(solve(new ArrayList<>(Arrays.asList(1,3,2)), B));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int N = A.size();
        int M = B.size();
        ArrayList<Long> prefixSum = new ArrayList<>();

        for(int i=0; i<N; i++){
            if(i == 0){
                prefixSum.add(i, findHash(A.get(i)));
            }else{
                prefixSum.add(i, (prefixSum.get(i-1)+findHash(A.get(i))));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<M; i++){
            int l1 = B.get(i).get(0);
            int r1 = B.get(i).get(1);
            int l2 = B.get(i).get(2);
            int r2 = B.get(i).get(3);
            long ans1 = 0;
            long ans2 = 0;
            if(l1 == 0){
                ans1 = prefixSum.get(r1);
            }else{
                ans1 = prefixSum.get(r1) - prefixSum.get(l1-1);
            }

            if(l2 == 0){
                ans2 = prefixSum.get(r2);
            }else{
                ans2 = prefixSum.get(r2) - prefixSum.get(l2-1);
            }
            if(ans1 == ans2){
                result.add(1);
            }else{
                result.add(0);
            }
        }
        return result;
    }

    public static long findHash(int A){
        if(hm.containsKey(A)){
            return hm.get(A);
        }else{
            Random rand = new Random();
            long hash = rand.nextLong();
            while(set.contains(hash)){
                hash = rand.nextLong();
            }
            hm.put(A, hash);
            set.add(hash);
            return hash;
        }
    }

    public static ArrayList<Integer> solveUsingHM(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int N = A.size();
        int M = B.size();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<M; i++){
            int l1 = B.get(i).get(0);
            int r1 = B.get(i).get(1);
            int l2 = B.get(i).get(2);
            int r2 = B.get(i).get(3);
            Map<Integer, Integer> part1 = new HashMap<>();
            Map<Integer, Integer> part2 = new HashMap<>();
            for(int j=l1; j<=r1; j++){
                if(part1.containsKey(A.get(j))){
                    part1.put(A.get(j), part1.get(A.get(j))+1);
                }else{
                    part1.put(A.get(j), 1);
                }
            }
            for(int j=l2; j<=r2; j++){
                if(part2.containsKey(A.get(j))){
                    part2.put(A.get(j), part2.get(A.get(j))+1);
                }else{
                    part2.put(A.get(j), 1);
                }
            }
            if(part1.equals(part2)){
                result.add(1);
            }else{
                result.add(0);
            }
        }
        return result;
    }


    public static ArrayList<Integer> solveUsingArrayList(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int M = B.size();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<M; i++){
            int l1 = B.get(i).get(0);
            int r1 = B.get(i).get(1);
            int l2 = B.get(i).get(2);
            int r2 = B.get(i).get(3);
            ArrayList<Integer> part1 = new ArrayList<>();
            ArrayList<Integer> part2 = new ArrayList<>();
            for(int j=l1; j<=r1; j++){
                part1.add(A.get(j));
            }
            Collections.sort(part1);
            for(int j=l2; j<=r2; j++){
                part2.add(A.get(j));
            }
            Collections.sort(part2);
            if(part1.equals(part2)){
                result.add(1);
            }else{
                result.add(0);
            }
        }
        return result;
    }
}
