public class Scaler_BitManiII_SmallestXOR {
    public static void main(String[] args) {
        System.out.println(solve(3,3));
        System.out.println(solve(15,2));
        System.out.println(solve(0,1));
        System.out.println(solve(4,2));
    }
    public static int solve(int A, int B) {
        int k=31;
        int x = 0;
        if(A > 0){
            while(B > 0 && k>=0){
//                if(A == 0){
//                    System.out.println("0000");
//                    x = x | (1<<k);
//                    System.out.println("x:"+x);
//                    B--;
//                }else
                    if(((1<<k)&A) !=0){
                    B--;
                    A = A^(1<<k);
                    x = x | (1<<k);
                    //System.out.println("k:"+k);
                }
                k--;
            }
        }
//System.out.println("B:"+B+", k:"+k);
        if(B > 0){
            k = 0;
            while(B > 0){
                if(((1<<k)&x) == 0){
                    x = x | (1<<k);
                    B--;
                }
                k++;
            }
        }

        return x;
    }
}
