public class Scaler_GCD_EnumeratingGCD {
//    public String solve(String A, String B) {
//
//    }

    public static void main(String[] args) {
        int N = 7430;
        for(int i=1; i*i<=N; i++){
            if(N%i == 0){
                System.out.println(i+","+N/i);
            }
        }
        System.out.println((1876*7430)/gcd(1876, 7430));
    }

    public static int gcd(int A, int B){
        while(A>0){
            int temp = A;
            A = B%A;
            B = temp;
        }
        return B;
    }
}
