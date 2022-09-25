public class Scaler_ModularArith_PrimeModuloInverse {
    public static void main(String[] args) {
        System.out.println(solve(21,17));
    }
    public static int solve(int A, int B) {
        //I can say A^-1 mod B = (A^B-2)%B using Fermat's lille theorem
        //Fermat's lille theorem is : a^P-1 %P =1, where P is prime number only
        //System.out.println((int)Math.pow(A, B-2));
        System.out.println(((int)Math.pow(A, B-2))%17);
        //System.out.println((int)(Math.pow(A, B-2)%17));
        return ((int)Math.pow(A, B-2))%B;
    }
}
