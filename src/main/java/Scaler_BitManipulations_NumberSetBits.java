public class Scaler_BitManipulations_NumberSetBits {
    public static void main(String[] args) {
        System.out.println(numSetBits(12));
    }
    public static int numSetBits(int A) {
        int count = 0;
        while(A!=0){
            if((A&1) == 1){
                count++;
            }
            A = A>>1;
        }
        return count;
    }
}
