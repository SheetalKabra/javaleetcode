import java.util.*;

class Time{
    int start;
    int end;
    Time(int start, int end){
        this.start = start;
        this.end = end;
    }
}
class SortByEndTime implements Comparator<Time>{

    @Override
    public int compare(Time o1, Time o2) {
        return o1.end - o2.end;
    }
}
public class ScalerAd_Greedy_FinishMaxJobs {
    public static void main(String[] args) {
        ScalerAd_Greedy_FinishMaxJobs s = new ScalerAd_Greedy_FinishMaxJobs();
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,5,7,1)), new ArrayList<>(Arrays.asList(7,8,8,8))));
//        System.out.println(s.solve(new ArrayList<>(Arrays.asList(3,2,6)), new ArrayList<>(Arrays.asList(9,8,9))));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,3,0,8,5,5)), new ArrayList<>(Arrays.asList(2,4,6,9,7,9))));
    }
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int N = A.size();
        ArrayList<Time> ar = new ArrayList<>();
        for(int i= 0; i<N; i++){
            ar.add(new Time(A.get(i), B.get(i)));
        }
//        System.out.println("before:");
//        System.out.println(ar);
        Collections.sort(ar, new SortByEndTime());
//        System.out.println("after:");
//        System.out.println(ar);
        int ans = 0;
        int endTime = 0;
        for(int i=0; i<N; i++){
            if(endTime <= ar.get(i).start){
                ans++;
                endTime = ar.get(i).end;
            }

        }
        return ans;
    }
}
