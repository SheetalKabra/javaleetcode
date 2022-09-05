public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(499980));
    }
    public static int countPrimes(int n) {
        //Sieve of Eratosthenes
        boolean[] primeNum = new boolean[n+1];
        primeNum[0] = false;
        primeNum[1] = false;
        for(int i=2; i<=n; i++){
            primeNum[i] = true;
        }
        for(int i=2; i<=n; i++){
            if(primeNum[i] == true && (long)i*i<=n){
                System.out.println(i+":"+i*i);
                for(int j=i*i; j<=n; j=j+i){
                    primeNum[j] = false;
                }
            }
        }
        System.out.println("print all primes:");
        for(int i=0; i<n; i++){
            System.out.println(i+"="+primeNum[i]+", ");
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(primeNum[i] == true){
                count++;
            }
        }
        return count;

    }
}
