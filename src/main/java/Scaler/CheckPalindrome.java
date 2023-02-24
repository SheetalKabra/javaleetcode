package Scaler;

public class CheckPalindrome {
    public int solve(String A) {
        System.out.println(A);
        int N = A.length();
        //1. Assumption
        //3. Terminal condition
        if(N == 0 || N == 1){
            return 1;
        }
        //2. Main condition:
        if(A.charAt(0) == A.charAt(N-1)){
            return solve(A.substring(1, N-1));
        }
        return 0;
    }

    public static void main(String[] args) {
        CheckPalindrome c = new CheckPalindrome();
        System.out.println(c.solve("naman"));
        System.out.println(c.solve("strings"));
        System.out.println(c.solve("raar"));
        System.out.println(c.solve("level"));
    }
}
