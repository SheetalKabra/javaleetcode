public class Scaler_GCD_LargestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(cpFact(5,10));
    }
    public static int cpFact(int A, int B) {
        int val = 0;
        int max = 1;
        for(int i=1; i*i<=A; i++){
            if(A%i == 0){
                val = (i>B) ? gcd(B, i): gcd(i, B);
                if(val == 1){
                    max = Math.max(max, i);
                }
                if(i != A/i){
                    val = ((A/i)>B) ? gcd(B, (A/i)): gcd((A/i), B);
                    if(val == 1){
                        max = Math.max(max, A/i);
                    }
                }
            }
        }
        return max;
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
