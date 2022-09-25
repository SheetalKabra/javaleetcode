import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Scaler_PrimeNo_DistinctPrimes {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1,2,3,4))));
//        System.out.println(solve1(new ArrayList<>(Arrays.asList(96, 98, 5, 41, 80))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(96, 98, 5, 41, 80))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(63, 52, 28, 72, 9, 62, 79, 71, 43, 15, 82, 21, 10, 12, 38, 96, 58, 99, 59, 100, 10, 38, 92, 30, 24, 3, 49, 17, 2, 63, 54, 18, 71, 7, 65, 87, 82, 31, 48, 39, 100, 82, 15, 60, 44, 84, 43, 5, 63, 17, 100, 94, 62, 26, 35, 29))));
    }

    public static int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.size(); i++){
            max = Math.max(max, A.get(i));
        }
        //System.out.println(max);
        ArrayList<Integer> primes = new ArrayList<>();
        //int[] primes = new int[max+1];
        primes.add(0, 0);
        primes.add(1, 0);

        for(int i=2; i<=max; i++){
            primes.add(i,1);
        }
        //System.out.println(primes);
        for(int i=2; i<=max; i++){
            if(primes.get(i) == 1 && (long)i*i <= max){
                for(int j=i*i; j<=max; j+=i){
                    primes.set(j, 0);
                }
            }
        }
        System.out.println(primes);

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<A.size(); i++){
            for(int j=1; j*j<=A.get(i); j++){
                if(A.get(i)%j == 0){
                    System.out.println("j:"+j+", A/j:"+A.get(i)/j);
                    if(j == A.get(i)/j){
                        if(primes.get(j) == 1){
                            System.out.println("equals");
                            hs.add(j);
                        }
                    }else{
                        if(primes.get(j) == 1){
                            System.out.println("not equals:"+j);
                            hs.add(j);
                        }
                        if(primes.get(A.get(i)/j) == 1){
                            System.out.println("not equals:"+j);
                            hs.add(A.get(i)/j);
                        }
                    }
                }
            }
        }
        System.out.println(hs);
        return hs.size();

    }



    public static int solve1(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.size(); i++){
            max = Math.max(max, A.get(i));
        }
        System.out.println(max);
        int[] primes = new int[max+1];
        primes[0] = 0;
        primes[1] = 0;
        for(int i=2; i<=max; i++){
            primes[i] = 1;
        }

        for(int i=2; i<=max; i++){
            if(primes[i] == 1){
                for(int j=i*i; j<=max; j++){
                    primes[j] = 0;
                }
            }
        }
        for(int i=0;i<=max;i++){
            System.out.println("i:"+i+","+primes[i]);
        }
        int count = 0;
        for(int i=0; i<A.size(); i++){
            //System.out.println("i:"+i);
            if(primes[A.get(i)] == 1){
                count++;
                primes[A.get(i)] = -1;
            }
        }
        return count;
    }
}
