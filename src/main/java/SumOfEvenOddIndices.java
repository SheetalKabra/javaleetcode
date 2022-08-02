import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEvenOddIndices {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,-2-2,4,0));
        SumOfEvenOddIndices s = new SumOfEvenOddIndices();
        System.out.println(s.solve(input));

//        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,1,1));
//        SumOfEvenOddIndices s = new SumOfEvenOddIndices();
//        System.out.println(s.solve(input));
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> pfeven = new ArrayList<Integer>(N);
        ArrayList<Integer> pfodd = new ArrayList<Integer>(N);
        //1. for even prfix sum array
        pfeven.add(A.get(0));
        for(int i=1; i<N; i++){
            if(i%2 == 0){
                pfeven.add(pfeven.get(i-1) + A.get(i));
            }else{
                pfeven.add(pfeven.get(i-1));
            }
        }
        //2. for odd prfix sum array
        pfodd.add(0);
        for(int i=1; i<N; i++){
            if(i%2 == 1){
                pfodd.add(pfodd.get(i-1) + A.get(i));
            }else{
                pfodd.add(pfodd.get(i-1));
            }
        }

        int sumEven = 0;
        int sumOdd = 0;
        int count = 0;
        for(int i=0; i<N; i++){
            if(i == 0){
                sumEven = pfodd.get(N-1) - pfodd.get(i);
                sumOdd =  pfeven.get(N-1) - pfeven.get(i);
            }else{
                sumEven = pfeven.get(i-1) + pfodd.get(N-1) - pfodd.get(i);
                sumOdd =  pfodd.get(i-1) + pfeven.get(N-1) - pfeven.get(i);
            }
            if(sumEven == sumOdd){
                count++;
            }
        }
        return count;
    }

    public int solve1(ArrayList<Integer> A){
        int N = A.size();
        ArrayList<Integer> prefixSum = new ArrayList<Integer>(N);
        int lastOddIndices, lastEvenIndices;
        int sumOfEvenIndices = 0, sumOfOddIndices = 0, count=0;
        prefixSum.add(A.get(0));
        prefixSum.add(A.get(1));
        for(int i=2; i<N; i++){
            prefixSum.add(prefixSum.get(i-2) + A.get(i));
        }
        if(N%2 == 0){
            lastOddIndices = N-1;
            lastEvenIndices = N-2;
        }else{
            lastOddIndices = N-2;
            lastEvenIndices = N-1;
        }
        for(int i=0; i<N; i++){
            if(i%2 == 0){
                //removing index is even
                //S(e) = PF(rm-2) + PF(lastOddIndices) - PF(rm-1)
                //S(o) = PF(rm-1) + PF(lastEvenIndices) - PF(rm)
                //sum of even indices
                if(i-2 < 0){
                    if(i-1 < 0){
                        sumOfEvenIndices = prefixSum.get(lastOddIndices);
                    }else{
                        sumOfEvenIndices = prefixSum.get(lastOddIndices) - prefixSum.get(i-1);
                    }
                }else{
                    sumOfEvenIndices = prefixSum.get(i-2) + prefixSum.get(lastOddIndices) - prefixSum.get(i-1);
                }
                //sum of odd indices
                if(i-1< 0){
                    sumOfOddIndices = prefixSum.get(lastEvenIndices) - prefixSum.get(i);
                }else{
                    sumOfOddIndices = prefixSum.get(i-1) + prefixSum.get(lastEvenIndices) - prefixSum.get(i);
                }
            }else{
                //removing index is odd
                //S(e) = PF(rm-1) + PF(lastOddIndices) - PF(rm)
                //S(o) = PF(rm-2) + PF(lastEvenIndices) - PF(rm-1)
                //sum of even indices in case removing index is odd
                if(i-1 < 0){
                    sumOfEvenIndices = prefixSum.get(lastOddIndices) - prefixSum.get(i);
                }else{
                    sumOfEvenIndices = prefixSum.get(i-1) + prefixSum.get(lastOddIndices) - prefixSum.get(i);
                }
                //sum of odd indices in case removing index is odd
                if(i-2<0){
                    if(i-1<0){
                        sumOfOddIndices = prefixSum.get(lastEvenIndices);
                    }else{
                        sumOfOddIndices = prefixSum.get(lastEvenIndices) - prefixSum.get(i-1);
                    }
                }else{
                    sumOfOddIndices = prefixSum.get(i-2) + prefixSum.get(lastEvenIndices) - prefixSum.get(i-1);
                }
            }

            //here
            if(sumOfEvenIndices == sumOfOddIndices){
                count++;
            }
        }
        return count;

    }

