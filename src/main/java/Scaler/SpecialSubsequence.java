package Scaler;

public class SpecialSubsequence {
    public static void main(String[] args) {
        SpecialSubsequence ss = new SpecialSubsequence();
        System.out.println(ss.solve("ABCGAG"));
    }
    public int solve(String A) {
        long M = 1000000007;
        long count = Long.valueOf(0);
        long countOfG = Long.valueOf(0);;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == 'G'){
                countOfG++;
            }
        }

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == 'A'){
                count = count + countOfG;
            } else if(A.charAt(i) == 'G'){
                countOfG = countOfG - 1;
            }
        }
        return (int)(count%1000000007);
    }
}
