import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScalerAd_BinarySearch3_AllocateBooks {

    public static void main(String[] args) {
//        System.out.println(books(new ArrayList<>(Arrays.asList(12, 34, 67, 90)), 2));
//        System.out.println(books(new ArrayList<>(Arrays.asList(31, 14, 19, 75)), 12));
        System.out.println(books(new ArrayList<>(Arrays.asList(73, 58, 30, 72, 44, 78, 23, 95)), 5));
    }
    public static int books(ArrayList<Integer> A, int B) {
        int N = A.size();
        int l = Collections.max(A);
        int r = sum(A);
        int ans = -1;
        while(l <= r){
            int mid = (l+r)/2;
            System.out.println("mid:"+mid);
            if(isAllocate(A, mid, B)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isAllocate(ArrayList<Integer> A, int pages, int B){
        int N = A.size();
        int pagesAllocate = 0;
        if(Collections.max(A) > pages){
            return false;
        }
        for(int i=0; i<N; i++){
            if((pagesAllocate + A.get(i)) <= pages){
                pagesAllocate += A.get(i);
                System.out.println("if:pagesAllocate:"+pagesAllocate);
            }else{
                pagesAllocate = A.get(i);
                System.out.println("pagesAllocate:"+pagesAllocate);
                B--;
                System.out.println("B:"+B);
                if(B == 0){
                    return false;
                }
            }
        }
        if(B == 0){
            return true;
        }
        return false;
    }

    public static int sum(ArrayList<Integer> A){
        int sum = 0;
        for(int i=0; i<A.size(); i++){
            sum += A.get(i);
        }
        return sum;
    }
}
