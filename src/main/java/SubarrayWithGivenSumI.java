import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSumI {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        int N = A.size();
        int sum=0, l=0, r=0;
        boolean isExists = false;
        while(r<N){
            if(sum == B){
                isExists = true;
                break;
            }else if(sum > B){
                sum = sum - A.get(l);
                l++;
            }else{
                sum = sum + A.get(r);
                r++;
            }
        }
        if(isExists == false){
            if(A.get(N-1) == B){
                result.add(B);
            }else{
                result.add(-1);
            }
        }else{
            for(int i=l; i<r; i++){
                result.add(A.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SubarrayWithGivenSumI s = new SubarrayWithGivenSumI();
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2,3,6,7)), 13));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2,3,4,5)), 5));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,2,4,3,8, 9,7)), 8));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(5,10,20,100,105)), 110));
        System.out.println(s.solve(new ArrayList<>(Arrays.asList(1,1000000000)), 1000000000));
    }
}
