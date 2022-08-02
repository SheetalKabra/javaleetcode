import java.util.ArrayList;

public class FindNthMagicNumber {
    public int solve(int A) {
        ArrayList<Integer> op = new ArrayList<>();
        op.add(0, (int)Math.pow(5, 1));
        int i =1;
        int isPowerOf2;
        int sum;
        int k;
        int singlePower = 0;
        while(i<A){
            isPowerOf2 = (int) (Math.log(i+1)/Math.log(2));
            if ((int) (Math.pow(2, isPowerOf2)) == i+1) {
                int logValue = ((int) (Math.log(i+1)/Math.log(2)));
                sum = (int) Math.pow(5, logValue + 1);
                op.add(i, sum);
                singlePower = sum;
                i++;
            } else {
                sum = singlePower;
                k = 0;
                while(op.get(k) != singlePower){
                    int value = sum +  op.get(k);
                    op.add(i, value);
                    if(i == A-1){
                       return  op.get(A-1);
                    }
                    i++;
                    k++;
                }
            }
        }
        //System.out.println(op);
        return op.get(A-1);
    }

    public static void main(String[] args) {
        FindNthMagicNumber f = new FindNthMagicNumber();
        //System.out.println(f.solve(1));
        System.out.println(f.solve(30));
        System.out.println();

    }
}
