package Scaler;

public class Scaler_PrimeNo_LuckyNumbers {

    public static void main(String[] args) {
        System.out.println(solve(10000));
    }

    public static int solve(int A) {
        int[] countPrime = new int[A+1];
        for(int i=0;i<=A;i++){
            countPrime[i] = 0;
        }
        //System.out.println("initial arr:");
        for(int i=0;i<=A;i++){
            //System.out.print(countPrime[i]+",");
        }
        for(int i=2;i<=A;i++){
            if(countPrime[i] == 0){
                for(int j=i; j<=A; j=j+i){
                    countPrime[j] = countPrime[j]+1;
                }
            }
        }
        System.out.println("");
        //System.out.println("updated arr:");
        int luckyNumbers = 0;
        for(int i=0;i<=A;i++){
            if(countPrime[i] == 2){
                luckyNumbers++;
            }
            System.out.print("i="+i+","+countPrime[i]+",");
        }
        return luckyNumbers;
    }
}
