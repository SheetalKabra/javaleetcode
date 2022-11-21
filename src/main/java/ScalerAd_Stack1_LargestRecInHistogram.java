import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ScalerAd_Stack1_LargestRecInHistogram{
        public static int largestRectangleArea(ArrayList<Integer> A) {
            //l[N] = index of first smallest bar on left
            //r[N] = index of first smallest bar on right
            int N = A.size();
            Stack<Integer> stl = new Stack<>();
            Stack<Integer> str = new Stack<>();
            ArrayList<Integer> l = new ArrayList<>();
            ArrayList<Integer> r = new ArrayList<>();
            for(int i=0; i<N; i++){
                r.add(i, 0);
            }
            //for l[N]
            for (int i = 0; i < N; i++) {
                while (!stl.empty() && A.get(stl.peek()) >= A.get(i)) {
                    stl.pop();
                }
                if (stl.empty()) {
                    l.add(-1);
                } else {
                    l.add(stl.peek());
                }
                stl.push(i);
            }

            //for r[N]
            for (int i = N - 1; i >= 0; i--) {
                while (!str.empty() && A.get(str.peek()) >= A.get(i)) {
                    str.pop();
                }
                if (str.empty()) {
                    r.set(i, N);
                } else {
                    r.set(i, str.peek());
                }
                str.push(i);
            }
            long ans = Integer.MIN_VALUE;
            for(int i=0; i<N; i++){
                ans = Math.max(ans, (long)A.get(i)*(r.get(i) - l.get(i) - 1));
            }
            return  (int)ans;
        }

    public static void main(String[] args) {
//        System.out.println(largestRectangleArea(new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3))));
        System.out.println(largestRectangleArea(new ArrayList<>(Arrays.asList(2))));
    }
}
