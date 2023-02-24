package Scaler;

public class ModString {
    public static void main(String[] args) {
        ModString m = new ModString();
        System.out.println(m.findMod("43535321", 47));

    }

    public int findMod(String A, int B) {
        int N = A.length();

        long sum = 0;
        long value = 1;
        for(int i=N-1; i>=0; i--){
            System.out.println(A.charAt(i)-'0');
            //int digit = (Integer.parseInt(String.valueOf(A.charAt(i))))%B;
            sum = (sum + (A.charAt(i)-'0')*value)%B;
            value = ((10%B)*value)%B;
        }
        return (int)sum;
    }
}
