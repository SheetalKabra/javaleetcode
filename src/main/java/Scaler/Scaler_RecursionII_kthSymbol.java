package Scaler;

public class Scaler_RecursionII_kthSymbol {
    public static void main(String[] args) {
//        System.out.println(solve(2,2));
//        System.out.println(solve(2,1));
        System.out.println(solve(5, 15));
    }
    public static int solve(int A, int B) {
        if(B == 1 && A == 1){
            return 0;
        }
        int parent = (B+1)/2;
        int val_p = solve(A-1, parent);
        if(B%2 == 1){
            return val_p;
        }else{
            return 1-val_p;
        }
    }
}
