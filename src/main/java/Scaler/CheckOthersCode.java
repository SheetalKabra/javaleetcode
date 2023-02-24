package Scaler;

public class CheckOthersCode {

    public static void main(String[] args) {
        CheckOthersCode c = new CheckOthersCode();
        int[] A = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
        c.solve(A, 5);
        //System.out.println(c.solve(A, 1));
    }
    public int[] solve(int[] A, int B) {
        int n = A.length;
        String ans = "";
        if (B == 0) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = i;
            }
            return result;
        } else {
            boolean check = true;
            for (int i = B; i<= n-B-1; i++) {
                check = true;
                for (int j = i-B; j < i+B; j++) {
                    if (A[j] == A[j + 1]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    int s = i;
                    ans += "" + s;
                    System.out.println("ans:"+ans);
                }
            }
            int[] result = new int[ans.length()];
            for (int i = 0; i < ans.length(); i++) {
                result[i] = Integer.parseInt(String.valueOf(ans.charAt(i)));
            }
            return result;
        }
    }
}
