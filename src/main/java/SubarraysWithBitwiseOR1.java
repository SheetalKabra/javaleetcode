import java.util.ArrayList;
import java.util.Arrays;

public class SubarraysWithBitwiseOR1 {
    public Long solve1(int A, ArrayList<Integer> B) {
        Long sum = Long.valueOf(0);
        int lastPositionOf1 = -1;
        for(int i=A-1; i>=0 ;i--){
            if(B.get(i) == 1){
                sum = sum + (A-i);
                lastPositionOf1 = i;
            }else{
                if(lastPositionOf1 != -1){
                    sum = sum + (A-i) - (lastPositionOf1 - i);
                }
            }
        }
        return sum;
    }

    //Solution By Rahul Grover
    public Long solve(int A, ArrayList<Integer> B) {
        //1. find out all the subarray
        Long allSubarrayCount = (long)A*(A+1)/2;
        //2. Now find the subarray count having continous zero
        int countContinousZero = 0;
        Long zeroSubarrayCount = Long.valueOf(0);
        boolean isZeroSubarrayCount = true;
        for(int i=0; i<A ;i++){
            if(B.get(i) == 0){
                countContinousZero++;
                isZeroSubarrayCount = false;
            }else{
                if(countContinousZero > 0){
                    zeroSubarrayCount = zeroSubarrayCount + (countContinousZero)*(countContinousZero+1)/2;
                    isZeroSubarrayCount = true;
                    countContinousZero = 0;
                }
            }
        }
        if(isZeroSubarrayCount == false){
            zeroSubarrayCount = zeroSubarrayCount + (countContinousZero)*(countContinousZero+1)/2;

        }
        return allSubarrayCount - zeroSubarrayCount;
    }

    public static void main(String[] args) {
        System.out.println(-40%7);
        System.out.println(-60/7);
//        SubarraysWithBitwiseOR1 s = new SubarraysWithBitwiseOR1();
//        System.out.println(s.solve(3, new ArrayList<>(Arrays.asList(1,0,1))));
//        System.out.println(s.solve(2, new ArrayList<>(Arrays.asList(1,0))));
//        System.out.println(s.solve(1, new ArrayList<>(Arrays.asList(1))));
//        System.out.println(s.solve(1, new ArrayList<>(Arrays.asList(0))));
//        System.out.println(s.solve(5, new ArrayList<>(Arrays.asList(1,0,0,1,0))));
//        System.out.println(s.solve(5, new ArrayList<>(Arrays.asList(0,0,0,0,0))));
//        System.out.println(s.solve(5, new ArrayList<>(Arrays.asList(1,1,1,1,1))));
//        System.out.println(s.solve(5, new ArrayList<>(Arrays.asList(1,1,0,0,0))));
//        System.out.println(s.solve(5, new ArrayList<>(Arrays.asList(0,0,0,1,1))));
    }
}
