import java.util.ArrayList;
import java.util.Arrays;

public class ScalerAd_TwoPointers_SubarrayWithGivenSum {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(5,5,3,1,4)), 5));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(5, 10, 20, 100, 105)), 110));
        System.out.println(solve(new ArrayList<>(Arrays.asList(42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37)), 100));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        System.out.println(A.get(16));
        System.out.println(A.get(17));
        int l=0, r=0;
        int sum = A.get(0);
        while(r<A.size()){
            if(sum == B){
                return new ArrayList(Arrays.asList(l+1,r+1));
//                l++;
//                r++;
            }else if(sum < B){
                r++;
                System.out.println("r:"+r);
                if(r<A.size()){
                    sum += A.get(r);
                }

                System.out.println("sumr:"+sum);
            }else if(sum > B){
                sum -= A.get(l);
                l++;
                System.out.println("l:"+l);
                System.out.println("suml:"+sum);
            }
        }
        return new ArrayList(Arrays.asList(-1));
    }
}
