package Scaler;

public class ScalerAd_Combinatorics_SortedPermutationRant {
    public static void main(String[] args) {
        System.out.println(findRank("dbeca"));
    }
    public static int findRank(String A) {
        int N = A.length();
        int[] ch = new int[N];
        int ascii_a = 97;
        for(int i=0; i<N; i++){
            int ascii = A.charAt(i) - ascii_a;
            ch[i] = ascii;
        }
        int total = 0;
        int m = 1000003;
        for(int i=0; i<N; i++){
            int comb = 0;
            for(int j=i+1; j<N; j++){
                if(ch[j] < ch[i]){
                    comb++;
                }
            }
            total += comb*(fact(N-1-i));
            total %= m;
        }
        return total+1;
    }

    public static int fact(int N){
        int m = 1000003;
        if(N <= 1){
            return 1;
        }
        return (N*fact(N-1))%m;
    }
}
