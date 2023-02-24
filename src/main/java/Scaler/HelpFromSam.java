package Scaler;

public class HelpFromSam {
    public int solve(int A) {
        //basically we need to count set bits.
        int count = 0;
        for(int i=0; i<32; i++){
            if((A&(1<<i)) != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HelpFromSam h = new HelpFromSam();
        System.out.println(h.solve(5));
        System.out.println(h.solve(3));
        System.out.println(h.solve(90));
        System.out.println(h.solve(117));
        System.out.println(h.solve(8));
        System.out.println(h.solve(16));
        System.out.println(h.solve(128));
        System.out.println(h.solve(1000));
    }
}