//    public int solve(ArrayList<Integer> A){
//        int N = A.size();
//        ArrayList<Integer> prefixSum = new ArrayList<Integer>(N);
//        int lastOddIndices, lastEvenIndices;
//        int sumOfEvenIndices = 0, sumOfOddIndices = 0, count=0;
//        prefixSum.add(A.get(0));
//        prefixSum.add(A.get(1));
//        for(int i=2; i<N; i++){
//            prefixSum.add(prefixSum.get(i-2) + A.get(i));
//        }
//        System.out.println("Prefix Sum:");
//        for(int i=0; i<N; i++){
//            System.out.print(prefixSum.get(i)+" ");
//        }
//        System.out.println();
//        if(N%2 == 0){
//            lastOddIndices = N-1;
//            lastEvenIndices = N-2;
//        }else{
//            lastOddIndices = N-2;
//            lastEvenIndices = N-1;
//        }
//        System.out.println("lastOddIndices: "+lastOddIndices);
//        System.out.println("lastEvenIndices: "+lastEvenIndices);
//        for(int i=0; i<N; i++){
//            if(i%2 == 0){
//                //removing index is even
//                //S(e) = PF(rm-2) + PF(lastOddIndices) - PF(rm-1)
//                //S(o) = PF(rm-1) + PF(lastEvenIndices) - PF(rm)
//                //sum of even indices
//                if(i-2 < 0){
//                    if(i-1 < 0){
//
//                        sumOfEvenIndices = prefixSum.get(lastOddIndices);
//
//                    }else{
//                        sumOfEvenIndices = prefixSum.get(lastOddIndices) - prefixSum.get(i-1);
//                    }
//                }else{
//                    sumOfEvenIndices = prefixSum.get(i-2) + prefixSum.get(lastOddIndices) - prefixSum.get(i-1);
//                }
//                //sum of odd indices
//                if(i-1< 0){
//                    sumOfOddIndices = prefixSum.get(lastEvenIndices) - prefixSum.get(i);
//                }else{
//                    sumOfOddIndices = prefixSum.get(i-1) + prefixSum.get(lastEvenIndices) - prefixSum.get(i);
//                }
//            }else{
//                //removing index is odd
//                //S(e) = PF(rm-1) + PF(lastOddIndices) - PF(rm)
//                //S(o) = PF(rm-2) + PF(lastEvenIndices) - PF(rm-1)
//                //sum of even indices in case removing index is odd
//                if(i-1 < 0){
//                    sumOfEvenIndices = prefixSum.get(lastOddIndices) - prefixSum.get(i);
//                }else{
//                    sumOfEvenIndices = prefixSum.get(i-1) + prefixSum.get(lastOddIndices) - prefixSum.get(i);
//                }
//                //sum of odd indices in case removing index is odd
//                if(i-2<0){
//                    if(i-1<0){
//                        sumOfOddIndices = prefixSum.get(lastEvenIndices);
//                    }else{
//                        sumOfOddIndices = prefixSum.get(lastEvenIndices) - prefixSum.get(i-1);
//                    }
//                }else{
//                    sumOfOddIndices = prefixSum.get(i-2) + prefixSum.get(lastEvenIndices) - prefixSum.get(i-1);
//                }
//            }
//            System.out.println("sum of even indices:"+sumOfEvenIndices);
//            System.out.println("sum of odd indices:"+sumOfOddIndices);
//            System.out.println("========");
//            //here
//            if(sumOfEvenIndices == sumOfOddIndices){
//                count++;
//            }
//        }
//        return count;
//    }
}
