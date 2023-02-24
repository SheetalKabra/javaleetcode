package Scaler;

public class Scaler_BitManiII_StrangeEquality {
    // Driver Code
    public static void main(String args[])
    {

        System.out.println(solve(32));
        System.out.println(solve(31));
        System.out.println(solve(3));
//        System.out.println(solve(4));
//        System.out.println(solve(5));
//        System.out.println(solve(6));
//        System.out.println(solve(7));
//        System.out.println(solve(8));
//        System.out.println(solve(9));
//        System.out.println(solve(10));
//        System.out.println(solve(11));
//        System.out.println(solve(12));
//        System.out.println(solve(13));
//        System.out.println(solve(14));
//        System.out.println(solve(15));
//        System.out.println(solve(16));
//        System.out.println(solve(17));
//        System.out.println(solve(18));
//        System.out.println(solve(19));
//        System.out.println(solve(20));
//        System.out.println(solve(21));
//        System.out.println(solve(22));
//        System.out.println(solve(23));
    }

    public static int solve(int A) {
        int val = nextPowerOf2(A);
        return val+val-1-A;
    }

    static int nextPowerOf2(int n)
    {
        int p = 1;
        if (n > 0 && (n & (n - 1)) == 0)
            return n*2;

        while (p < n)
            p <<= 1;

        return p;
    }


}
