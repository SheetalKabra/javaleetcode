import java.util.ArrayList;
import java.util.Arrays;

public class BitCompression {
    public int compressBits(ArrayList<Integer> A) {
        int N = A.size();
        int temp;
        for(int i=0 ;i<N; i++){
            for(int j=i+1; j<N; j++){
                temp = A.get(i);
                A.set(i, A.get(i)&A.get(j));
                A.set(j, temp|A.get(j));
            }
        }
        //now xor of all all the elements
        int xor = 0;
        for(int i=0; i<N; i++){
            xor = xor^A.get(i);
        }
        return xor;
    }

    public static void main(String[] args) {
        BitCompression b = new BitCompression();
        System.out.println(b.compressBits(new ArrayList<>(Arrays.asList(1,3,5))));
        System.out.println(b.compressBits(new ArrayList<>(Arrays.asList(1,1,1))));
        System.out.println(b.compressBits(new ArrayList<>(Arrays.asList(0,0,0))));
        System.out.println(b.compressBits(new ArrayList<>(Arrays.asList(0))));
        System.out.println(b.compressBits(new ArrayList<>(Arrays.asList(1))));
        System.out.println(b.compressBits(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7))));
    }
}
