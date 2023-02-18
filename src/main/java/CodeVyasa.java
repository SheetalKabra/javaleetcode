import java.util.*;

public class CodeVyasa {

    public static void main(String[] args) {

        String s = "java";
        System.out.println(s.hashCode());
        String s1 = new String("java");
        System.out.println(s1.hashCode());

        int[] arr = {1, 1, 2, 2, 3, 3, 7, 7, 11, 11, 17, 17};
        //op: {1, 2, 3, 7, 11}, each can have atmax 1 duplicate
        List<Integer> op = new ArrayList<>();
        int i = 0;
        int N = arr.length;
        while (i < N - 1) {
            op.add(arr[i]);
            if (arr[i] == arr[i + 1]) {
                i = i + 2;
            } else {
                i = i + 1;
            }
        }
        if (i == N - 1) {
            op.add(arr[i]);
        }
        System.out.println(op);

    }

    public int search(){
        int[] arr = {1, 7, 9, 19, 29, 88};
        //search number, if number is present return index else -1
        int num = 89;
        int l = 0;
        int r = arr.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == num){
                System.out.println(mid);
                return mid;
            }else if(arr[mid] > num){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        System.out.println("-1");
        return -1;
    }
}

