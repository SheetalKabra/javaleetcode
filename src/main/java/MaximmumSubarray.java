import java.util.ArrayList;
import java.util.Arrays;

public class MaximmumSubarray {
    public static void main(String[] args) {
        MaximmumSubarray m = new MaximmumSubarray();
        System.out.println(m.maxSubarray(5, 12, new ArrayList<Integer>(Arrays.asList(2,1,3,4,5))));
        System.out.println(m.maxSubarray(3, 1, new ArrayList<Integer>(Arrays.asList(2,2,2))));
        System.out.println(m.maxSubarray(4, 1, new ArrayList<Integer>(Arrays.asList(2,2,2,1))));
    }

    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        boolean isMax = false;
        for(int s=0; s<A; s++){
            sum = 0;
            for (int e=s; e<A; e++){
                sum = sum + C.get(e);
                System.out.println("sum:"+sum);
                if(sum > max && sum <= B ){
                    max = sum;
                    isMax = true;
                }
            }
        }
        if(isMax){
            return max;
        }else{
            return 0;
        }
    }
}
