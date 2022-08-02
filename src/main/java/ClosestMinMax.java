import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;

public class ClosestMinMax {

    public static void main(String[] args) {
        
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(4, 4, 4, 4, 4 ));
        ClosestMinMax c = new ClosestMinMax();
        System.out.println(c.solve(A));
    }

    public int solve(ArrayList<Integer> A){
        int N = A.size();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndices = -1;
        int maxIndices = -1;
        if(N<=1){
            return 1;
        }else{
            if(A.get(0) > A.get(1)){
                max = A.get(0);
                min = A.get(1);
            }else{
                max = A.get(1);
                min = A.get(0);
            }

            for(int i=2; i<N; i++){
                if(A.get(i) > max){
                    max = A.get(i);
                }else if(A.get(i) < min){
                    min = A.get(i);
                }
            }
            if(min == max){
                return 1;
            }
            //to get the minIndices and maxIndices
            for(int i=0; i<N; i++){
                if(A.get(i) == min){
                    if(maxIndices == -1){
                        minIndices = i;
                    }else{
                        if(maxIndices >= 0){
                            if(minIndices >= 0){
                                if (Math.abs(maxIndices - minIndices) > Math.abs(maxIndices - i)) {
                                    minIndices = i;
                                }
                            }else{
                                minIndices = i;
                            }
                        }
                    }
                }else if(A.get(i) == max){
                    if(minIndices == -1){
                        maxIndices = i;
                    }else{
                        if(minIndices >= 0){
                            if(maxIndices >= 0){
                                if (Math.abs(maxIndices - minIndices) > Math.abs(minIndices - i)) {
                                    maxIndices = i;
                                }
                            }else{
                                maxIndices = i;
                            }
                        }
                    }
                }
            }
        }
        return Math.abs(minIndices - maxIndices) + 1;
    }

    public int solve12(ArrayList<Integer> A) {
        int N = A.size();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndices = -1;
        int maxIndices = -1;
        if(N<=1){
            return 1;
        }else{
            if (A.get(0) > A.get(1)) {
                max = A.get(0);
                min = A.get(1);
            } else {
                max = A.get(1);
                min = A.get(0);
            }
            for (int i = 2; i < N; i++) {
                if (A.get(i) > max) {
                    max = A.get(i);
                } else if (A.get(i) <= min) {
                    min = A.get(i);
                }
            }
            for (int i = 0; i < N; i++) {
                if (A.get(i) == min) {
                    if (maxIndices == -1) {
                        minIndices = i;
                    } else {
                        if (maxIndices >= 0) {
                            if (minIndices >= 0) {
                                if (Math.abs(maxIndices - minIndices) > Math.abs(maxIndices - i)) {
                                    minIndices = i;
                                }
                            } else {
                                minIndices = i;
                            }
                        }
                    }
                } else if (A.get(i) == max) {
                    if (minIndices == -1) {
                        maxIndices = i;
                    } else if (minIndices >= 0) {
                        if (maxIndices >= 0) {
                            if (Math.abs(maxIndices - minIndices) > Math.abs(minIndices - i)) {
                                maxIndices = i;
                            }
                        } else {
                            maxIndices = i;
                        }
                    }
                }
            }
        }

//        System.out.println("min:" + min);
//        System.out.println("max:" + max);
//
//        System.out.println("minindices:" + minIndices);
//        System.out.println("maxindices:" + maxIndices);
        return Math.abs(minIndices - maxIndices) + 1;
    }

}
